public class quicksort {
    public static int partition(int arr[], int lb, int ub) {
        int pivot = arr[lb]; // Choose the first element as the pivot
        int start = lb;
        int end = ub;

        while (start < end) {
            while (arr[start] <= pivot && start < end) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        
        arr[lb] = arr[end];
        arr[end] = pivot;
        return end;
    }

    public static void quick_sort(int arr[], int lb, int ub) {
        if (lb < ub) {
            int loc = partition(arr, lb, ub);
            quick_sort(arr, lb, loc - 1);
            quick_sort(arr, loc + 1, ub);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 3, 2, 1, 4, 7, 6 };
        quick_sort(arr, 0, 5);
        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }
    }
}
