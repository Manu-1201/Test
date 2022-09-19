public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder(" Manu ");
        System.out.println(s1.append("manu"));
        System.out.println(s1.deleteCharAt(1));
        System.out.println(s1.indexOf("manu"));

    }
}
