package BinrySrch;

public class BinarysrchFloor {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7,88,99};
        int target = 77;
        System.out.println(srch(arr,target));
    }

    private static int srch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start <= end){
            mid = start + ((end - start)/2);
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else{
                return mid ;
            }
        }
        return arr[end];
    }
}
