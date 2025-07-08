public class Shadow {
    static int x=20;
    public static void main(String[] args) {
        System.out.println(x);
        x=30;
        System.out.println(x);
        call();
    }
    static void call(){
        System.out.print(x);
    }

}
