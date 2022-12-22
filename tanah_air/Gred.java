        // import java.time.Year ;
        import java.util.Scanner;
        public class Gred{
          public static void main (String[] args){
            Scanner input = new Scanner(System.in);
          

            System.out.println("Sila Type Kan Gred Anda Di Bawah Sama Ada Sains Dan MAtametik.");
            
            System.out.print("Sila Masukkan Nilai Gred Sains:");
            int Sains = input.nextInt();

            System.out.print("Sila Masukkan Nilai Gred Sains:");
            int Matametik = input.nextInt();
            input.close();


            // sains
            if (Matametik == Sains)
            {
              // if (Matametik == true)

              {
                System.out.println("Gred yang memperolehi adalah sama");
              }
            }
            else 
            {
              {
                System.out.println("Gred yang diperolehi tidak sama");
              }
            }


          }
}
