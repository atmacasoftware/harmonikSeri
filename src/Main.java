import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Değişkenlerin tanımlanması
        int sayi;
        double harmonikSeri = 1.0;

        //Scanner sınıfnın import edilmesi
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan sayı girilmesi
        System.out.print("N Sayısını giriniz : ");
        sayi = input.nextInt();

        for(int i=2; i<=sayi; i++){
            harmonikSeri += (double )1 / i;
        }

        System.out.println(harmonikSeri);

    }
}