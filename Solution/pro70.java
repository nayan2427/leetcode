public class pro70 {
    int []total;

    public int climbStairs(int n) {
        total = new int[n + 1];
        return solve(n);
    }
    public int solve(int n) {
        if(n <= 1) return 1;
        if(total[n] != 0) return total[n];
        total[n] = solve(n - 1) + solve(n - 2);
        return total[n];
    }
    public static void main(String [] args) {
        pro70 obj = new pro70();
        int n = 5;
        System.out.println(obj.climbStairs(n));
        System.out.println(obj.climbStairs(45));
    }

}
