public class Pattern12 {
    public static void main(String[] args) {
      

        /* 
         * 1         1
         * 1 2     2 1
         * 1 2 3 3 2 1
         */
        int space=2*(4-1);
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=space;j>0;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space=space-2;
        }
    }
}
