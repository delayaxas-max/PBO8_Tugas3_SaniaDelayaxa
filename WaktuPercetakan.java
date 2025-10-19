import java.io.*;

public class WaktuPercetakan {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("=== PERHITUNGAN WAKTU CETAK NOVEL ===");
        
        // Input data
        System.out.print("Masukkan jumlah novel yang akan dicetak: ");
        int jumlahNovel = Integer.parseInt(br.readLine());
        
        System.out.print("Masukkan tebal lembar per novel: ");
        int tebalNovel = Integer.parseInt(br.readLine());
        
        // Hitung total lembar
        int totalLembar = jumlahNovel * tebalNovel;
        
        // Kecepatan mesin: 1 lembar/detik
        int totalDetik = totalLembar;
        
        // Konversi ke hari, jam, menit, detik
        int hari = totalDetik / 86400;
        int sisaHari = totalDetik % 86400;
        
        int jam = sisaHari / 3600;
        int sisaJam = sisaHari % 3600;
        
        int menit = sisaJam / 60;
        int detik = sisaJam % 60;
        
        // Tampilkan hasil
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Jumlah novel: " + jumlahNovel);
        System.out.println("Tebal per novel: " + tebalNovel + " lembar");
        System.out.println("Total lembar: " + totalLembar + " lembar");
        System.out.println("Kecepatan mesin: 1 lembar/detik");
        System.out.println("\nWaktu yang diperlukan:");
        System.out.println(hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");
        
        // Konversi detail
        System.out.println("\n=== KONVERSI DETIK ===");
        System.out.println("Total detik: " + totalDetik + " detik");
        System.out.println("1 menit = 60 detik");
        System.out.println("1 jam = 3600 detik");
        System.out.println("1 hari = 86400 detik");
    }
}