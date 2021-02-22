package Medium;

public class breakPalindrome {
    public static void main(String[] args) {
        System.out.println(palindromeBreak("aba"));
    }
    public static String palindromeBreak(String palindrome){
        int length = palindrome.length();
        int N = length/2;
        boolean done = false;
        StringBuilder newString = new StringBuilder(palindrome);

        if(length == 1)
            return "";
        for(int i = 0; i < N; i++){
            if(palindrome.charAt(i) != 'a'){
                newString.replace(i,i+1,"a");
                done = true;
                break;
            }
        }
        if(done) {
        }
        else {
            for (int i = 0; i < N; i++) {
                if (palindrome.charAt(i) == 'a') {
                    newString.replace(length - 1 - i, length, "b");
                    done = true;
                    break;
                }
            }
        }
        return newString.toString();
    }
}
