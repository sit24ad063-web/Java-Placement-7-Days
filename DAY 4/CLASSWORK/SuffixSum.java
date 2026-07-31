public class SuffixSum {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 3, 6};
        int n = arr.length;

        int[] suffix = new int[n];

        suffix[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }

        System.out.println("Suffix Sum Array:");

        for (int x : suffix) {
            System.out.print(x + " ");
        }
    }
}