public class App3 {
    public static boolean estPalindrome(String ch) {
        String cleanCh = ch.replaceAll("\\s+", "").toLowerCase();
        int n = cleanCh.length();
        for (int i = 0; i < n / 2; i++) {
            if (cleanCh.charAt(i) != cleanCh.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String mot = "radar";
        System.out.println("Le mot \"" + mot + "\" est un palindrome ? " + estPalindrome(mot));
    }
}

