package RecursionInJava;
     
public class Recursion5 {
    public static int calPower(int x , int n){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        int xPoenm1 = calPower(x, n-1);
        int xPown = x * xPoenm1;
        return xPown;
    }
    public static void main(String[] args) {
        int x =2 , n =5 ;
         int ans = calPower(x, n);
         System.out.println(ans);
    }
    }

