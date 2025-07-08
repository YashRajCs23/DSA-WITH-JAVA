public class FizzBuzz {
    public static void main(String[] args) {
        int n=16;
//		for(int i=1;i<=n;i++)
//		{
//			if(i%3==0  && i%5==0)
//			{
//				System.out.println("fizzbuzz");
//			}
//			else if(i%3==0)
//			{
//				System.out.println("fizz");
//			}
//			else if(i%5==0)
//			{
//				System.out.println("buzz");
//			}
//			else
//			{
//				System.out.println(i);
//			}
//		}
        int cnt3=1;
        int cnt5=1;
        for (int i = 1; i <=n; i++) {      
        if(cnt3==3 && cnt5==5){
            System.out.println("Fizzbuzz");
            cnt3=0;
            cnt5=0;
        }
        else if(cnt3==3){
            System.out.println("Fizz");
            cnt3=0;
        }
        else if(cnt5==5){
            System.out.println("buzz");
            cnt5=0;
        }
        else{
            System.out.println(i);
        }
        cnt3++;
        cnt5++;
    }
    }
}