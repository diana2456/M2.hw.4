import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("н");
        A.add("мир");
        A.add("сумка");
        A.add("желатин");
        A.add("бижутерия");
        System.out.println(A);
        ArrayList<String> B = new ArrayList<>();
        B.add("литература");
        B.add("конфетка");
        B.add("осенью");
        B.add("клей");
        B.add("ка");
        Collections.reverse(B);
        ArrayList<String> C = new ArrayList<>();
        ListIterator<String> listIter = A.listIterator();
        ListIterator<String> listter = B.listIterator();
        while (listIter.hasNext()){
            C.add(listIter.next());
            C.add(listter.next());
        }
        System.out.println(C);
        for (String ret : C) {
            System.out.println(ret);
        }
    }
}
