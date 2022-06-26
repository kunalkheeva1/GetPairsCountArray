import java.util.HashMap;

public class GetPairsCountArray {
   public static int getPairsCountArray(int arr[], int n, int k){
       HashMap<Integer, Integer> map = new HashMap<>();
       int count = 0;
       for(int i= 0; i<n; i++){
           if(map.containsKey(k-arr[i])){
               count = count + map.get(k-arr[i]);
           }if(map.containsKey(arr[i])){
               map.put(arr[i],map.get(arr[i])+1);
           }
           else map.put(arr[i], 1);
       }return count;
   }

    public static void main(String[] args) {

    }
}
