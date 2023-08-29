package Metotlar;
import java.util.Scanner;
public class RecursiveUsluSayi {
    static int power(int a, int b) {
        int result = 1;
        if (b == 0){
            return 1;
        }else {
            return a* power(a,b-1);
        }
    }

    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban Değeri Giriniz: ");
        a= scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        b= scan.nextInt();

        System.out.println("Sonuç: "+power(a,b));
    }
}
