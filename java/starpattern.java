import java.util.Scanner;
public class starpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // System.out.print("enter the number :");
        // int n=sc.nextInt();
        // ****
        // ****
        // ****
        // **** 
        // for(int i=1; i<=4;i++){
        //     for(int j=1;j<=4;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }


        // *
        // **
        // ***
        // **** 
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=row;col++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }

        // 1
        // 12
        // 123
        // 1234 
            // for(int row=1;row<=n;row++){
            //     for(int col=1;col<=row;col++){
            //         System.out.print(col+ " ");
            //     }
            //     System.out.println(" ");
            // }

        // 1
        // 23
        // 456
        // 78910

        // int a=1;
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=row;col++){
        //         System.out.print(a+" ");
        //         a++;
        //     }
        //     System.out.println();

        // *     *
        // **   **
        // *** ***
        // *******
        // int t=2*n-1;
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=t;col++){
        //         if(col<=row || col>t-row){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //1
        //01
        //101
        //0101
            // for(int row=1;row<=n;row++){
            //     for(int col=1;col<=row;col++){
            //         if((row+col)%2==0){
            //             System.out.print("1"+"");

            //         }
            //         else{
            //             System.out.print("0"+"");
            //         }
            //     }
            //     System.out.println(" ");
            // }


            //****
            //*** 
            //** 
            //* 
            // for(int row=n;row<=1;row--){
            //     for(int col=1;col<=row;col++){
            //        System.out.print("*"+" ");
            //     }
            //     System.out.println();

            // }
        

            //   *   *
            //   ** **
            //   *****  //butterfly
            //   *****
            //   ** **
            //   *   *
        // int t=2*n-1;
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=t;col++){
        //         if(col<=row || col>t-row){
        //             System.out.print("*"+" ");
        //         }
        //         else{
        //             System.out.print(" "+" ");
        //         }
        //     }
        //     System.out.println();

        // }
        // for(int row=n;row>=1;row--){
        //     for(int colm=t;colm>=1;colm--){
        //         if(colm<=row||colm>t-row){
        //             System.out.print("*"+" ");
        //         }
        //         else{
        //             System.out.print(" "+" ");
        //         }
                
        //     }
        //     System.out.println();


        /*
         111111 
         111111 
         111111 
         */

        // for (int i = 1; i <= 3; i++) {
        //     for (int j = 1; j <= 6; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
            
        // int r=sc.nextInt();
        // int c=sc.nextInt();
        // for (int i = 1; i <= r; i++) {
        //     for (int j = 1; j <= c; j++) {
        //         if(i==1 || i==r || j==1 || j==c){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
                
        //     }
        //     System.out.println();

        /*
            *
           ***
          *****
         *******  

         */

        // for (int i = 1; i <= r; i++) {
        //     for (int j = 1; j <= (r-i); j++) {
        //         System.out.print(" ");
    
        //     }
        //     for (int k = 1; k <= (2*i-1); k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


// 1234567
// 2345671
// 3456712
// 4567123
// 5671234
// 6712345
// 7123456
        // for (int i = 1; i <=r; i++){
        //     for (int j =i; j <= r; j++) {
        //         System.out.print(j);
                
        //     }
        // for (int k = 1; k <= i-1; k++) {
        //     System.out.print(k);
            
        // }
        //     System.out.println();
        // }

    //     for (int i = 1; i <=r; i++){
    //         for (int j =i; j <= c; j++) {
    //             System.out.print(j);
    //     }
    //     System.out.println();
    // }
    // 1212
    // 2121
    // 1212
    // 2121
    // 1212
        // for (int i = 1; i <= r; i++) {
        //     for (int j = 1; j <= c; j++) {
        //         if((i+j)%2==0){
        //             System.out.print(1);
        //         }
        //         else{
        //             System.out.print(2);
        //         }
                
        //     }
        //     System.out.println();
            
        // }
    //      1
    //     121
    //    12321
    //   1234321
 
        // for (int i = 1; i <= r; i++) {
        //     for (int j = 1; j <= (r-i); j++) {
        //         System.out.print(" ");
    
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print(k);
        //     }
        //     for (int l = i-1; l >= 1; l--) {
        //         System.out.print(l);
        //     }
            
        //     System.out.println();
        // }

    //      1
    //     2 2
    //    3   3
    //   4444444
        int n = sc.nextInt();
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k = 1;k<=2*i-1;k++){
                if(k==1||k==2*i-1||i==n){
                System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
    }
}}
        


    
