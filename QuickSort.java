public class QuickSort{
    static void swap(int[] arr, int a, int b){
        int t;

        t = arr[a];
        arr[a] = arr[b];
        arr[b] = t; 
    }

    int partition(int[] arr, int l, int r){
        int pivot = r;
        int j = l - 1;

        for (int i=l; i<r; i++){
            if (arr[i] < arr[pivot]){
                swap(arr, ++j, i);
            }
        }

        swap(arr, j+1, r);

        return j+1;
    }

    void print(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        QuickSort sort = new QuickSort();
        int[] arr = {1, 2, 3, 7, 4, 0};

        sort.partition(arr, 0, arr.length - 1);
        sort.print(arr);
    }
}