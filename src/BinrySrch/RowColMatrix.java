package BinrySrch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12,13}
        };
        int target = 13;
        System.out.println(Arrays.toString(matSrch(arr,target)));
    }

    private static int[] matSrch(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;
        while(r < arr.length && c > 0){
            if(arr[r][c] == target){
                return new int[]{r,c};
            }
            else if(target > arr[r][c]){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
