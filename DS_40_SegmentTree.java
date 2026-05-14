// Segment Tree
public class DS_40_SegmentTree {
    private int[] tree;
    
    public DS_40_SegmentTree(int[] arr) {
        tree = new int[4 * arr.length];
        build(arr, 0, 0, arr.length - 1);
    }
    
    private void build(int[] arr, int node, int start, int end) {
        if (start == end) {
            tree[node] = arr[start];
        } else {
            int mid = start + (end - start) / 2;
            build(arr, 2 * node + 1, start, mid);
            build(arr, 2 * node + 2, mid + 1, end);
            tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
        }
    }
    
    public int query(int node, int start, int end, int l, int r) {
        if (r < start || end < l) return 0;
        if (l <= start && end <= r) return tree[node];
        
        int mid = start + (end - start) / 2;
        int p1 = query(2 * node + 1, start, mid, l, r);
        int p2 = query(2 * node + 2, mid + 1, end, l, r);
        return p1 + p2;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        DS_40_SegmentTree st = new DS_40_SegmentTree(arr);
        System.out.println("Sum 0-2: " + st.query(0, 0, arr.length - 1, 0, 2));
        System.out.println("Sum 2-5: " + st.query(0, 0, arr.length - 1, 2, 5));
    }
}
