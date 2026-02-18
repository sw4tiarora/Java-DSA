import java.lang.String;
import java.util.HashMap;
import java.util.Map;

class FrequencyString{
    static void main(String[] args) {
        String s = "arora";
        HashMap<Character,Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
                freq.put(ch, freq.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey() +" -> "+entry.getValue());
        }
    }
}