package RecursionInJava;

public class PrintFibonaceNumbers {
    public static void main(String[] args) {
       int n = 10;
//       int a = 0 , b = 1 ;
//       for( int i = 1 ; i <= n ; i ++){
//           System.out.print(a + " ");
//           int sum = a + b;
//           a = b ;
//           b = sum ;
////           System.out.println(fibo(i));
//       }
    }
    static int fibo(int n , int a , int b){
        if(n <2) {
            return n;
        }
        a = 0 ; b = 1;
    }
}
