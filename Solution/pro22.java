import java.util.ArrayList;
import java.util.List;

public class pro22 {
    public List<String> generateParenthesis(int n) {
        List<String> str = new ArrayList<>();
        backtrack(str, 0, 0, n, "");
        return str;
    }

    private void backtrack(List<String> result, int open, int close, int n, String current) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }
        if (open < n) {
            backtrack(result, open + 1, close, n, current + "(");
        }
        if (close < open) {
            backtrack(result, open, close + 1, n, current + ")");
        }
    }
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 1;
        pro22 ob = new pro22();
        System.out.println(ob.generateParenthesis(n1));
        System.out.println(ob.generateParenthesis(n2));
    }
}
