public class SelectionSort {

    /**Selection Sort -> select one element from give array and compare with all other element and sort
     *Time Complexity -> O(n²)
     *Space Complexity -> O(1)
     * **/


    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int lastIndex=arr.length-i-1;
            int maxIndex=getMaxElememtIndex(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }

    public static int getMaxElememtIndex(int arr[],int start,int lastIndex){
        int max=start;
        for(int i=start;i<=lastIndex;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    public static void swap(int arr[],int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{64, 25, 12, 22, 11 };
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
