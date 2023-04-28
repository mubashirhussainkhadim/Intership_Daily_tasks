package SerachAlgorithems;

public class FinfChracterinName {
    public static void main(String[] args) {
        String name = "Mubashir";
        char target = 'a';
        System.out.println(searchCharacter(name, target));
    
    }
    static boolean searchCharacter(String str , char target){
        if (str.length() == 0){
            return false;
        }
        for ( char ch  : str.toCharArray()){
            if ( ch == target){
                return true;
            }
        }
        return false;
    }
}


