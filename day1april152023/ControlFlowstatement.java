package day1april152023;

import java.util.Scanner;

public class ControlFlowstatement {
    public static void main(String[] args) {
        // if else statement
    //     int mubashir_age ;
    //     Scanner s =  new Scanner(System.in);
    //     System.out.println("your age");
    //   mubashir_age=   s.nextInt();
    //   if (mubashir_age >= 18 && mubashir_age <= 50){
    //         System.out.println("U are eligible for driving license");
    //   }
    //   else if (mubashir_age >= 50 ){
    //     System.out.println("your are old citien");
    //   }
    //   else {
    //     System.out.println("plz try again");
    //   }


    // nested if else 
    // int marks ;
    //  Scanner ss = new Scanner(System.in);
    //     System.out.println("Your Marks OUT OF 80");
    //     marks = ss.nextInt();
    
    // if (marks >= 35) {
    //     if (marks >= 75 &&  marks <= 80 ){
    //         System.out.println("you got A grade");
    //     }
    //     else {
    //         System.out.println("Passed , Try again for goof Grades");
    //     }
    // }
    // else {
    //     System.out.println("Sorry u marks is less than 35 You are fail , TRY Again Best of Luck for Next Time");
    // }
    

    // LOOP STATEMENTS

    // FOR LOOP

    int[] a = {1,3,4,5,6,7};
    int sum = 0;
    for (int i = 0 ; i<=a.length; i++){
      sum = sum + a[i];
    }
    System.out.println(sum);


}
}
