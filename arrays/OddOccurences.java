public class OddOccurences {
    public static void main(String[] args) {
        int[] a = {3, 7, 3, 5};
        System.out.println("Odd occurrence :"+oddOccurrence(a));
    }
    private static int oddOccurrence(int[] a) {
        int res = a[0];
        for (int i = 1; i < a.length; i++) {
            res = res ^ a[i];
        }
        return res;
    }
}
