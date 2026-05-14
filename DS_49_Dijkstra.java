// Graph - Dijkstra's Algorithm
public class DS_49_Dijkstra {
    public static void dijkstra(int[][] graph, int src) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;
        
        for (int i = 0; i < n - 1; i++) {
            int u = -1;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && (u == -1 || dist[j] < dist[u])) {
                    u = j;
                }
            }
            visited[u] = true;
            
            for (int v = 0; v < n; v++) {
                if (graph[u][v] != 0 && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        
        System.out.println("Distances from vertex " + src + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("To " + i + ": " + dist[i]);
        }
    }
    
    public static void main(String[] args) {
        int[][] graph = {
            {0, 4, 2, 0},
            {4, 0, 1, 5},
            {2, 1, 0, 8},
            {0, 5, 8, 0}
        };
        dijkstra(graph, 0);
    }
}
