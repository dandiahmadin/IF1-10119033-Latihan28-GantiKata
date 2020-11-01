/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119033.latihan28.gantikata;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menggati kata pada sebuah kalimat
 */
public class IF110119033Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    static String kalimat, gantiKata, menjadiKata;
    
    static void inputKalimat() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("====Program Menggati Kata====");
        System.out.println();
        System.out.print("Masukan Kalimat : ");
        kalimat = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = scanner.next();
        System.out.print("Menjadi Kata : ");
        menjadiKata = scanner.next();
        System.out.println();
    }
    
    static String ubahKata(String ubah, String ganti, String menjadi) {
        return ubah = ubah.replaceAll(ganti, menjadi);
    }
    
    static void tampilHasil() {
        System.out.println("=====Hasil Formating=====");
        System.out.println("Kalimat Awal : ".concat(kalimat));
        System.out.println("Kalimat Baru : ".concat(ubahKata(kalimat, gantiKata, menjadiKata)));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        inputKalimat();
        tampilHasil();
    }
    
}
