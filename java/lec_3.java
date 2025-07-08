//QUESTION-1----->>>> REPLACE 8 WITH 3
// public class lec_3 {
//     public static void main(String[] args) {
//         int n=5848;
//         int rev =0;
//         int pos = 1;
//         while(n>0){
//             int rem=n%10;
//             if(rem==8){
//                 rem=3;
//             }
//             rev=rev + rem*pos;
//             pos=pos*10;
//             n=n/10;
//         }
//         System.out.println("your updated number is:"+rev);

//     }
    
// }


//QUESTION-2---->>>>ARMSTRONG OR NOT

// import java.util.Scanner;
// public class lec_3 {

//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.print("enter the number:");
//         int n = sc.nextInt();
//         int m = n;
//         int sum = 0;
//         String str = Integer.toString(n);
//         int p =str.length();
//         while(n>0){
//             int rem =n%10;
//             int count =(int)Math.pow(rem,p);
//             sum=sum+ count;
//             n=n/10;
//         }
//         System.out.println(sum);
//         if(m==sum){
//             System.out.println("it is a armstrong number");
//         }
//         else{
//             System.out.println("not");
//         }
//     }
// }

//QUESTION-3------->>>>>>>prime number or not
// import java.util.Scanner;
// public class lec_3 {

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter the number:");
//         int n= sc.nextInt();
//         if(n==2){
//             System.out.println("prime");
//         }
//         if(n<=1){
//             System.out.println("not prime");
//         }
//         else{
//             for(int i =3;i<n;i++){
//                 if(n%i==0){
//                     System.out.println("not prime");
//                 }
//                 else{
//                     System.out.println("prime");
//                 }
//             }

//         }
        
//     }
// }

import java.util.Scanner;
 public class lec_3 {

   public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            //QUESTION-4-->>PRINT MULTIPLICATION TABLE OF GIVEN NUMBER
//         System.out.print("enter the number");
//         int n=sc.nextInt();
//         System.out.println("multiplication table of the given number"+" " +n+ " "+ "is:");
//         for(int i=1;i<=10;i++){
//             System.out.println(n+"x"+i+"="+n*i);
        // }
        
        //QUESTION-5-->>PRINT INVERTED STAR PYRAMID

        // System.out.print("enter the number:");
        // int n = sc.nextInt();
        // for(int i = n;i>=1;i--){
        //     for(int j=i;j>=1;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        //QUESTION-6-->>PRINT HALF-PYRAMID PATTERN
//OUTPUT->
        // 1
        // 12
        // 123
        // 1234
        // System.out.print("enter the number:");
        // int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }

        //QUESTION-7-->>PRINT HALF-PYRAMID PATTERN IN REVERSE ORDER
        //OUTPUT--->>>> 12345
                    //  1234
                    //  123
                     // 12
                    //  1
                    // System.out.print("enter the number:");
                    // int n= sc.nextInt();
                    // for(int i=n;i>=1;i--){
                    //     for(int j=1;j<=i;j++){
                    //         System.out.print(j);
                    //     }
                    //     System.out.println("");
                   // }
        //QUESTION-8-->>CHECK THE NUMBER IF IT IS A NEON NUMBER OR NOT
        System.out.print("enter the number:");
        int n = sc.nextInt();
        // int s = (int)Math.pow(n,2);
        // int sum=0;
        // while(s>0){
        //     sum=sum+s%10;
        //     s=s/10;

        // }
        // System.out.println(sum);
        // if(sum==n){
        //     System.out.println("it is the neon number");
        // }
        // else{
        //     System.out.println("it is not neon number");
        // }

        //QUESTION-9----->>>>PRINT FIBBONACCI SERIES
//         int a =0;
//         int b=1;
//         int sum=0;
//         int add =0;
//         System.out.println(a);
//         System.out.println(b);
//         for(int i=0;i<n;i++){
//                 sum=a+b;
//                 a=b;
//                 b=sum;
//                 System.out.println(sum);

//         }


        //QUESTION-10-->>TO FIND factorial OF the NUMBER
        // int fact=1;
        // for(int i=1;i<=n;i++){
        //         fact=fact*i;
        // }
        // System.out.println(fact);


        //QUESTION-11--->>>FIND HCF AND LCM OF TWO NUMBER
        // System.out.print("enter the second number");
        // int b=sc.nextInt();
        // int hcf=1;
        // for(int i=2;i<=Math.min(n,b);i++){
        //         if(n%i==0 && b%i==0){
        //                 hcf=i;
                        
        //         } 
        // }
        // System.out.println("Hcf of given numbers is :"+hcf);
        // int lcm=(n*b)/hcf;
        // System.out.println("lcm of the numbers is :"+lcm);

        
      }
}

  
