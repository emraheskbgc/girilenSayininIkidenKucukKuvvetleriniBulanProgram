import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz = ");
        sayi = input.nextInt();



        for (int i=1; i<=sayi; i*=2){
            System.out.println(i);
        }
    }
}
