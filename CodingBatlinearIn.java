public class CodingBatlinearIn {
    public static void main(String[] args) {


    }


    public boolean linearIn(int[] outer, int[] inner) {
        int count = 0;
        for (int i = 0; i < inner.length; i++) {
            for (int j = 0; j < outer.length; j++) {
                if (inner[i] == outer[j]) {
                    count++;
                    break;
                }


            }
        }
        if (count == inner.length)
            return true;
        else return false;


    }
}