
import java.util.Scanner;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk menganti kata
 */
public class GantiKata {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat : ");
        String kata = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        String kataawal = scanner.next();
        System.out.print("Menjadi Kata : ");
        String katabaru = scanner.next();
        String kataganti = kata.replace(kataawal, katabaru);
        System.out.println("\n");
        System.out.println("====Hasil Formattin====");
        System.out.println("Kalimat Awal : " + kata);
        System.out.println("Kalimat Baru : " + kataganti);
    }

}
