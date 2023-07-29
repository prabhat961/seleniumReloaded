package myCodes;

public class printSubs {
    public static void main(String[] args) {
        String s =  "@$#%#Today^%##is^@$an@%_(interview&^^%#";
        for (int i = 0; i <= s.length() -1; i++){
            if (s.charAt(i) >= 'a'|| s.charAt(i) <= 'z'){
                System.out.print(s.charAt(i) +" ");
            }
        }
    }
}
