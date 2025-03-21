package Recursion;
import java.util.Scanner; 



public class Basics {

    public static void fun(int i,int n){

        if (i<n) return;
        fun(i-1,n);
        System.out.println(i);
        
    }
    
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        fun(n,n);
    }

    
    
}
