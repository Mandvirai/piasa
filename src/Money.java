public class Money {import java.util.Scanner;

    class Rupees {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            double price;
            long amount;
            long paise;
            long rupee;
            price = s.nextDouble();
            amount = Math.round(price * 100);
            rupee = amount / 100;
            paise = amount % 100;
            System.out.println(rupee + "Rupees" + paise + "paise");
        }
    }


}
