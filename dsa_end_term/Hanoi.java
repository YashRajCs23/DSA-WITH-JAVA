package dsa_end_term;

public class Hanoi {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        if(n==1)return 1;
        // return towerOfHanoi(n-1,from,to,aux)+1+towerOfHanoi(n-1,to,aux,from);
        return (int)Math.pow(2,n)-1;
    }
}
