public class Numbers {
    public static void main(String[] args) {
        int n=20;
        int m=1;
        Num(n);
        System.out.println();
        rev(m,n);
    }
    static void Num(int n){
        if(n>0){
            System.out.print(n+" ");
            Num(n-1);
        }
    }
    static void rev(int m,int n){
        if(m<=n){
            System.out.print(m+" ");
            rev(m+1,n);
        }
    }
}
