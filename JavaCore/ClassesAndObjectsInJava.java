package JavaCore;
class Pen {
    String color;
    String Type;
    public void write(){
        System.out.println("Write Some some thing");
    }
    public void printColor() {
        System.out.println(this.color);
    }
}
public class ClassesAndObjectsInJava {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.Type = "gel";
        pen1.write();
        System.out.println(pen1.Type);
        System.out.println(pen1.color);


    }
}
