public class App1 {
    public static int Nbr_Occ(char car, String ch) {
        int count = 0;
        for (char c : ch.toCharArray()) {
            if (c == car) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String mot = "";
        char car = ' ';
        System.out.println("Nbr_Occ('" + car + "', \"" + mot + "\") = " + Nbr_Occ(car, mot));
    }
}