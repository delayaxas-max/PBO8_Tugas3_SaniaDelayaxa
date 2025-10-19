import java.io.*;

public class TotalBuah {
    public static void main(String[] args) throws IOException {
        // Menggunakan InputStreamReader dan BufferedReader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("=== PROGRAM HITUNG TOTAL BUAH ===");
        
        // Input data dari user
        System.out.print("Masukkan jumlah buah mangga yang dibeli: ");
        int buahMangga = Integer.parseInt(br.readLine());
        
        System.out.print("Masukkan jumlah buah jambu per tetangga: ");
        int jambuPerTetangga = Integer.parseInt(br.readLine());
        
        System.out.print("Masukkan jumlah tetangga: ");
        int jumlahTetangga = Integer.parseInt(br.readLine());
        
        System.out.print("Masukkan jumlah mangga yang busuk: ");
        int manggaBusuk = Integer.parseInt(br.readLine());
        
        // Menghitung total buah
        int totalJambu = jambuPerTetangga * jumlahTetangga;
        int manggaBaik = buahMangga - manggaBusuk;
        int totalBuah = manggaBaik + totalJambu;
        
        // Menampilkan hasil
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Buah mangga yang dibeli: " + buahMangga + " pcs");
        System.out.println("Buah mangga yang busuk: " + manggaBusuk + " pcs");
        System.out.println("Buah mangga yang baik: " + manggaBaik + " pcs");
        System.out.println("Buah jambu per tetangga: " + jambuPerTetangga + " pcs");
        System.out.println("Jumlah tetangga: " + jumlahTetangga);
        System.out.println("Total buah jambu: " + totalJambu + " pcs");
        System.out.println("TOTAL SEMUA BUAH: " + totalBuah + " pcs");
    }
}