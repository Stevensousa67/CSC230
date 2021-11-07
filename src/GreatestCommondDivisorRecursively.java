// Steven Sousa - 4Cs - Data Structures - 10/26/21
public class GreatestCommondDivisorRecursively {
    public static void main(String[] args){
        int a = 6;
        int b = 12;
        System.out.println("The greatest common divisor is: " + gcd(a, b));
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b, a%b);
        }
    }
}
