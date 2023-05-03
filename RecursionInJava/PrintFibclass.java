package RecursionInJava;

public class PrintFibclass {
    public static void PrintFib(int a , int b , int n){
       if ( n== 0 ){
          return;
       }
        int c = a + b ;
        PrintFib(b, c, n-1);

    }
    public static void main(String[] args) {
        int a = 0 , b =1;

        int n = 7 ;

        PrintFib(a, b, n-2);
    }
}
