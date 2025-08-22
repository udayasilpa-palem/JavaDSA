public class ReverseAnArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int i=0;
        int j=arr.length-1;
        reverse(arr,i,j);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    static void reverse(int []arr,int i,int j){
        if(i>=j){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        reverse(arr,i+1,j-1);
         
    }
}
