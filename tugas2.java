import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usia = -1;

    
        while (usia < 0) {
            System.out.print("Masukkan usia Anda (angka positif): ");
            if (scanner.hasNextInt()) {
                usia = scanner.nextInt();
                if (usia < 0) {
                    System.out.println("Input tidak valid. Usia harus angka positif.");
                }
            } else {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.next(); // Membersihkan input yang tidak valid
            }
        }

        
        String kategori;
        if (usia >= 0 && usia <= 12) {
            kategori = "Anak";
        } else if (usia >= 13 && usia <= 19) {
            kategori = "Remaja";
        } else if (usia >= 20 && usia <= 64) {
            kategori = "Dewasa";
        } else {
            kategori = "Lansia";
        }

       
        System.out.println("Kategori usia Anda: " + kategori);
    }
}
