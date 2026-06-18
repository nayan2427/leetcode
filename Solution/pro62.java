public class pro62 {
    int total [][];
    public int uniquePaths(int m, int n) {
        total = new int[m][n];
        return CountPaths(0,0,m,n);
    }
    public int CountPaths(int i, int j, int m, int n){
        if(i == m || j == n) return 0;

        if(i == m - 1 && j == n - 1){
            return 1;
        }
         if (total[i][j] != 0) return total[i][j];

        int rightPaths = CountPaths(i + 1, j , m, n);
        
        int downPaths = CountPaths(i , j + 1 , m, n);

        return total[i][j] = rightPaths + downPaths;
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        pro62 ob = new pro62();
        System.out.println(ob.uniquePaths(m, n));
    }
}