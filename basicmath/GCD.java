public class GCD {
    public static void main(String[] args) {
        int n1=12;
        int n2=6;
        int gcd=1;
        int max=Math.max(n1,n2);
        for(int i=2;i<=max;i++){
            if(n1%i==0&&n2%i==0){
                gcd=Math.max(gcd,i);
            }
        }
        System.out.println(gcd);
    }
}
