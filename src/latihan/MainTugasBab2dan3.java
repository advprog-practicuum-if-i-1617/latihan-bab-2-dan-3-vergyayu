import java.util.Scanner;
public class MainTugasBab2dan3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        TugasBab2dan3 convert = new TugasBab2dan3();
        int a =0; String b= null;
        System.out.print("Masukkan angka 1-1000 : ");
        a = in.nextInt();
        convert.konversi(a);
        
        System.out.print("Masukkan kata : ");
        in.nextLine();
        b = in.nextLine();
        convert.konversi(b);
    }
}