public class Main {
    public static void main(String[] args) {

    }
    public int countYZ(String str) {
        String str2=str.toLowerCase();
        int count1=0;
        int count2=0;

        if ((str2.charAt(str2.length()-1)=='y')||str2.charAt(str2.length()-1)=='z')
            count1++;

        for (int j=0;j<str2.length()-1;j++){
            if (((str2.charAt(j)=='y')&&!Character.isLetter(str2.charAt(j+1)))||
                    ((str2.charAt(j)=='z')&&!Character.isLetter(str2.charAt(j+1)))){
                count2++;
            }
        }
        return count2+count1;
    }
}