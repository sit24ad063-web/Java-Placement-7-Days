public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 3, 6};
        int n = arr.length;

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.println("Prefix Sum Array:");
        for (int x : prefix) {
            System.out.print(x + " ");
        }
    }
}
