import java.util.Arrays;

public class leetcodefindMedianSortedArrays {
    public static void main(String[] args) {

    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int idx=0;


        int [] arr =new int[nums1.length+nums2.length];

        for (int w:nums1){
            arr[idx]=w;
            idx++;
        }
        for (int k:nums2){
            arr[idx]=k;
            idx++;

        }
        Arrays.sort(arr);

        if (arr.length%2==0){
            int a = arr[arr.length/2];
            int b= arr [(arr.length/2)-1];
            return (double)(a+b) /2;
        }else return arr[(arr.length /2)] ;






    }
}