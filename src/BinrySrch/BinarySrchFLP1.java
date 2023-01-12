package BinrySrch;

import java.util.Arrays;

public class BinarySrchFLP1 {
    public static void main(String[] args) {

        int[] arr = {1,5,6,8,8,9,9,9,9,10};

        int target = 9;
        boolean isFirstInd;
        int start = srch(arr,target,true);
        int end = srch(arr,target,false);
        System.out.println(start + " "+ end);


    }

    private static int srch(int[] arr, int target, boolean isFirstInd) {
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;
        while(start <= end){
          int  mid = start + ((end - start)/2);
          if(target > arr[mid]){
              start = mid  + 1;
          }else if(target < arr[mid]){
              end = mid -1;
          }
          else{
              ans = mid;
              if(isFirstInd){
                  end = mid - 1;
              }
              else{
                  start = mid + 1;
              }
          }
        }
        return ans;
    }
}
