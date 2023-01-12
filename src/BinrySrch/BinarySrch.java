package BinrySrch;

public class BinarySrch {
    public static void main(String[] args){
        int[] arr={4,5,7,22,37,57,79,89};
        int target = 79;
        System.out.println(srch(arr,target));
    }

    private static int srch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        int mid = 0;
        while(start <= end){
            mid = start + ((end - start) / 2);
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
