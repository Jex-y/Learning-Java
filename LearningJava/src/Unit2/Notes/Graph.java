package Unit2.Notes;

public class Graph {
    public int numVertices;
    public boolean hasKeys;
    public boolean bidirectional;

    private int[][] adjMatrix;
    public String [] keys;

    Graph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
        hasKeys = false;
        this.keys = null;
        bidirectional = true;
    }

    Graph(int numVertices, boolean bidirectional) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
        hasKeys = false;
        this.keys = null;
        this.bidirectional = bidirectional;
    }

    Graph(int numVertices, String [] keys) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
        hasKeys = true;
        this.keys = keys;
        this.bidirectional = true;
        assert keys.length == numVertices;
    }

    Graph(int numVertices,String [] keys, boolean bidirectional) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
        hasKeys = true;
        this.keys = keys;
        this.bidirectional = bidirectional;
        assert keys.length == numVertices;
    }

    private int keyToIndex(String key) {
        int index = -1;
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].equals(key)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void addEdge(String from, String to) {
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

        addEdge(fromIndex,toIndex, weight);
    }


    public void addEdge(int from, int to, int weight) {
        if (!(0 <= from & from < this.numVertices)) {
            throw new IndexOutOfBoundsException("Index " + String.valueOf(from) + " out of bounds.");
        }
        if (!(0 <= to & to < this.numVertices)) {
            throw new IndexOutOfBoundsException("Index " + String.valueOf(to) + " out of bounds.");
        }

        adjMatrix[from][to] = weight;
        if (bidirectional) {
            adjMatrix[to][from] = weight;
        }
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
            for (String key: keys) {
                System.out.printf("%s\t",padTo(key,length));
            }
            System.out.printf("\n");
        }
        for (int i = 0; i < numVertices; i++) {
            if (this.hasKeys) {
                System.out.printf("%s\t",padTo(this.keys[i],length));
            }
            for (int j = 0; j < numVertices; j++) {
                System.out.printf("%d\t\t\t",adjMatrix[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
