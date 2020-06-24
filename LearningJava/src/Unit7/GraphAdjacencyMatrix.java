package Unit7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@SuppressWarnings("SameParameterValue")
public class GraphAdjacencyMatrix {
    public int numVertices;
    private boolean hasKeys;
    public boolean bidirectional;
    public Map<String, Integer> keys = new HashMap<>();
    private int[][] adjMatrix;
    private String[] rawKeys;

    GraphAdjacencyMatrix(int numVertices) { this(numVertices, new String[]{}, false); }

    GraphAdjacencyMatrix(int numVertices, boolean bidirectional) { this(numVertices, new String[]{}, bidirectional); }

    GraphAdjacencyMatrix(int numVertices, String[] keys) { this(numVertices, keys, false); }

    GraphAdjacencyMatrix(int numVertices, String[] keys, boolean bidirectional) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
        this.hasKeys = (keys.length != 0);
        for (int i = 0; i < keys.length; i++) {
            this.keys.put(keys[i],i);
        }
        this.bidirectional = bidirectional;
        assert keys.length == numVertices;
        rawKeys = keys;
    }

    public int keyToIndex(String key) {
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
        this.addEdge(from, to, 1);
    }

    public void addEdge(int from, int to) { addEdge(from, to, 1); }

    public void addEdge(String from, String to, int weight) {
        int fromIndex = getIndex(from);
        int toIndex = getIndex(to);

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
        if (bidirectional) {
            adjMatrix[to][from] = weight;
        }
    }

    public int[] getConnected(String key) {
        return getConnected(getIndex(key)); }

    public int[] getConnected(int index) {
        int[] adjacent =  this.adjMatrix[index];
        int count = 0;
        for (int value: adjacent) {
            count += (value==1) ? 1 : 0;;
        }
        int[] result = new int[count];
        count = 0;
        int value;
        for (int i = 0; i < this.numVertices; i++) {
            value = adjacent[i];
            if (value != 0){
                result[count] = i;
                count ++;
            }
        }

        return result;
    }

    public String[] indicesToKey(int[] indices) {
        String[] result = new String[this.numVertices];
        for (int i = 0; i < this.numVertices; i++) {
            result[i] = indexToKey(indices[i]);
        }
        return result;
    }

    public String indexToKey(int index) {
        return rawKeys[index];
    }

    private String padTo(String str, int length) {
        while (str.length() < length) {
            str += " ";
        }
        return str;
    }

    private int getIndex(String key) {
        int result;
        if (!this.hasKeys) {
            throw new UnsupportedOperationException("Cannot use string keys if no keys provided.");
        }

        result = this.keys.get(key);

        if (result < 0) {
            throw new IndexOutOfBoundsException("Key " + key + " doest not exist.");
        }

        return result;
    }

    public void print() {
        int length = 8;
        if (this.hasKeys) {
            System.out.printf("\t\t");
            for (String key : keys.keySet()) {
                System.out.printf("%s\t", padTo(key, length));
            }
            System.out.printf("\n");
        }
        Iterator<String> iter = null;
        if (this.hasKeys) iter = this.keys.keySet().iterator();
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

    void parseGraph(String graph) {
        String from = "";
        String to = "";
        boolean fromWrite = true;
        for(char c: graph.toCharArray()) {
            switch (c) {
                case ':':
                    fromWrite = false;
                    break;
                case ' ':
                    this.addEdge(from, to);
                    to = "";
                    break;
                case '\n':
                    this.addEdge(from, to);
                    from = "";
                    to = "";
                    fromWrite = true;
                    break;
                default:
                    if (fromWrite) {
                        from += c;
                    } else {
                        to += c;
                    }
            }

        }
    }
}