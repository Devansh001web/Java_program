// Graph - Kruskal's Algorithm (Minimum Spanning Tree)
public class DS_50_Kruskal {
    class Edge implements Comparable<Edge> {
        int src, dest, weight;
        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
        public int compareTo(Edge other) {
            return this.weight - other.weight;
        }
    }
    
    class UnionFind {
        int[] parent, rank;
        UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }
        
        int find(int x) {
            if (parent[x] != x) parent[x] = find(parent[x]);
            return parent[x];
        }
        
        void union(int x, int y) {
            int px = find(x), py = find(y);
            if (px == py) return;
            if (rank[px] < rank[py]) {
                parent[px] = py;
            } else if (rank[px] > rank[py]) {
                parent[py] = px;
            } else {
                parent[py] = px;
                rank[px]++;
            }
        }
    }
    
    public void kruskal(int vertices, Edge[] edges) {
        java.util.Arrays.sort(edges);
        UnionFind uf = new UnionFind(vertices);
        int mstWeight = 0;
        
        System.out.println("Edges in MST:");
        for (Edge edge : edges) {
            if (uf.find(edge.src) != uf.find(edge.dest)) {
                System.out.println(edge.src + " -- " + edge.dest + " : " + edge.weight);
                mstWeight += edge.weight;
                uf.union(edge.src, edge.dest);
            }
        }
        System.out.println("MST Weight: " + mstWeight);
    }
    
    public static void main(String[] args) {
        DS_50_Kruskal k = new DS_50_Kruskal();
        DS_50_Kruskal.Edge[] edges = {
            k.new Edge(0, 1, 4),
            k.new Edge(0, 2, 2),
            k.new Edge(1, 2, 1),
            k.new Edge(1, 3, 5),
            k.new Edge(2, 3, 8)
        };
        k.kruskal(4, edges);
    }
}
