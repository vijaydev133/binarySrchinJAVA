package BinrySrch;

public class BinsrchinRotArr {
    public static void main(String[] args) {
//        int[] arr={4,5,6,7,8,0,1,2,3};
        int[] arr={0,1,2,3,4,5,6,7,8};
        int target = 0;
        int pivot = srchPivot(arr);
        int ans = 0;
        if(pivot == -1){
         ans=   srchin(arr,target,0,arr.length-1);
        }
        else{
            ans = srchin(arr,target,0,pivot);

            if(ans == -1){
                ans = srchin(arr,target,pivot,arr.length-1);
            }

        }
        System.out.println(ans);


    }

   static int srchin(int[] arr, int target, int start, int end){
        while(start <= end){
             int mid = start + ((end - start)/2);
             if(target > arr[mid]){
                 start = mid + 1;
             } else if (target < arr[mid]) {
                 end = mid -1;
             }
             else{
                  return mid;
             }
        }
        return -1;
    }

    private static int srchPivot(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + ((end-start)/2);
            if(arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[mid-1] > arr[mid]){
                return mid-1;
            }

            if(arr[start] >= arr[mid]){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
