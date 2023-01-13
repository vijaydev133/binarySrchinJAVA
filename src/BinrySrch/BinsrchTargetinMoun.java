package BinrySrch;

public class BinsrchTargetinMoun {
    public static void main(String[] args) {
        //array = [1,2,3,4,5,3,1], target = 3

        int[] arr = {1,2,3,5,4,3,1};
        int target = 4;
        int peak = srchPeak(arr);
        int ans = srch(arr,target,0,peak);
        if(ans == -1){
         ans =   srch(arr,target,peak, arr.length - 1);
        }

        System.out.println(ans);

    }

    private static int srch(int[] arr, int target, int start, int end) {
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(target > arr[mid]){
                start = mid +1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    private static int srchPeak(int[] arr) {
        //find peak
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
           int mid = start + ((end - start)/2);
           if(arr[mid] > arr[mid+1]){
               end = mid;
           } else if (arr[mid]< arr[mid+1]) {
               start = mid + 1;
           }
        }
       return start;
    }
}
