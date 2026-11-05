public class Division {

    public static void main(String[] args) {

        int number = 75738;

        int tempNumber = 0;

        String swap = String.valueOf(number);

        String digit = "";

        for(int i = 0; i < swap.length(); i++) {

                digit = swap.substring(swap.length()-1);

                tempNumber = Integer.parseInt(swap.substring(0, swap.length() - 1));

                tempNumber = tempNumber + Integer.parseInt(digit) * 4;

                swap = String.valueOf(tempNumber);

                tempNumber = Integer.parseInt(swap);

        }

        System.out.println(tempNumber % 13 == 0 ? "Divisivel por 13" : "Não é divisivel por 13");

    }

}
