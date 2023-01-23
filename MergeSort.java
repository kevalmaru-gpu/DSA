public class MergeSort {
    void Sort(int[] arr, int l, int r) {
        int m = (l + r) / 2;

        Sort(arr, l, m);
        Sort(arr, m + 1, r);

        Merge(arr, l, m, r);
    }

    void Merge(int[] arr, int l, int m, int r) {
        int leftArr = m - l + 1;
        int rightArr = r - m;
        int[] L = new int[leftArr];
        int[] R = new int[rightArr];

        for (int i = 0; i < leftArr; i++)
            L[i] = arr[l + i];
        for (int i = 0; i < rightArr; i++) {
            R[i] = arr[m + i];
        }

        int i = l, j = m, k = l;

        while (i < leftArr && j < rightArr) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = L[j];
                j++;
            }
            k++;
        }

        while (i < leftArr) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < rightArr) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void PrintArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        MergeSort ms = new MergeSort();

        ms.Sort(arr, 0, arr.length);
        ms.PrintArr(arr);
    }
}