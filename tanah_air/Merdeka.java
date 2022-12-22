    //1. import class
    import java.util.Scanner;
    public class Merdeka {
        public static void main (String[] args){

            //2. Papar output_makluman awal aturcara
            System.out.println("ATURCARA MENENTUKAN TARIKH SEBELUM / SELEPAS MERDEKA");

            //3. pengisytiharan pembolehubah Scanner
            Scanner input = new Scanner(System.in);
            //4. papar text pertanyaan
            System.out.print("(Tekan Enter)");
            System.out.println("Masukkan tahun lahir anda:");
            int lahir = input.nextInt();
            //5. pengisytiharan pembolehubah input
            int merdeka = 1957;

            //6. Menggunakan struktur kawalan if else
                if (lahir > merdeka){

                    //papar output true (betul)
                    System.out.println("Anda telah dilahirkan selpas merdeka");
                }else{
                    //Di atas adalah kawasan else

                    //paparan output false (salah)
                    System.out.println("Anda dilahirkan sebelum merdeka"); 
                    input.close();
                }
        }
}
