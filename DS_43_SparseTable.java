// Sparse Table for Range Maximum Query
public class DS_43_SparseTable {
    private int[][] table;
    private int[] logs;
    
    public DS_43_SparseTable(int[] arr) {
        int n = arr.length;
        int maxLog = (int) Math.log(n) + 1;
        table = new int[n][maxLog];
        logs = new int[n + 1];
        
        for (int i = 2; i <= n; i++) {
            logs[i] = logs[i / 2] + 1;
        }
        
        for (int i = 0; i < n; i++) {
            table[i][0] = arr[i];
        }
        
        for (int j = 1; j < maxLog; j++) {
            for (int i = 0; i + (1 << j) <= n; i++) {
                table[i][j] = Math.max(table[i][j - 1], table[i + (1 << (j - 1))][j - 1]);
            }
        }
    }
    
    public int query(int l, int r) {
        int len = r - l + 1;
        int j = logs[len];
        return Math.max(table[l][j], table[r - (1 << j) + 1][j]);
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 7, 9, 5};
        DS_43_SparseTable st = new DS_43_SparseTable(arr);
        System.out.println("Max 0-2: " + st.query(0, 2));
        System.out.println("Max 2-5: " + st.query(2, 5));
    }
}
