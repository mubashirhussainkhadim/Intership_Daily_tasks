package RecursionInJava;

public class moveALLTXclass {
       public static void moveALLTX(String str, int idx , int count ,String newString){
        if (idx == str.length()){
            for(int i =0 ; i <count ; i++ ){
                 newString += "x";
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x'){
            count++;
            moveALLTX(str, idx+1, count, newString);
        } else {
            newString += currChar;
            moveALLTX(str, idx+1, count, newString);
        }
       }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveALLTX(str, 0, 0, "" );
    }
}
