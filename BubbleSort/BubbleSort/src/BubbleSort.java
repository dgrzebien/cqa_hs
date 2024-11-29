public class BubbleSort {
    static void bubbleSort(int arr[]) {
        int i, j, temp;
        boolean swapped;
        for(i = 0; i < arr.length -1; i++) {
            swapped = false;
            for(j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j + 1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // no elements swapped
            if(swapped == false) {
                break;
            }
        }
    }

    static void printArray(int arr[]) {
        int i;
        for(i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {

            int arr[] = {64, 34, 25, 12, 22, 11, 90};
            bubbleSort(arr);
            System.out.println("Sorted array: ");
            printArray(arr);
    }
}
