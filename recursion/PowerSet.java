import java.util.*;

public class PowerSet {
    private void helper(String s, int index, StringBuilder curr, List<String> result){
        if(index == s.length()){
            result.add(curr.toString());
            return;
        }
        // exclude
        helper(s, index + 1, curr, result);

        // include
        curr.append(s.charAt(index));
        helper(s, index + 1, curr, result);

        // backtrack by removing last char
        curr.deleteCharAt(curr.length() - 1);
    }

    public List<String> getSubsequences(String s){
        List<String> result = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        helper(s, 0, curr, result);
        return result;
    }

    public static void main(String[] args){
        PowerSet ps=new PowerSet();
        String s="abc";
        List<String> result=ps.getSubsequences(s);
        for(String str:result){
            System.out.println("\""+str+"\"");
        }
    }
}
