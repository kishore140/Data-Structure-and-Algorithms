public class InsertionSort {

    /*Time Complexity -> O(n²) Space Complexity -> O(1)*/

    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int val=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>val){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=val;
        }
    }

    public static void main(String[] args) {
        int arr[]=new int[]{733,2323,345,24,1};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}