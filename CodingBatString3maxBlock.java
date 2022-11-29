public class CodingBatString3maxBlock {

    public static void main(String[] args) {

    }

    public int maxBlock(String str) {

        if (str.length() == 0)
            return 0;
        int count = 1;
        int counter = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else count = 1;
            if (count > counter) {
                counter = count;
            }
        }
        return counter;


    }
}