public class Pattern14 {
    public static void main(String[] args) {
        /*
         * A
         * A B
         * A B C
         * A B C D
         * A B C D F
         * 
         * 
         */
       
        for(int i=0;i<5;i++){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
           
        }
    }
    
}
