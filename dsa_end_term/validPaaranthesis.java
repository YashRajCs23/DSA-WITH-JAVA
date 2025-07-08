package dsa_end_term;

import java.util.Stack;

public class validPaaranthesis {
    public static boolean isValid(String s){
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(')st.push(')');
            else if(c=='{')st.push('}');
            else if(c=='[')st.push(']');
            else if(st.isEmpty()||st.pop()!=c)return false;
        }
        return true;
    }
}
