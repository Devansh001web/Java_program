// Union-Find (Disjoint Set Union) Data Structure
public class DS_39_UnionFind {
    private int[] parent, rank;
    
    public DS_39_UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }
    
    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    
    public void union(int x, int y) {
        int px = find(x);
        int py = find(y);
        
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
    
    public static void main(String[] args) {
        DS_39_UnionFind uf = new DS_39_UnionFind(6);
        uf.union(0, 1);
        uf.union(1, 2);
        uf.union(3, 4);
        
        System.out.println("Find 0: " + uf.find(0));
        System.out.println("Find 3: " + uf.find(3));
        System.out.println("Connected 0-2: " + (uf.find(0) == uf.find(2)));
        System.out.println("Connected 0-3: " + (uf.find(0) == uf.find(3)));
    }
}
