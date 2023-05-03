package RecursionInJava;

public class printRevclass {
    public static void printRev(String str, int index){
        if(index == 0 ){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index)+" ");
        printRev(str, index-1);
    }
    public static void main(String[] args) {
        String str = "ABCDEFGHIGK";
        printRev(str, str.length()-1);
    }
}
