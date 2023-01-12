package BinrySrch;

public class BinarySrchCeiling {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,17,29};
        int target = 16;
        System.out.println(srch(arr,target));
    }

    private static int srch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        if(target > arr[arr.length - 1]){
            return -1;
        }
        while(start < end){
            mid = start + ((end - start)/2);
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return arr[start];
    }
}
