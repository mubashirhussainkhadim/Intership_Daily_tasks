package JavaCore;

import java.util.Scanner;

public class intputoutput {
public static void main(String[] args) {
    int a,b,c;
    System.out.println("Enter any Two Numbers");
    Scanner s = new Scanner(System.in);
    a = s.nextInt();
    b = s.nextInt();
    c = a + b ;
    System.out.println("some of these two number is " + c);
}    

}
