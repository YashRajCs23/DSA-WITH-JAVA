public class Scoping {
    public static void main(String[] args) {
        int a=10;
        int b=30;

        
    {
        a=35;
        int c=50;
        System.out.println(c);

    }
    a=34;
    System.out.println(a);
    }
    
}
