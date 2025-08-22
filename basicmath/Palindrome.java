public class Palindrome {
    public static void main(String[] args) {
        int n=121;
        int num=n;
        
        int rev=0;
        while(n>0){
            int dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        if(num==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
       
    }
    
}
