package JavaCore;

class Student {
    String name;
    int age;
    public void PrintInfo( String name){
        
   System.out.println(name);
    }
    public void PrintInfo(int age){
        System.out.println(age);
    }
    public void PrintInfo(int age , String name){
        System.out.println(name+" "+age);
      
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 23;
         s1.name = "mubashir";
       

    }
}
