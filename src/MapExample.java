import java.util.*;
public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(null,"One");
        map.remove(null);
        System.out.println(map.get(2));


        Set<Integer> s1 = map.keySet();
        /*Set<String> s1 = map.values();
        for (String val:s1) {
            System.out.println(val);
        }*/
        for (Integer val:s1) {
            System.out.println(val);
        }
        Iterator<Integer> it = s1.iterator();
        while(it.hasNext()){
            //Integer itr = it.next();
            System.out.println(it.next());

        }

        s1.forEach(System.out::println);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> kv = iterator.next();
            System.out.println(kv.getKey()+"==="+kv.getValue());
        }
    }
}
