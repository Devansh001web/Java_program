// Graph - Breadth First Search (BFS)
public class DS_30_GraphBFS {
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
        
        void bfs(int s) {
            boolean[] visited = new boolean[vertices];
            java.util.Queue<Integer> q = new java.util.LinkedList<>();
            visited[s] = true;
            q.add(s);
            
            while (!q.isEmpty()) {
                int u = q.poll();
                System.out.print(u + " ");
                for (int v : adj[u]) {
                    if (!visited[v]) {
                        visited[v] = true;
                        q.add(v);
                    }
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        DS_30_GraphBFS g = new DS_30_GraphBFS();
        Graph graph = g.new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        System.out.print("BFS from 0: ");
        graph.bfs(0);
    }
}
