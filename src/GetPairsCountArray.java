import java.util.HashMap;

public class GetPairsCountArray {
   public static int getPairsCountArray(int arr[], int n, int k){

       // to manage to get the runtime On lets put scenario with map
       HashMap<Integer, Integer> map = new HashMap<>();
       //count
       int count = 0;
       for(int i= 0; i<n; i++){
           //if map already contain the other element that make pair with arr[i] then increase the count
           if(map.containsKey(k-arr[i])){
               count = count + map.get(k-arr[i]);
               //but if map contains arr[i] only not its pair, then increase its frequency as following
           }if(map.containsKey(arr[i])){
               map.put(arr[i],map.get(arr[i])+1);
           }
           //and if there is no such element in map then just add one to it
           else map.put(arr[i], 1);
           //return the count at the end
       }return count;
   }

    public static void main(String[] args) {

    }
}
