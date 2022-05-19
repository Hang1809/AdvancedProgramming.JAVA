package sorting_algorithms;

public class InsertionSort {

    static void sort(int arr[]){
        int n = arr.length;
        for (int i =1; i<n ; i++){
            int key = arr[i];
            int j = i -1;

            // doi cho
            //di chuyen den vi tri truoc vi tri hien tai
            while (j >=0 &&  arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= key;
        }
    }


    static void printArray(int arr[]){
        int n = arr.length;
        for (int i =0; i<n ; i++)
            System.out.print(arr[i]+" ");
            System.out.println();

    }

    public static void main(String[] args) {
	    int arr[]= {18,15,22,11,13,5,6};
        System.out.println("Mang ban dau:");
        printArray(arr);
//        InsertionSort newArrSort = new InsertionSort();
        InsertionSort.sort(arr);
        System.out.println("Mang sau khi sap xep :");
        printArray(arr);
    }
}
