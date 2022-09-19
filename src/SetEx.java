import java.util.*;
class HashSetDemo
{
    public static void main(String[] args)
    {
        HashSet<String> h=new HashSet<String>();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add("10");
        System.out.println(h);
     /*   for (int i=0;i<h.size();i++){
            System.out.println(i);
        }

        for (String m:
             h) {
            System.out.println(m);
        }
        Iterator<String> iterator = h.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        h.forEach(System.out::println);
        h.forEach(m-> System.out.println(m));
    }
}
