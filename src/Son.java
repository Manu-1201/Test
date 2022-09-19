public class Son extends Father{
    public void prop(){
        System.out.println("Inherited prop");
    }

    public static void main(String[] args) {
        Son son = new Son();
        Father f = new Father();
        Father f1 = new Son();
        son.prop();
        f.prop();
        f1.prop();
    }
}
