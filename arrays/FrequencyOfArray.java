import java.util.HashMap;

public class FrequencyOfArray {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4,5,4,5};
        int visited[] = new int [arr.length]; // visited = 1, not visited = 0
        for(int i=0;i< arr.length;i++){
            if(visited[i]==1) continue;

            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=1;
                }
            }
            System.out.println(arr[i]+"->"+count);
        }

        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for (int num : arr){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        for(int key : freqMap.keySet()){
            System.out.println(key+"->"+freqMap.get(key));
        }
    }
}
