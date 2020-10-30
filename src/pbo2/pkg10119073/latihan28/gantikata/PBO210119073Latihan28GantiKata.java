package pbo2.pkg10119073.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk mengganti kata dalam
 * sebuah kalimat
 *
 */

public class PBO210119073Latihan28GantiKata {

    public static void main(String[] args) {
        String kalimat;
        String gantikata;
        String katabaru;
        String kalimatbaru;
        
        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        kalimat = scanner.nextLine();
        
        System.out.print("Ganti Kata   : ");
        gantikata = scanner.nextLine();
        System.out.print("Menjadi Kata : ");
        katabaru = scanner.nextLine();
        
        kalimatbaru =  (kalimat).replaceAll(gantikata, katabaru);
        System.out.println("");
        System.out.println("========Hasil Formatting========");
        System.out.println("Kalimat Awal : "+kalimat);
        System.out.println("Kalimat Baru : "+kalimatbaru);
    }
    
}
