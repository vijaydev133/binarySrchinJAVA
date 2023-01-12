package BinrySrch;

import java.util.Arrays;

public class BinarySrchFLP {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,9,9,9,9,910};
        int target = 910;
      int midval =  srch(arr,target);
        int[] ans = {-1,-1};
        ans[0] = srchin(arr,target,0,midval);
        ans[1] = srchin(arr,target,midval,arr.length);
        System.out.println(Arrays.toString(ans));
    }

    private static int srchin(int[] arr, int target, int start, int end) {
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    private static int srch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start <= end){
            mid = start + ((end - start )/2);
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end  = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
