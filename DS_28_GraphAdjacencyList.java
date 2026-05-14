// Graph - Adjacency List Representation
public class DS_28_GraphAdjacencyList {
    class Graph {
        java.util.LinkedList<Integer>[] adj;
        int vertices;
        
        Graph(int v) {
            vertices = v;
            adj = new java.util.LinkedList[v];
            for (int i = 0; i < v; i++) {
                adj[i] = new java.util.LinkedList<>();
            }
        }
        
        void addEdge(int u, int v) {
            adj[u].add(v);
            adj[v].add(u);
        }
        
        void displayGraph() {
            for (int i = 0; i < vertices; i++) {
                System.out.print("Vertex " + i + ": ");
                for (int j : adj[i]) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        DS_28_GraphAdjacencyList g = new DS_28_GraphAdjacencyList();
        Graph graph = g.new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.displayGraph();
    }
}
