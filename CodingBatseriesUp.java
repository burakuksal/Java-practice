public class CodingBatseriesUp {
    public static void main(String[] args) {

    }
    public int[] seriesUp(int n) {
        int idx=0;
        int [] arr = new int[ n*(n + 1)/2];

        for (int i = 1; i<=n;i++){
            for (int k =1;k<=i;k++){
                arr[idx]=k;
                idx++;
            }
        }
            return arr;
    }

}