public class Main {
    public static void main(String[] args) {

        // Deklarasi variabel dan tipe data
        String nama = "Mohamad Ridho Sunami";
        String tempatTanggalLahir = "Bogor, 31 Desember 2004";
        String jenisKelamin = "Laki-Laki";
        String alamat = "Jl. Kp. Cimande No.15, Cimande, Kec. Caringin, Kabupaten Bogor, Jawa Barat 16730";
        String noHandphone = "085778471498";
        double penghasilan = 3000000.00;

        // Menampilkan biodata
        System.out.println("Assalamu'alaikum Wr. Wb.");
        System.out.println("Izinkan saya memperkenalkan diri.");
        System.out.println();

        System.out.println("Nama Lengkap       : " + nama + " (String)");
        System.out.println("Tempat & Tgl Lahir : " + tempatTanggalLahir + " (String)");
        System.out.println("Jenis Kelamin      : " + jenisKelamin + " (String)");
        System.out.println("Alamat Lengkap     : " + alamat + " (String)");
        System.out.println("No Handphone       : " + noHandphone + " (String)");
        System.out.printf("Penghasilan Sebulan: Rp %,.2f (double)%n", penghasilan);

        System.out.println();
        System.out.println("Terima kasih.");
        System.out.println("Wassalamu'alaikum Wr. Wb.");
    }
}