//1. Import class
    import java.util.Scanner;
    public class Soalan3{
    public static void main(String[] args){

    //2. declaration jenis data pembolehubah
      double nn = 35.5;
      double cf = 87.67;
      double km = 56.99;

    //3. untuk memangil declaration di atas
      nn = nn/10;
      cf = (cf* 9/5 +32);
      km = km/54.475610;

      //4. output
      System.out.println("Nilai unit untuk Milimeter kepada Centimeter:" + nn);
      System.out.println("Nilai unit untuk Calcius kepada Fahrenheit:" + cf);
      System.out.println("Nilai unit untuk Kilometer kepada Batu:" + km); 
    }
}
