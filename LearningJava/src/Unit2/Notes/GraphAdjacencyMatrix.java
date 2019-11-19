package Unit2.Notes;

public class GraphAdjacencyMatrix {
    public static void main(String[] args) {
        String[] keys = {"Bob", "Alice", "Mark", "Rob", "Maria"};
        Graph graph = new Graph(5, keys);

        // Bob
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");

        // Alice
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);

        // Mark
        graph.addEdge(2, 3);

        // Rob
        graph.addEdge(3, 4);

        graph.print();
    }
}


