import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public void backtrack(String curr, int open, int close, int n, List<String> res){
        if(curr.length() == 2 * n){
            res.add(curr);
            return;
        }
        if(open < n){
            backtrack(curr + "(", open + 1, close, n, res);
        }
        if(close < open){
            backtrack(curr + ")", open, close + 1, n, res);
        }
    }

    public List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        backtrack("", 0, 0, n, res);
        return res;
    }

    public static void main(String[] args) {
        GenerateParenthesis gp = new GenerateParenthesis();
        int n = 3;
        List<String> result = gp.generateParenthesis(n);
        System.out.println(result);
    }
}
