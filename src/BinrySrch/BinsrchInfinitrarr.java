package BinrySrch;

public class BinsrchInfinitrarr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int target = 9;
        System.out.println(srch(arr,target));
    }

    private static int srch(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(arr[end] < target){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        while(start <= end){
           int mid = start + ((end - start)/2);
           if(target > arr[mid]){
               start = mid + 1;
           }
           else if( target < arr[mid]){
               end = mid - 1;
           }
           else{
               return mid;
           }
        }
        return -1;
    }
}
