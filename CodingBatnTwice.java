public class CodingBatnTwice {
    public static void main(String[] args) {

    }

    public String nTwice(String str, int n) {
        String str1 = "";
        str1 = str.substring(0, n) + str.substring(str.length() - n, str.length());
        return str1;

    }

}