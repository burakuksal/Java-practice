public class CodingBatsumNumbers{
    public static void main(String[] args) {



    }

    public static int sumNumbers(String str) {
        String str1 = str + "a";
        String str3 = "";
        String str2 = "";
        str2 = str1.replaceAll("[^0-9]", " ");
        int total = 0;


        for (int i = 0; i < str2.length(); i++) {
            if (!(str2.charAt(i) == ' ')) {
                str3 += str2.charAt(i);


            } else {
                if (!(str3.isEmpty())) {
                    total += Integer.parseInt(str3);
                    str3 = "";
                }


            }


        }
        return total;

    }
}