import java.util.*;

public class LetterCombinationsOfPhoneNumber {
    String[] mapping = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    private void helper(String digits, int ind, StringBuilder curr, List<String> res){
        if(ind == digits.length()){
            res.add(curr.toString());
            return;
        }
        String letters = mapping[digits.charAt(ind) - '0'];
        for(int i = 0; i < letters.length(); i++){
            curr.append(letters.charAt(i));
            helper(digits, ind + 1, curr, res);
            curr.deleteCharAt(curr.length() - 1);
        }
    }

    public List<String> letterCombo(String digits){
        StringBuilder curr = new StringBuilder();
        List<String> res = new ArrayList<>();
        helper(digits, 0, curr, res);
        return res;
    }

    public static void main(String[] args) {
        String digits = "34";
        LetterCombinationsOfPhoneNumber obj = new LetterCombinationsOfPhoneNumber();
        List<String> result = obj.letterCombo(digits);
        System.out.println(result);
    }
}
