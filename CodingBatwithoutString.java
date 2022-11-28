public class CodingBatwithoutString {
    public static void main(String[] args) {

    }

    public static String withoutString(String base, String remove) {
        String strBase = base.toUpperCase();
        String strRemove = remove.toUpperCase();
        String str = "";
        String str2 = "";
        String str3 = remove.toLowerCase();
        String str4 = "";

        for (int i = 0; i < (strBase.length() - strRemove.length()) + 1; i++) {
            if (strBase.substring(i, strRemove.length() + i).equals(strRemove)) {
                str = base.replaceAll(base.substring(i, strRemove.length() + i), "");
                str2 = str.toLowerCase();
                for (int k = 0; k < str2.length() - str3.length() + 1; k++) {
                    if (str2.substring(k, str3.length() + k).equals(str3)) {
                        str4 = str.replaceAll(str.substring(k, strRemove.length() + k), "");
                        return str4;
                    }
                }return str;


            }

        }
        return base;
    }
}