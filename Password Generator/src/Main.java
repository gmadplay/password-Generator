import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<String> passwordList1 = new ArrayList<String>();

        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D",
                "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
                "T", "U", "V", "W", "X", "Y", "Z"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] symbols = {"!", "_", "$", "%", "+", "+"};


        System.out.println("*** Welcome to the Gmad's Password Generator ***\n");
        Scanner scanLetters = new Scanner(System.in);
        System.out.println("How many letters would you like in your password?");
        int scanLetters1 = Integer.parseInt(scanLetters.nextLine());

        Scanner scanNumber = new Scanner(System.in);
        System.out.println("How many numbers would you like in your password?");
        int scanNumber1 = Integer.parseInt(scanNumber.nextLine());

        Scanner scanSymbols = new Scanner(System.in);
        System.out.println("How many letters would you like in your password?");
        int scanSymbols1 = Integer.parseInt(scanSymbols.nextLine());


        for (int i = 0; i < scanLetters1; i += 1) {
            int a = random.nextInt(26);
            passwordList1.add(letters[a]);

        }

        for (int j = 0; j < scanNumber1; j += 1) {
            int b = random.nextInt(9);
            passwordList1.add(numbers[b]);
        }

        for (int k = 0; k < scanSymbols1; k += 1) {

            int c = random.nextInt(6);
            passwordList1.add(symbols[c]);
        }

        Collections.shuffle(passwordList1);
        for (String s : passwordList1) {
            System.out.print(s);
        }


    }


}