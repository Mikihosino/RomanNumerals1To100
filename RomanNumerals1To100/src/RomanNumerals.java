public class RomanNumerals {
    int[] eachNum = new int[3];
    private String digit1 = "";
    private String digit2 = "";
    private String result;

    public String change(int number) {
        int n = number;

        if (n > 100) {
            return "Until 100 numbers can change to RomanNumerals";
        }
        if(n > 99){
            result = "C";
        }

        if (n > 9 && n < 100) {
            String num = String.valueOf(n);
            for (int i = 0; i < num.length(); i++) {
                int j = Character.digit(num.charAt(i), 10);
                eachNum[i] = j;
            }

            if (eachNum[0] >= 1 && eachNum[0] <= 3) {
                digit2 = "";
                for (int i = 0; i < eachNum[0]; i++) {
                    digit2 = digit2 + "X";
                }
            }

            if (eachNum[0] == 4) {
                digit2 = "XL";
            }

            if (eachNum[0] <= 8 && eachNum[0] >= 5) {
                digit2 = "L";
                if (!(eachNum[0] == 5)) {
                    for (int i = 5; i < eachNum[0]; i++) {
                        digit2 = digit2 + "X";
                    }
                }
            }

            if (eachNum[0] == 9) {
                digit2 = "XC";
            }


            if (eachNum[1] <= 3) {
                digit1 = "";
                if (!(eachNum[1] == 0)) {
                    for (int i = 0; i < eachNum[1]; i++) {
                        digit1 = digit1 + "I";
                    }
                }
            }

            if (eachNum[1] == 4) {
                digit1 = "IV";
            }

            if (eachNum[1] <= 8 && eachNum[1] >= 5) {
                digit1 = "V";
                if (!(eachNum[1] == 5)) {
                    for (int i = 5; i < eachNum[1]; i++) {
                        digit1 = digit1 + "I";
                    }
                }
            }

            if (eachNum[1] == 9) {
                digit1 = "IX";
            }

            if (eachNum[1] == 10) {
                digit1 = "X";
            }


            result = digit2 + digit1;
            return result;
        }

        if(n <= 9){
            String num = String.valueOf(n);
            for (int i = 0; i < num.length(); i++) {
                int j = Character.digit(num.charAt(i), 10);
                eachNum[i] = j;
            }
            if (eachNum[0] <= 3) {
                digit1 = "";
                if (!(eachNum[0] == 0)) {
                    for (int i = 0; i < eachNum[0]; i++) {
                        digit1 = digit1 + "I";
                    }
                }
            }

            if (eachNum[0] == 4) {
                digit1 = "IV";
            }

            if (eachNum[0] <= 8 && eachNum[0] >= 5) {
                digit1 = "V";
                if (!(eachNum[0] == 5)) {
                    for (int i = 5; i < eachNum[0]; i++) {
                        digit1 = digit1 + "I";
                    }
                }
            }

            if (eachNum[0] == 9) {
                digit1 = "IX";
            }
            result = digit1;
        }

        return result;
    }

}
