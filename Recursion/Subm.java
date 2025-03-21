import java. util. *;

public class Subm {

    public static  int sumb(int n){
        if(n==0) return 1;

       return n* sumb(n-1);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sumb(n);
        int result = sumb(n);
        System.out.println(result);

        
    }
    
}
