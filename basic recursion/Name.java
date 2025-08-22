public class Name{
    public static void main(String[] args) {
        int n=5;
        PrintName(n);
    }
    static void PrintName(int n){
        if(n>=1){
            System.out.println("RadhaKrishna");
            PrintName(n-1);
        }
    }
}