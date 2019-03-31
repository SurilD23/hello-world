public class Run {

    // check if a String has all unique characters

    public static void main(String[] args) {

        //System.out.println(isUnique("yup"));

        //System.out.println(isPermutation("abcd", "apod"));

        System.out.println(urlIfy("Mr. New Shoe"));

    }

    public static String urlIfy(String a){

        //a.replace(" ", "%");

        char[] aArray = a.toCharArray();

        for (int i = 0; i < aArray.length; i++){
            if(aArray[i] == ' '){

            }
        }

        return a.replace(" ", "%");
    }

    public static boolean isPermutation(String a, String b) {

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        Arrays.sort(aArray);
        Arrays.sort(bArray);

        int aLength = aArray.length;
        int bLength = bArray.length;

        if (aLength != bLength) {
            return false;
        }

        for (int i = 0; i < aLength - 1; i++) {
            if (aArray[i] != bArray[i]) {
                return false;
            }
        } return true;
    }

    public static boolean isUnique(String s){

        char[] chArray = s.toCharArray();
        Arrays.sort(chArray);
        for (int i = 0; i <chArray.length -1; i++){

            if(chArray[i] != chArray[i + 1]) continue;

            else return false;
        }
        return true;
    }

}