import java.io.*;

public class SelisihWaktu {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("=== SELISIH WAKTU ===");
        
        // Input waktu pertama
        System.out.println("Masukkan Waktu Pertama:");
        System.out.print("Jam: ");
        int jam1 = Integer.parseInt(br.readLine());
        System.out.print("Menit: ");
        int menit1 = Integer.parseInt(br.readLine());
        System.out.print("Detik: ");
        int detik1 = Integer.parseInt(br.readLine());
        
        // Input waktu kedua
        System.out.println("\nMasukkan Waktu Kedua:");
        System.out.print("Jam: ");
        int jam2 = Integer.parseInt(br.readLine());
        System.out.print("Menit: ");
        int menit2 = Integer.parseInt(br.readLine());
        System.out.print("Detik: ");
        int detik2 = Integer.parseInt(br.readLine());
        
        // Konversi ke detik
        int totalDetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
        int totalDetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;
        
        // Hitung selisih
        int selisihDetik = Math.abs(totalDetik1 - totalDetik2);
        
        // Konversi ke hari, jam, menit, detik
        int hari = selisihDetik / 86400;
        int sisaHari = selisihDetik % 86400;
        
        int jam = sisaHari / 3600;
        int sisaJam = sisaHari % 3600;
        
        int menit = sisaJam / 60;
        int detik = sisaJam % 60;
        
        // Tampilkan hasil
        System.out.println("\n=== HASIL SELISIH WAKTU ===");
        System.out.println("Waktu pertama: " + jam1 + " jam, " + menit1 + " menit, " + detik1 + " detik");
        System.out.println("Waktu kedua: " + jam2 + " jam, " + menit2 + " menit, " + detik2 + " detik");
        System.out.println("Selisih: " + hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");
    }
}