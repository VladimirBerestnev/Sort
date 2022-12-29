import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        int[] myArray = new int[]{15,95,86,74,85,96,45,24,89};

        heapSort(myArray, 9);
    }

    public static void heapSort(int[] myArray, int length) {
        int temp;
        int size = length - 1;
        for (int i = (length / 2); i >= 0; i--) {
            sorting(myArray, i, size);
        }

        for (int i = size; i >= 0; i--) {
            temp = myArray[0];
            myArray[0] = myArray[size];
            myArray[size] = temp;
            size--;
            sorting(myArray, 0, size);
        }
        System.out.println(Arrays.toString(myArray));
    }

    public static void sorting(int[] myArray, int i, int size) {
        int a = 2 * i;
        int b = 2 * i + 1;
        int maxElement;
        if (a <= size && myArray[a] > myArray[i]) {
            maxElement = a;
        } else {
            maxElement = i;
        }
        if (b <= size && myArray[b] > myArray[maxElement]) {
            maxElement = b;
        }
        if (maxElement != i) {
            int temp = myArray[i];
            myArray[i] = myArray[maxElement];
            myArray[maxElement] = temp;
            sorting(myArray, maxElement, size);
        }

    }
}
