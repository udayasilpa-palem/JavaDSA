public class Pattern17 {
    public static void main(String[] args) {
        /*
         * 4444444
         * 4333334
         * 4322234
         * 4321234
         * 4322234 
         * 4333334
         * 4444444
         
         */
        int mid=7/2;
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                int row=Math.abs(i-mid);
                int col=Math.abs(j-mid);
                int val=Math.max(row,col)+1;
                System.out.print(val);
            }
            System.out.println();
        }
    }
    
}
