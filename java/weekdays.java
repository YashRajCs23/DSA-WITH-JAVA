import java.util.Scanner;

public class weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
      //   int n=sc.nextInt();   
      //   switch(n){
      //       case 1:
      //          System.out.println("mon");
      //          break; 
      //       case 2:
      //          System.out.println("tue");
      //          break;
      //       case 3:
      //          System.out.println("wed");
      //          break;
      //       case 4:
      //          System.out.println("thurs");
      //          break;
      //       case 5:
      //          System.out.println("fri");
      //          break;
      //       case 6:
      //          System.out.println("sat");
      //          break;
      //       case 7:
      //          System.out.println("sun");
      //          break;
      //       default:
      //           System.out.println("invalid day no");
      //   }

      int n1=sc.nextInt();
      int n2=sc.nextInt();
      System.out.println("choose an operator: +,-,*,/");
      char operator=sc.next().charAt(0);

      switch(operator){
         case '+':
            System.out.println(n1+n2);
            break; 
         case '-':
            System.out.println(n1-n2);
            break;
         case '*':
            System.out.println(n1*n2);
            break;
         case '/':
            System.out.println(n1/n2);
            break;
         default:
             System.out.println("invalid");
     }


      

    }
}
