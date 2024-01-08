public class MyString {
    public int returnNumberOfCharacters(String cuvant){
        return cuvant.length();
    }

    public String concatenation(String string1, String string2, String string3){
        return string1+string2+string3;
    }

    public boolean stringVocala(String string){
        String cuvant = string.toLowerCase();
        if (    cuvant.charAt(0)=='a' ||
                cuvant.charAt(0)=='e' ||
                cuvant.charAt(0)=='i' ||
                cuvant.charAt(0)=='o' ||
                cuvant.charAt(0)=='u'
        ){
            return true;}
            else return false;
    }

    public String inversCuvant(String cuvant) {
        String invers = "";
        for (int i = cuvant.length() - 1; i >= 0; i--) {
            invers = invers + cuvant.charAt(i);
        }
        return invers;
    }
}