package JavaCore;

public class Strings {
    public static void main(String[] args) {
    //     String firstName = "Mubashir";
    //     String lastName = "hussain";
    //     String fullName = firstName + "@" + lastName;
    //     System.out.println(fullName);
    //     System.out.println(fullName.length());
    //     for( int i =0 ; i < fullName.length(); i++){
    //         System.out.println(fullName.charAt(i));
    //     }

    String name1 = "Mubashir";
    String name2 = "Mubashir";
    // s1>s2 : +ve value
    // s1==s2 : 0;
    // s < s2 : -ve value

    if(name1.compareTo(name2) == 0){
      System.out.println("String are equal");
    } else {
        System.out.println("Strings are not equal");
    }
}
}