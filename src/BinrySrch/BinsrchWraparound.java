package BinrySrch;

public class BinsrchWraparound {
    public static void main(String[] args) {
        char[] arr = {'a','e','i','o','u'};
        char target = 'u';
        System.out.println((char) srch(arr, target));
    }

    private static int srch(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start <= end){
            mid = start + ((end -start)/2);
            if(target > arr[mid]){
                start = mid + 1;

            }else if(target < arr[mid]){
                end = mid - 1;

            }else{
                if(start == arr.length - 1){
                    return arr[0];
                }
                else{
                    return arr[start + 1];
                }

            }
        }
        return arr[start % arr.length];
    }
}
