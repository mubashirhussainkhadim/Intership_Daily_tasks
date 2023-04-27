package JavaCore;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // int marks[] = new int[3];
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] =99;
        // for( int i =0 ; i< 3 ; i++){
        //     System.out.println(marks[i]);
        // }
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        //input
        // for( int i=0 ; i < size ; i++){
        //     numbers[i] = sc.nextInt();
        // }

        // //output 
        // for( int i =0 ; i< size ; i++){
        //     System.out.println("Array no " + numbers[i]);
        // }
       //input
        for( int i=0 ; i < size ; i++){
            number[i] = sc.nextInt();
        }
        int x = sc.nextInt();
         //output 
        for( int i =0 ; i< number.length ; i++){
            if(x == number[i]){
                System.out.println("x fount at index" + " " + i);
            }
            
        }
    }
}
