public class Overloading {
    public void add(int i, int j){
        System.out.println("Its two parameters");
    }
    public void add(int i, int j, int k){
        System.out.println("Its three parameters");
    }
    public void add(int i, String l){
        System.out.println("It int and string");
    }

    public static void main(String[] args) {
        Overloading m = new Overloading();
        m.add(1, "M");
    }
}
