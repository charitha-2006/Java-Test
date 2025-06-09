public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 10, 12};
        int key = 8;
        int result = binarySearch(arr, key);
        
        if (result == -1)
            System.out.println("Not Found");
        else
            System.out.println("Element found at index " + result);
    }

    static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}