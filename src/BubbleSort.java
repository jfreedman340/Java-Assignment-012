/**
 * I copied and modified this from https://www.javatpoint.com/bubble-sort-in-java
 */

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        //Our array
        int arr[] ={3,60,35,2,45,320,5,1,235,645,45,784};

        //Sorting array
        bubbleSort(arr);

        //Showing the user our results
        System.out.println("");
        System.out.println("Bubble Sort Results");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
