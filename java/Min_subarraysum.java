import java.util.Scanner;
public class Min_subarraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = {2,4,6,10,2,1};
        System.out.print("Enter taget: ");
        int t = sc.nextInt();
        int currentSum = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for (int i=0; i<number.length;i++){
            currentSum = 0;
            for(int j = i; j < number.length;j++){
                currentSum = currentSum+number[j];
                if(currentSum ==t){
                    if(mini>(j-i+1)){
                        mini = j-i+1;
                    }
                }
            }           
        }
        System.out.println(mini);
    }   
}