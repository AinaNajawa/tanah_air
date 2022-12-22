public class Belian {
    public static void main (String[] args) {
        System.out.println( "hello world");//ini adalah display teks
        //1. declare jenis pembolehubah
        String barangan;
        int kuantiti;
        double harga;
        double jumlah;

        //2. assign value (umpukan nilai)
        barangan="Biskut";
        kuantiti=7;
        harga=2.89;
        jumlah=(kuantiti+harga);


        //3. display output
        System.out.println("Info item:"+barangan);
        System.out.println("Unit dibeli :"+kuantiti);
        System.out.println("Harga Seunit: RM"+harga);
        System.out.println("jumlah: RM"+jumlah);
    }
}
