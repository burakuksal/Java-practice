public class SifreKontrol {
    public static void main(String[] args) {

        //          *** Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i)Space haric en az sekiz karakter olmali
        //           ii)En az 1 sembol icermeli//
        //           iii)En az 1 rakam icermeli
       //           iv)En az 1 buyuk harf icermeli
       //           v)En az 1 kucuk harf icermeli

    }public static String sifreKontrol(String str){
        boolean karakter = str.length() > 7;
        boolean sembol = str.replaceAll("[^p\\p{Punct}]", "").length() > 0;
        boolean rakam = str.replaceAll("[^0-9]", "").length() > 0;
        boolean bHarf = str.replaceAll("[^A-Z]", "").length() > 0;
        boolean kHaarf = str.replaceAll("[^a-z]", "").length() > 0;

        if (karakter && sembol && rakam && bHarf && karakter) {

            return "Şifre kaydedildi";
        } else {
            return "Geçersiz şifre";
        }

    }

}
