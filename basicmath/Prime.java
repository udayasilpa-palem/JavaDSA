public class Prime {
    public static void main(String[] args) {
        int n=50;
        boolean x=isPrime(n);
       boolean y= (x)?true:false;
       System.out.println(y);
    }
    public static boolean isPrime(int n){
        boolean num=true;
        if(n<2){
            num=false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                num=false;
            }
        }
        return num;
    }
    
}
