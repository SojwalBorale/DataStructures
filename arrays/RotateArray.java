public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 500};
        if (arr.length > 100000) return;
        System.out.println("Before rotations");
        for (int n : arr) {
            System.out.print(n + "\t");
            if (n > 1000000) return;
        }

        arr = leftRotate(arr,3);
        if(arr == null)return;
        System.out.println("\nAfter rotation");
        for(int n:arr){
            System.out.print(n+"\t");
        }
    }
        public static int[] leftRotate(int[] arr, int r){
           if(r>arr.length) return null;
           for(int i=0;i<r;i++){
               int temp = arr[0];
               for(int j=0;j<arr.length-1;j++){
                   arr[j] = arr[j+1];
               }
               arr[arr.length-1] = temp;
           }
           return arr;
        }
    }

