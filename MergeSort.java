public class MergeSort {

    /*It follows the Divide and Conquer approach
    * Time Complexity -> O(n log n)
    * Space Complexity -> O(n)
    * */

    public static void merge(int arr[],int left,int right,int mid){
        int n1=mid-left+1;
        int n2=right-mid;
        int l[]=new int[n1];
        int r[]=new int[n2];
        for(int i=0;i<n1;i++){
            l[i]=arr[left+i];
        }
        for(int i=0;i<n2;i++){
            r[i]=arr[mid+i+1];
        }
        int k=left,i=0,j=0;
        while (i<n1 && j<n2){
            if(l[i]<r[j]){
                arr[k]=l[i];
                i++;
            }
            else{
                arr[k]=r[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=l[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=r[j];
            j++;
            k++;
        }

    }

    public static void splictAndSort(int arr[],int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            splictAndSort(arr,left,mid);
            splictAndSort(arr,mid+1,right);
            merge(arr,left,right,mid);
        }
    }


    public static void main(String[] args) {

        int arr[]=new int[]{8,3,4,12,5,6};
        splictAndSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}