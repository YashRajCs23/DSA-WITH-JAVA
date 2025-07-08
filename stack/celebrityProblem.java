import java.util.Stack;
public class celebrityProblem{
    public int celebrity(int M[][]) {
    int n = M.length;
    Stack<Integer> st = new Stack<>();
    for(int i=0;i<n;i++) st.push(i);
    while(st.size()>1) {
        int v1=st.pop();
        int v2=st.pop();
        if(M[v1][v2]==1) st.push(v2);
        else st.push(v1);
    }
    if(st.isEmpty()) return -1;
    int potential=st.pop();
    for(int j=0;j<n;j++) if(j!=potential&&M[potential][j]==1) return -1;
    for(int i=0;i<n;i++) if(i!=potential&&M[i][potential]==0) return -1;
    return potential;
}
}