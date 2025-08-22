public class Pattern11 {
    public static void main(String[] args) {
        /* 1 
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1
         */

         for(int i=1;i<=5;i++){
            int stars=1;
            if(i%2==0) stars=0;
            else stars=1;
            for(int j=1;j<=i;j++){
               
                System.out.print(stars);
                stars=1-stars;
            }
            System.out.println();
         }
    }
    
}
