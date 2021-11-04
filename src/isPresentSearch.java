// Steven Sousa - 4Cs - Data Structures - 10/21/21

public class isPresentSearch {
    public static void main(String [] args){
        String s = "Steven";
        System.out.println(isPresent('S', s));
    }

    public static boolean isPresent(char letter, String s){

        int i = 0;

        if(s == null || s.equals("")){
            return false;
        }
        if(s.charAt(0) == (letter)){
            return true;
        }
        else{
            return isPresent(letter, s.substring(i+1));
        }
    }
}

