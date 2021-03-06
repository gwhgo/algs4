public class Insertion {

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        // Print the array, on a single line
        for (int i = 0; i < a.length; i++)
            StdOut.println(a[i] + " ");
        StdOut.println();
    }


    public static boolean isSorted(Comparable[] a) {
        // Test whether the array entries are in order
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }

    public static void sort(Comparable[] a) {
        // Sort a[] into increasing order.
        int N = a.length;
        for (int i = 1; i < N; i++) {
            // for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
            //     exch(a, j, j - 1);

            int j = i;
            Comparable P = a[j];
            while (j > 0 && less(a[j], a[j - 1])) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = P;
        }
        assert isSorted(a);
    }

    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        Selection.sort(a);
        show(a);
    }
}
