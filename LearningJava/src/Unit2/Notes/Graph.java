package Unit2.Notes;

public class Graph {
    public static void main(String[] args) {
        String[] keys = {"Bob", "Alice", "Mark", "Rob", "Maria"};
        GraphAdjacencyMatrix graphAdjacencyMatrix = new GraphAdjacencyMatrix(5, keys);

        // Bob
        graphAdjacencyMatrix.addEdge("Bob", "Alice");
        graphAdjacencyMatrix.addEdge("Bob", "Rob");

        // Alice
        graphAdjacencyMatrix.addEdge(1, 2);
        graphAdjacencyMatrix.addEdge(1, 4);

        // Mark
        graphAdjacencyMatrix.addEdge(2, 3);

        // Rob
        graphAdjacencyMatrix.addEdge(3, 4);

        graphAdjacencyMatrix.print();
    }
}


