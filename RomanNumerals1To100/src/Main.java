public class Main {

    public static void main(String[] args) {
//        int num = 5542;
//        String number = String.valueOf(num);
//        for(int i = 0; i < number.length(); i++) {
//            int j = Character.digit(number.charAt(i), 10);
//            System.out.println("digit: " + j);
//        }
        int start = 1;
        int end = 101;
        RomanNumerals romanNumerals = new RomanNumerals();
        for(int i = start; i <= end; i++) {
            System.out.println(i + " = " + romanNumerals.change(i));

        }
    }
}
