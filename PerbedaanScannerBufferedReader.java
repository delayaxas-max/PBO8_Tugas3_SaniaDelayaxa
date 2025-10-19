import java.util.Scanner;
import java.io.*;

public class PerbedaanScannerBufferedReader {

    public static void main(String[] args) throws IOException {
        // === MENGGUNAKAN SCANNER ===
        System.out.println("=== MENGGUNAKAN SCANNER ===");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String namaScanner = scanner.nextLine();
        
        System.out.print("Masukkan umur: ");
        int umurScanner = scanner.nextInt();
        
        System.out.println("Hasil Scanner - Nama: " + namaScanner + ", Umur: " + umurScanner);
        
        
        // === MENGGUNAKAN BUFFEREDREADER ===
        System.out.println("\n=== MENGGUNAKAN BUFFEREDREADER ===");
        // InputStreamReader + BufferedReader (seperti yang diajarkan)
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        
        System.out.print("Masukkan nama: ");
        String namaBufferedReader = reader.readLine();
        
        System.out.print("Masukkan umur: ");
        int umurBufferedReader = Integer.parseInt(reader.readLine());
        
        System.out.println("Hasil BufferedReader - Nama: " + namaBufferedReader + ", Umur: " + umurBufferedReader);
        
        
        // === PERBEDAAN ===
        System.out.println("\n=== PERBEDAAN SCANNER DAN BUFFEREDREADER ===");
        System.out.println("1. Scanner: Parsing otomatis (langsung ke int, double)");
        System.out.println("2. BufferedReader: Harus parsing manual (parseInt, parseDouble)");
        System.out.println("3. Scanner: Lebih lambat tapi mudah digunakan");
        System.out.println("4. BufferedReader: Lebih cepat tapi butuh lebih banyak kode");
        System.out.println("5. Scanner: Untuk input sederhana");
        System.out.println("6. BufferedReader: Untuk aplikasi yang butuh performa");
    }
    
}
