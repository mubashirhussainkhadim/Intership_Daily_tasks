package RecursionInJava;
 
public class calculateFactorialClass {
    public static int calculateFactorial (int n){
        if (n==1 || n==0) {
            return 1;
        }
     int fac_nm1 = calculateFactorial(n-1);
     int fac_n = n * fac_nm1;
     return fac_n ;
    
    }
    public static void main(String[] args) {
        int n = 5;
      int ans =  calculateFactorial(n);
      System.out.println(ans);
    }
}
