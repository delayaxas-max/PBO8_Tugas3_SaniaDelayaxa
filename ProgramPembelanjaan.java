import java.io.*;
public class ProgramPembelanjaan {

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
       
        System.out.print("Nama: ");
        String nama = dis.readLine();
        
        System.out.println("Total Belanja: ");
        double totalBelanja = Double.parseDouble(dis.readLine());
        
        System.out.println("Diskon (%): ");
        double diskon = Double.parseDouble(dis.readLine());
        
        
        double total = totalBelanja - (totalBelanja * diskon / 100);
        
        System.out.println("Bayar: ");
        double Bayar = Double.parseDouble(dis.readLine());
        
        double kembalian = Bayar - total;
        
        System.out.println("Nama: " +nama);
        System.out.println("Total Belanja: "+totalBelanja);
        System.out.println("Diskon: "+diskon+"%");
        System.out.println("Total: "+total);
        System.out.println("Bayar: "+Bayar);
        System.out.println("Kembalian: " +kembalian);
        
    }
    
}
