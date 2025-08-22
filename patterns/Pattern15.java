public class Pattern15 {
    public static void main(String[] args) {
        /* A B C D E
         * A B C D
         * A B C
         * A B 
         * A
         */
    
    for(int i=0;i<5;i++){
        for(char j='A';j<='A'+(5-i-1);j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    
    
}
}
