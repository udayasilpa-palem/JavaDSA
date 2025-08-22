import java.util.HashMap;
import java.util.Map;
public class HighestFrequency{
    public static void main(String[] args) {
        int arr[]={3,3,4,4,5};
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int val=0;
            if(hash.containsKey(key)){
             hash.put(arr[i], hash.get(arr[i]) + 1);
            } else {
                hash.put(arr[i], 1);
            }
            
        }
        
        int maxFreq = 0, minFreq = arr.length;
        int maxEle = 0, minEle = 0;
        // Traverse through map and find the elements
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);

    }
}