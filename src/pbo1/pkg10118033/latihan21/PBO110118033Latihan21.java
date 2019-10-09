
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menghitung rata-rata
 * nilai
 *  
 */

package pbo1.pkg10118033.latihan21;

import java.util.Scanner;

public class PBO110118033Latihan21 {
    public static void main(String[] args) {
        Scanner kibord = new Scanner(System.in);
        int n;
        double nilai , rata , jumlah;
        
        System.out.print("Masukkan banyaknya Mahasiswa : ");
        n = kibord.nextInt();
        jumlah = 0;
        for(int i=1;i<=n;i++){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilai = kibord.nextInt();
            jumlah = jumlah + nilai;
        }
        rata = jumlah/n;
        System.out.println("\nMaka, rata-rata Nilainya adalah "+rata);
        System.out.println("(Developed By : Ikrar AB)");
        
    }
}
