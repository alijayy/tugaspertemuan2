package AliZainalAbidinZaky_2309033_Tugas2;
import java.util.Scanner;

/**
 *
 * @author Ali Zaky
 */
public class Tugas2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan uang anda : ");
        int uang = scanner.nextInt();
        System.out.println("Apakah sekarang hujan? (true/false)");
        boolean hujan = scanner.nextBoolean();
        
        if (uang>5000 && !hujan) {
            System.out.println("Anda membeli gorengan");
        }else {
            System.out.println("Anda tidak membeli gorengan..");
        }
    }   
}