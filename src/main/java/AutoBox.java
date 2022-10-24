import java.util.ArrayList;

public class AutoBox {
    public static void main(String[] args) {
        ArrayList<Integer> myIntValue = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            myIntValue.add(i);
        }

        for (int i = 0; i < myIntValue.size(); i++) {
            System.out.println(myIntValue.get(i));
        }
    }
}
