
import java.util.HashMap;


public class Frequency {
    public static void main(String[] args) {
        int arr[]={2,3,4,2,4,6};
        int n=6;
        // int a[]=new int[13];
        // for(int i=0;i<arr.length;i++){
        //     a[arr[i]]+=1;

        // }
        // System.out.println(a[n]);
        HashMap<Integer,Integer>hash=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int k=arr[i];
            int f=0;
            if(hash.containsKey(k))f=hash.get(k);
            f++;
            hash.put(k,f);
        }
        if(hash.containsKey(n))
        System.out.println(hash.get(n));
        
    }
    
}
