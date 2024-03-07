public class StringSearch {
    public static void main(String[] args) {
        String word="Voldemort";
        char ch='a';
        System.out.println("Character is present in the string? "+StringSearch(word, ch));
        ch='o';
        System.out.println("Character is present in the string? "+StringSearch(word, ch));
        ch='r';
        System.out.println("Character is present in the string? (But only use a for each loop) ->"+StringSearch2(word, ch));
    }

    static boolean StringSearch(String s,char c){
        if (s.length()==0) {
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                return true;
            }
        }
        return false;
    }

    static boolean StringSearch2(String s,char c){
        for(int el:s.toCharArray()){
            if(el==c){
                return true;
            }
        }
        return false;
    }
}
