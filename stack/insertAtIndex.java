import java.util.Scanner;
import java.util.Stack;
public class insertAtIndex {
    public static void insert(Stack<Integer> st,int idx,int x){
        Stack<Integer> temp=new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
    public static void input(Stack<Integer> st,int n){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        input(st, n);
        insert(st, 0, 9);
    }
}
