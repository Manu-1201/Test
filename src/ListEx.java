import java.util.*;
public class ListEx {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Manu");
        l.add("Pawan");
        l.add("Shiva");
        l.add(null);
        l.add("Sai");
        l.add(null);
        l.remove(3);

        l.set(4,"Sai1");
//        l.get(2);
        for (int i=0;i<l.size();i++) {
            System.out.println(i);
        }

        for (String a:l) {
            System.out.println(a);

        }
        Iterator<String> iterator = l.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        l.forEach(System.out::println);
    }

}
