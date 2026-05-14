// Fenwick Tree (Binary Indexed Tree)
public class DS_41_FenwickTree {
    private int[] tree;
    private int n;
    
    public DS_41_FenwickTree(int[] arr) {
        n = arr.length;
        tree = new int[n + 1];
        for (int i = 0; i < n; i++) {
            update(i, arr[i]);
        }
    }
    
    public void update(int index, int delta) {
        for (int i = index + 1; i <= n; i += i & (-i)) {
            tree[i] += delta;
        }
    }
    
    public int query(int index) {
        int sum = 0;
        for (int i = index + 1; i > 0; i -= i & (-i)) {
            sum += tree[i];
        }
        return sum;
    }
    
    public int rangeQuery(int l, int r) {
        if (l == 0) return query(r);
        return query(r) - query(l - 1);
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        DS_41_FenwickTree ft = new DS_41_FenwickTree(arr);
        System.out.println("Range sum 0-2: " + ft.rangeQuery(0, 2));
        System.out.println("Range sum 2-4: " + ft.rangeQuery(2, 4));
    }
}
