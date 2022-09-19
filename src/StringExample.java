import java.util.Locale;

public class StringExample {
    public static void main(String[] args) {
        String string = new String("Manu");
        String string1 = new String("Manu");
        System.out.println(string.toUpperCase(Locale.ROOT));
        System.out.println(string.charAt(0));
        System.out.println(string.concat("ohar"));
        System.out.println(string.equals(string1));
        System.out.println(string.contentEquals(string=string1));
    }
}
