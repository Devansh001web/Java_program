// Graph - Depth First Search (DFS)
public class DS_29_GraphDFS {
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
        
        void dfs(int v, boolean[] visited) {
            visited[v] = true;
            System.out.print(v + " ");
            for (int u : adj[v]) {
                if (!visited[u]) {
                    dfs(u, visited);
                }
            }
        }
        
        void dfsStart(int v) {
            boolean[] visited = new boolean[vertices];
            dfs(v, visited);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        DS_29_GraphDFS g = new DS_29_GraphDFS();
        Graph graph = g.new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        System.out.print("DFS from 0: ");
        graph.dfsStart(0);
    }
}
