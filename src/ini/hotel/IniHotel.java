package ini.hotel;

import java.util.Scanner;

public class IniHotel {

    public static void main(String[] args) {
        
        String name;
        int type, waktu;
        
        //instant objek hotel         
        
        tarif hotel = new tarif();
        
        System.out.println("=============== OYO Hotel ===============");
        Scanner nama = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        name = nama.next();
        hotel.setName(name);
        
        System.out.println("\nPilih Jenis Kamar");
        System.out.println("1. Deluxe Room Rp.250.000");
        System.out.println("2. Premium Room Rp.500.000");
        System.out.println("3. Superior Room Rp.750.000");
        
        Scanner pilih = new Scanner(System.in);
        System.out.print("Jenis Kamar Yg dipilih : ");
        type = pilih.nextInt();
        hotel.SetType(type);
        
        Scanner lama = new Scanner(System.in);
        System.out.print("\nBerapa lama??? : ");
        waktu = lama.nextInt();
        hotel.setWaktu(waktu);
        
        System.out.println("======================== Nota =========================");
        System.out.println("Nama Pelanggan      :   " + hotel.getName());
        System.out.println("Jenis Kamar         :   " + hotel.get_kamar());
        System.out.println("Tarif Penginapan    :   Rp." + hotel.get_harga());
        System.out.println("Total Pembayaran    :   Rp." + hotel.get_total());
        System.out.println("=======================================================");
        
        
    }
    
    
    
}
