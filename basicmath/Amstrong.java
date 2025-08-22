public class Amstrong {
    public static void main(String[] args) {
        int n=123;
        int val=n;
        int count=0;
        while(n!=0){
            count=count+1;
            n=n/10;
        }  
       int x= digit(val,count);
         if(val==x){
            System.out.println("Amstrong");
         }
         else{
            System.out.println("not");
         }
    }
    public static int digit(int n,int c){
        int num=0;
        while(n>0){
            int dig=n%10;
            n=n/10;
            double number=(Math.pow(dig,c));
            num=num+(int)number;
        }
        return  num;

    }
}
