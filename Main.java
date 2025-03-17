public class Main {
    public static void main(String[] args) {
        int[] aba = {2,4,5,1,7,9,3,6,8};
        quickSort(aba, 0, aba.length-1);
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[arr.length-1];
        return pivot;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int low, int high){
        
    }
    /*int mid = (start+end)/2;
        if(array[mid] < target)
            return(bSearch(array, mid+1,end,target));
        else if(array[mid] > target)
            return bSearch(array, start,mid-1,target);
        else
            return mid;*/
}
