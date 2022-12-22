    //1.  import java.time.Year ;
    import java. util.Scanner;
    public class Soalan1 {
      public static void main (String[] args){

           final double jumlah;
                double purata;
                double peratus;
  
           //2. pengisytirahan pembolehubah Scanner
            Scanner input =new Scanner(System. in);
            System.out.print("Masukkan nilai BM:");
             int BM = input.nextInt();
             
            System.out.print("Masukkan nilai SJ:");
            int SJ = input.nextInt();
              
             //3. Pengiraan markah
              jumlah= BM + SJ;
              purata = jumlah /2;
              peratus = ((jumlah /300)*200);
          
            //4. output
            System.out.println("BM: " +jumlah);
            System.out.println("SJ: " +peratus);
            System.out.println("jumlah:" +peratus);
            input.close();
}
}
