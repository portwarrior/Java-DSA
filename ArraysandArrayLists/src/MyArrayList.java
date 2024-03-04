import java.util.ArrayList;
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(121);
        list.add(122);
        list.contains(255);
        list.set(0, 123);
        list.remove(1);
        System.out.println(list.get(1));
        System.out.println(list);
    }
}
