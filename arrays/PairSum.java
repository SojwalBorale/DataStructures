import java.util.Arrays;
import java.util.HashMap;

public class PairSum {
    public static void main(String[] args) {
        int arr[] = {1,2,-2,-1,0};
        int n = arr.length;
        int x = -2;
        pairSum(arr,x);

        System.out.println(hashPair(arr,x));


    }
    public static void pairSum(int [] arr, int x){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j] == x){
                    System.out.println("Pair: ("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }
    public static boolean hashPair(int[] a,int sum){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(sum-a[i])){
                return true;
            }else map.put(a[i],a[i]);
        }
        return false;
    }
}
