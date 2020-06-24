package Unit7;

import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversal {
    public static void main(String[] args) {
        String[] keys = {"A", "B", "C", "D", "E", "F", "G"};
        GraphAdjacencyMatrix graph = new GraphAdjacencyMatrix(7, keys);
        String graphNodes =
                "A:B D E\n" +
                "B:A C D\n" +
                "C:B G\n" +
                "D:A B E F\n" +
                "E:A D\n" +
                "F:D\n" +
                "G:C\n";
        graph.parseGraph(graphNodes);
        System.out.println("The adjacency matrix is:");
        graph.print();

        String[] visited = depthFirstTraversal(graph, "A");
        System.out.println("Using depth-first traversal, the nodes were visited in the following order: ");
        for (String node: visited) {
            System.out.printf("%s, ",node);
        }
        System.out.printf("\b\b \n\n");

        visited = breadthFirstTraversal(graph, "A");
        System.out.println("Using breadth-first traversal, the nodes were visited in the following order: ");
        for (String node: visited) {
            System.out.printf("%s, ",node);
        }
        System.out.printf("\b\b \n");
    }

    public static String[] depthFirstTraversal(GraphAdjacencyMatrix graph, String startNode) {
        int[] visited = new int[graph.numVertices];
        for (int i = 0; i < graph.numVertices; i++) { visited[i] = -1; }
        visited = depthFirstTraversal(graph, graph.keyToIndex(startNode), visited, 0);
        String[] strVisited = new String[graph.numVertices];
        for (int i = 0; i < graph.numVertices; i++) {
            strVisited[visited[i]] = graph.indexToKey(i);
        }
        return strVisited;
    }

    static int[] depthFirstTraversal(GraphAdjacencyMatrix graph, int startNode, int[] visited, int depth) {
        int[] connected = graph.getConnected(startNode);
        if (depth==0) { visited[startNode] = 0; }
        for (int vertex: graph.getConnected(startNode)) {
            if (visited[vertex] == -1 && vertex != startNode) {
                int max = -1;
                for (int value: visited) {
                    if (value > max) { max = value; }
                }
                visited[vertex] = max + 1;
                visited = depthFirstTraversal(graph, vertex, visited, depth+1);
            }
        }
        return visited;
    }

    public static String[] breadthFirstTraversal(GraphAdjacencyMatrix graph, String startNode) {
        int startNodeIndex = graph.keyToIndex(startNode);
        int[] visited = new int[graph.numVertices];
        for (int i = 0; i < graph.numVertices; i++) { visited[i] = -1; }
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(startNodeIndex);
        int node;
        int max = 0;
        while (!queue.isEmpty()) {
            node = queue.remove();
            visited[node] = max;
            max ++;
            for (int connected: graph.getConnected(node)) {
                if (visited[connected] == -1 && !queue.contains(connected)) {
                    queue.add(connected);
                }
            }
        }
        String[] strVisited = new String[graph.numVertices];
        for (int i = 0; i < graph.numVertices; i++) {
            strVisited[visited[i]] = graph.indexToKey(i);
        }
        return strVisited;
    }


}
