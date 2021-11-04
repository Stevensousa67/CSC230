public class Question_6_MidTerm {
    public static void main(String [] args){
        int n = 840;
        pattern(n);
    }
    public static void pattern(int n){
        if(n < 4242) {
            System.out.println(n);
            if(n*2 < 4242) {
                System.out.println(n * 2);
                if (n * 4 < 4242) {
                    System.out.println(n * 4);
                    if(n * 8 > 4242) {
                        System.out.println(n * 8);
                        System.out.println(n * 8);
                        System.out.println(n * 4);
                        System.out.println(n * 2);
                        System.out.println(n);
                    }
                }
            }
        }
    }
}
