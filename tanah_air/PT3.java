    // import java.time.Year;
    import java.util.Scanner;
    public class PT3 {
        public static void main (String[] args){ 
               
                int Bahasa_Inggeris;
                int Matametik;
        
   Scanner input =new Scanner(System. in);
    System.out.println("JIKA ANDA LULUS ANDA LAYAK MEMASUKI KELAS 4 KOMPUTER.");

   System.out.print("Berapakah A yang anda memperolehi dalam PT3:");
   int Markah = input.nextInt();

   System.out.print("Adakah Matametik anda  A  dan adakah Bahasa_Inggeris juga A: ");
   boolean keputusan = input.nextBoolean();
   input.close();

      if (Markah >=5)
    {
        if (keputusan == true)
        {
            System.out.println("Anda gagal dan cuba sekali lagi");
        }
        else
        {
            System.out.println("Tahniah anda layak memasuki kelas 4 Sains komputer");
        }
      }     
     }
    }