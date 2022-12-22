public class Luas_bulatan {
    public static void main (String[] args) {
        System.out.println( "Selamat Datang");//ini adalah display teks
        
        //1. pengisytiharan jenis data bagi pemalar dan pembolehubah
        final double Pi= 3.14159;
        double jejari, luas;

        //2. Umpukan nilai bagi pembolehubah
        jejari=20;


        //3. Proses pengiraan
        luas=Pi*jejari*jejari;

        //4. Papar output
        System.out.println("luas bagi bulatan yang mempunyai jejari "+jejari+" adalah " +luas+ "cm persegi " );
    }
}
