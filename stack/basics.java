import java.util.Scanner;
import java.util.Stack;
public class basics {
    public static void pushAtBottom(Stack<Integer> st,int x){
        if(st.size()==0) {
            st.push(x);
            return;
        }
        int top=st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==1)return;
        int top=st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }
    public static void display(Stack<Integer> st){
        if(st.size()==0)return;
        int top=st.pop();
        System.out.print(top+" ");
        display(st);
        st.push(top);
    }
    public static void displayReverse(Stack<Integer> st){
        if(st.size()==0)return;
        int top=st.pop();
        display(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        display(st);
        Stack<Integer> rt=new Stack<>();
        while(st.size()!=0){
            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> gt=new Stack<>();
        while(rt.size()!=0){
            gt.push(rt.pop());
        }
        System.out.println(gt);
    }
}