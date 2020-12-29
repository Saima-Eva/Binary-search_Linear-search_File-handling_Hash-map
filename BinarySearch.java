
package BinaryJAVA;


public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 11, 13};
        int n = arr.length;
        int x = 4, mid = 0, start = 0, end = n - 1, index = -1;

        while (start <= end) {

            mid = (start + end) / 2;

            if (arr[mid] == x) {
                index = mid;
                break;
            }

            if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (index == -1) {
            System.out.println("Value not found in this Array");
        } else {
            System.out.println("Value found at index: " + index);
        }

    }


    
}