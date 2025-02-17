package AliZainalAbidinZaky_2309033_Tugas2;
import java.util.Scanner;

/**
 *
 * @author Ali Zaky
 */
public class Tugas2_1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama : ");
        int num1 = scanner.nextInt();
        
        System.out.print("Masukkan bilangan kedua : ");
        int num2 = scanner.nextInt();
        
        System.out.print("Masukkan bilangan ketiga : ");
        int num3 = scanner.nextInt();
        
        // Operasi aritmatikanya
        int sum = num1 + num2 + num3;
        int subtract = num1 - num2 - num3;
        int product = num1 * num2 * num3;
        int divide = num1 / num2 / num3;
        
        System.out.println("Hasil penjumlahan : " + sum);
        System.out.println("Hasil pengurangan : " + subtract);
        System.out.println("Hasil perkalian : " + product);
        System.out.println("Hasil pembagian : " + divide);
    }
}
