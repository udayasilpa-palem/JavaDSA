public class Palindrome {
    public static void main(String[] args) {
        String n="palindrome";
       boolean x= palindrome(n,0,n.length()-1);
       System.out.println(x);



    }
    static boolean palindrome(String s,int i,int j){
        if(i>=j){
            return true;
        }
        
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        
        return palindrome(s,i+1,j-1);

    }
    
}
