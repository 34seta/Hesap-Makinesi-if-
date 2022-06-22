import java.util.Scanner;

import static javax.swing.text.html.HTML.Tag.S;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number1, number2;

        System.out.println("ilk sayiyi giriniz : ");
        number1 = input.nextDouble();
        System.out.println("Diger sayiyi giriniz : ");
        number2 = input.nextDouble();

        System.out.println("Yapacağınız islem seciniz!\n 1.Toplama \n 2.Cıkarman \n 3.Carpman \n 4.Bolme");
        int select = input.nextInt();
        if (select == 1) {
            System.out.println("Toplam = " + (number1 + number2));
        } else if (select == 2) {
            System.out.println("Cıkarma = " + (number1 - number2));
        } else if (select == 3) {
            System.out.println("Carpma = " + (number1 * number2));
        } else if (select == 4) {
            if (number2 != 0) {
                System.out.println("Bolme = " + (number1 / number2));
            } else {
                System.out.println("Sayi sifira bolunemez!");
            }
        } else {
            System.out.println("Gecerli Sayi Giriniz ");
        }


    }
}