package BinrySrch;

public class BinsrchPeakinMoun {
    public static void main(String[] args) {
        int[] arr = {9,10,12,31};

        System.out.println(srch(arr));
    }

    private static int srch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + ((end - start)/2);
            if( arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            else if(arr[mid] > arr[mid+1]){
                end = mid;
            }
        }
        return start;
    }
}
