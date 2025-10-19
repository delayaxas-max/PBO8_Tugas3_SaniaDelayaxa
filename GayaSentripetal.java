import java.util.Scanner;

public class GayaSentripetal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan massa (kg): ");
        double massa = input.nextDouble();
        
        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = input.nextDouble();
        
        System.out.print("Masukkan jari-jari (m): ");
        double jariJari = input.nextDouble();
        
        // Rumus F = (m * v²) / r
        double gayaSentripetal = (massa * Math.pow(kecepatan, 2)) / jariJari;
        
        System.out.println("Gaya Sentripetal: " + gayaSentripetal + " Newton");
    }
    
}
