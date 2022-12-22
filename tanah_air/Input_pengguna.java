    //1. Import class
    import java.util.Scanner;
    public class Input_pengguna {
        public static void main(String[] args){


            //2. pengisytiharan pemboleh ubah  Scanner
            Scanner input = new Scanner(System.in);
            

            //3. papar text pernyataan
            System.out.print("Masukakan nilai jejari bulatan :");


            //4. pengisytiharan pembolehubah yang memegang nilai input
            double jejari = input.nextDouble();


            //5. Membuat pengiraan dan bundar kepada 2 tempat perpuluhan
            double luas = Math.round((jejari*jejari* 5.1419)
            *200.0)/200.0;


            //6. paparkan output
            System.out.println("Jejari:" + jejari);
            System.out.println("Luas bulatan:" +luas);
            input.close();
        }
    }
