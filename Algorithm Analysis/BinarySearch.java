public class BinarySearch {
    static int search(int arr[], int left, int right, int key) {
        int mid = (left + right) / 2;

        if (left >= right) {
            return -1;
        }

        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return search(arr, left, mid - 1, key);
        } else {
            return search(arr, mid + 1, right, key);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        System.out.println(search(arr, 0, arr.length, 7));
    }
}