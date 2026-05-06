public class RepeatingElement {
    public static void main(String[] args) {
        int [] arr = {1,2,4,3,2,1,5};
        printRepeatingElement(arr);
    }
    public static void printRepeatingElement(int[] arr){
        for(int i=0;i<arr.length;i++){
            int index = Math.abs(arr[i]);
            if(arr[index]>=0){
                arr[index] = -arr[index];
            }else{
                System.out.println("repeating element is : "+Math.abs(index));
            }
        }
    }
}
