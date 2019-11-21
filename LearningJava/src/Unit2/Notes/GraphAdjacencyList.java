package Unit2.Notes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//TODO
public class GraphAdjacencyList {
    public int numVertices = 0;
    public boolean hasKeys;
    public boolean bidirectional;
    public Map<String,Integer> keys;
    private Map<Integer, ArrayList<Integer>> adjacencyList;;

    GraphAdjacencyList() {
        new GraphAdjacencyList(null,false);
    }

    GraphAdjacencyList(boolean bidirectional) {
        new GraphAdjacencyList(null, bidirectional);
    }

    GraphAdjacencyList(String[] keys) {
        new GraphAdjacencyList(keys, false);
    }

    GraphAdjacencyList(String[] keys, boolean bidirectional) {
        this.adjacencyList = new HashMap<>();
        this.hasKeys = (keys != null);
        for (int i = 0; i < keys.length; i++) {
            this.keys.put(keys[i],i);
        }
        this.bidirectional = bidirectional;
    }

    private int keyToIndex(String key) {
        int result;
        if (this.keys.containsKey(key)) {
            result = this.keys.get(key);
        } else {
            result = -1;
            System.err.println("Key not found!");
        }
        return result;
    }

    public void addEdge(String from, String to) {
        for (String srt: new String[]{from, to }) {

        }
        this.addEdge(from, to, 1);
    }

    public void addEdge(int from, int to) {
        addEdge(from, to, 1);
    }

    public void addEdge(String from, String to, int weight) {
        int fromIndex = keyToIndex(from);
        int toIndex = keyToIndex(to);

        if (!this.hasKeys) {
            throw new UnsupportedOperationException("Cannot use string keys if no keys provided.");
        }

        if (fromIndex < 0) {
            throw new IndexOutOfBoundsException("Key " + from + " doest not exist.");
        }

        if (toIndex < 0) {
            throw new IndexOutOfBoundsException("Key " + to + " does not exist.");
        }

        addEdge(fromIndex, toIndex, weight);
    }


    public void addEdge(int from, int to, int weight) {
        if (!(0 <= from & from < this.numVertices)) {
            throw new IndexOutOfBoundsException("Index " + from + " out of bounds.");
        }
        if (!(0 <= to & to < this.numVertices)) {
            throw new IndexOutOfBoundsException("Index " + to + " out of bounds.");
        }

        adjMatrix[from][to] = weight;
        if (bidirectional) adjMatrix[to][from] = weight;
    }

    private String padTo(String str, int length) {
        while (str.length() < length) {
            str += " ";
        }
        return str;
    }

    public void print() {
        int length = 8;
        if (this.hasKeys) {
            System.out.printf("\t\t");
            for (String key : keys) {
                System.out.printf("%s\t", padTo(key, length));
            }
            System.out.printf("\n");
        }
        Iterator<String> iter = null;
        if (this.hasKeys) iter = this.keys.keySet().iterator();
        for (int i)
        for (int i = 0; i < numVertices; i++) {
            if (this.hasKeys) {
                System.out.printf("%s\t", padTo(iter.next(), length));
            }
            for (int j = 0; j < numVertices; j++) {
                System.out.printf("%d\t\t\t", adjMatrix[i][j]);
            }
            System.out.printf("\n");
        }
    }
}

