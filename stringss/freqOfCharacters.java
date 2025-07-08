import java.util.Scanner;
public class freqOfCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=(int)ch-97;
            freq[idx]++;
        }
        int max_freq=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max_freq){
                max_freq=Math.max(max_freq,freq[i]);
            } 
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==max_freq){
                char ch=(char)(i+97);
                System.out.println(ch+" "+max_freq);
            } 
        }
    }
}