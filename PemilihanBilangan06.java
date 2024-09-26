import java.util.Scanner;
public class PemilihanBilangan06 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.print("masukkan sebuah angka: ");
        int angka = input.nextInt();
        String hasil;
       
        input.close();
        hasil=angka % 2 == 0 ? ("Angka " + angka + " termasuk bilangan genap") : ("Angka " + angka + " termasuk bilangan ganjil");

            System.out.println(hasil);
    }
}