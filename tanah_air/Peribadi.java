  //1. Import class
  import java.time.Year ;
  import java. util.Scanner;
  public class Peribadi {
  public static void main (String[] args){

     //2. pengisytirahan pembolehubah Scanner
    Scanner input =new Scanner(System. in);

     //3. Papar text pernyataan 1 & isytihar pembolehubah nilai input 1
    System.out.print("Masukkan mana anda: ");
    String nama = input.next();
    //println ini untuk bagi satu baris dengan bawah
    //print biasa ini pula untuk turun kan ayat2

    //4.  Papar text pernyataan 2 & isytihar pembolehubah nilai input 2
    System.out.print("Masukan tahun anda dilahirkan: ");
    int tahun = input.nextInt();

    //5. papar text pernyataan3 & isytihar pembolehubah nilai input 3
    System.out.print("Masukkan bandar anda dilahirkan:");
    String negeri = input.next();
    input .close();

    //6. Pengiraan umur
    int tahunsemasa = Year.now().getValue();
    int umur =tahunsemasa-tahun;

    //7. Memaparkan output
    System.out.println("Nama: " +nama);
    System.out.println("Umur: " +umur);
    System.out.println("Bandar kelahiran: " +negeri);
  }
}