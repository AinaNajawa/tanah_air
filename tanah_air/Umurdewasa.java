    //1. Import class
    import java.time.Year;
    import java.util.Scanner;
    public class Umurdewasa {

    public static void main(String [] args ) {
    Scanner input = new Scanner(System.in);

    System.out.println("ATURCARA MENGIRA UMUR & PERINGKAT DEWASA");

    //penyataan pertama
    System.out.print("Sila Masukkan Tahun Kelahiran Anda : ");
    int tahun_lahir = input.nextInt();
    input.close();

    int tahun_semasa;
    int umur;

    //operasi
    tahun_semasa = Year.now().getValue();
    umur = tahun_semasa - tahun_lahir;

    //output
    if (umur < 19 ){ System.out.println("Andar Berumur "+ umur +" Anda Belum Cukup Dewasa" );
    } else 
    {
        System.out.println("Anda Telah Cukup Umur Dan Anda Telah Dewasa"); 
      } 
    } 
  }
