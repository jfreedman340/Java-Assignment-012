/**
 * I copied and modified this from https://www.javatpoint.com/selection-sort-in-java
 * I made comments describing the code to better understand it
 * and make it more readable for others.
 */
public class SortingAlgorithms {

    public static void selectionSort(int arr[]) {
        //Iterating through our list of elements
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            //Comparing the i'th element with the rest of the list
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index
                }
            }
            //Swapping the elements
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String[] args) {
        //Our array
        int[] numbers = {9,14,3,2,43,11,58,22,1};

        //Sorting our array
        selectionSort(numbers);

        //Showing our results
        System.out.println("");
        System.out.println("Selection Sort Results");
        for(int i:numbers){
            System.out.print(i+" ");
        }
        System.out.println("");
    }

}
