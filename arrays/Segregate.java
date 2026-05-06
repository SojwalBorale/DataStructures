public class Segregate {
    public static void main(String[] args) {
        int [] arr = {0,1,0,1,0,1,0,1};
        for (int num : arr){
            System.out.print(num+" ");
        }
        System.out.println("\nafter segregate");
        segregateArray(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
    public static  void segregateArray(int [] arr){
            int left = 0;
            int right = arr.length-1;
            while (left<=right){
                while(arr[left]==0 && left<right)  left++;
                while(arr[right]==1 && left<right)  right--;
                if(left<right){
                    arr[left] = 0;
                    arr[right] = 1;
                    left++;
                    right--;
                }
            }
    }
}
