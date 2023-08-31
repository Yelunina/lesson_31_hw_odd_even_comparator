
/*Write OddEvenComparator implementing Comparator with the method compare for sorting
an array of Integers in the order: The even integers should go before odd numbers.
Написать OddEven компаратор с методом компаратор, который сортирует массив целых чисел в следующем порядке.
Сначала идут числа четные, а потом нечетные.
 */
import java.util.*;
public class OddEvenComparator {
    // Creating custom comparator
    static boolean comparecust(Integer a, Integer b) {

        // If both are odd or even
        // then sorting in increasing order
        if ((a & 1) == (b & 1)) {
            return a < b;
        }

        // Sorting on the basis of last bit if
        // if one is odd and the other one is even
        return (a & 1) < (b & 1);
    }

    // Function to
    static void separateOddEven(Integer[] arr, int N) {
        // Separating them using sort comparator
        Arrays.sort(arr, new Comparator<Integer>() {

            @Override
            public int compare(Integer a, Integer b) {
                // If both are odd or even
                // then sorting in increasing order
                if ((a & 1) == (b & 1)) {
                    return a < b ? -1 : 1;
                }

                // Sorting on the basis of last bit if
                // if one is odd and the other one is even
                return ((a & 1) < (b & 1)) ? -1 : 1;
            }

        });

        for (int i = 0; i < N; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Integer arr[] = {12, 15, 6, 2, 7, 13, 9, 4};
        int N = arr.length;
        separateOddEven(arr, N);
    }
}
