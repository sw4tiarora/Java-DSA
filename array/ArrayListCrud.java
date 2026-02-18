import java.util.ArrayList;
public class ArrayListCrud {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list);
        System.out.println(list.get(0));
        list.set(1, "Mango"); //update
        System.out.println(list);
        list.remove("Apple");
        System.out.println(list);
    }
}
