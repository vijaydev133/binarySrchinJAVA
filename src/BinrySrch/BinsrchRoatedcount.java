package BinrySrch;

public class BinsrchRoatedcount {
    public static void main(String[] args) {
        int[] arr = {15,18,19,20,45,66,2,3,6,12};
        int pivot = srchPivot(arr);
        System.out.println(pivot);
        int rCount = checkCount(arr,0,pivot);
        System.out.println(rCount);

    }

    private static int checkCount(int[] arr,int start, int end) {
        int count= 0;
        for(int i = start; i <= end; i++){
            count++;
        }
        return count;
    }

    private static int srchPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
