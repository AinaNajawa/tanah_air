import java.util.Scanner;
public class Sfera_jejari {
    public static void main (String[] args) {
   
        //1. pengisytiharan jenis data bagi pemalar dan pembolehubah
        double formula;
        Scanner input = new Scanner(System.in);

        System.out.println("ISI PADU SEBUAH SEFERA");
        System.out.print("Type kan jejeri sfera:");
        double jejari = input.nextDouble();
        input.close();

        //3. Proses pengiraan
        formula=(1.3*3.142*+jejari+jejari+jejari);

        //4. Papar output
        if (formula == formula)
        {
        System.out.println("isi padu sebuah "+jejari+" adalah " +formula+ "jumlah " );
        }
    }
}

