import java.util.Stack;
public class stockSpan {
    public static void calculateSpan2(int[] price) {
        int n = price.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();
        span[0] = 1;
        stack.push(0);
        for (int i=1;i<n;i++) {
            while(!stack.isEmpty() && price[stack.peek()]<=price[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                span[i]=i+1;
            }else{
                span[i]=i-stack.peek();
            }
            stack.push(i);
        }
        System.out.print("Stock Span: ");
        for (int s:span) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
    public static int[] calculateSpan(int[] price){
        int n=price.length;
        int[] span=new int[n];
        Stack<Integer> st=new Stack<>();
        span[0]=1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && price[st.peek()]<=price[i]){
                st.pop();
            }
            if(st.isEmpty()) span[i]=i+1;
            else span[i]=i-st.peek();
        }
        return span;
    }
    public static void main(String[] args) {
        int[] price={100,80,60,70,60,75,85};
        int[] span=calculateSpan(price);
        for(int s:span){
            System.out.print(s+" ");
        }
}
}