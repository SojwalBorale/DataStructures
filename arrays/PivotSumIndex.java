public class PivotSumIndex {
    public static void main(String[] args) {
        int[] nums = {2,8,1,1};
        System.out.println("Index: "+getPivotSumIndex(nums));
    }
    public static int getPivotSumIndex(int [] nums){
        int totalSum = 0;
        for(int arr : nums){
            totalSum += arr;
        }

        int leftSum = 0;
        for(int i=0;i< nums.length;i++){
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
