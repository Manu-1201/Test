public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer(" Manu ");
        StringBuffer s2 = new StringBuffer("Pawan");
        System.out.println(s1.append(1));
        System.out.println(s1.capacity());
        System.out.println(s1.hashCode());
        System.out.println(s1.equals(s2));
    }
}
