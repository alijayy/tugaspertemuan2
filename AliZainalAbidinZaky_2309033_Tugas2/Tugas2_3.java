package AliZainalAbidinZaky_2309033_Tugas2;
import java.util.Scanner;

/**
 *
 * @author Ali Zaky
 */
public class Tugas2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char char1 = scanner.next().charAt(0);
        char char2 = scanner.next().charAt(0);

        int ascii1 = (int) char1;
        int ascii2 = (int) char2;
        
//        int ascii1 = (int) '1'; //kode asciinya 49
//        int ascii2 = (int) '2'; //kode asciinya 50
        
        int sum = ascii1 + ascii2;
        
        System.out.println("kode ASCII-1 : " + ascii1);
        System.out.println("kode ASCII-2 : " + ascii2);
        System.out.println("Hasil jumlahnya :" + sum);
    }
}
