public class Sum {
    public static void main(String[] args) {
        int n=10;
        int x=sum(n);
        System.out.println(x);
    }
    static int sum(int n){
        if(n>=1){
           return n+ sum(n-1);
        }
        else{
        return 0;
        }
    }
}
