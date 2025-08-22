public class Factorial {
    public static void main(String[] args) {
        int n=4;
        int i=fact(n);
        System.out.println(i);
    }
    static int fact(int n){
        if(n>0){
            return n*fact(n-1);
        }
        return 1;
    }
}
