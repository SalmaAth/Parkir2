package Parkir;
import java.util.Scanner;
public class Parkir {
	public int jumlahMaxMotor = 10;
    public int jumlahMaxMobil = 5;
    public int jumlahMaxTruk = 2;
    public String keyword;
    public void dataKendaraan() {
        System.out.println("Lahan Parkir Motor yang tersedia : " + jumlahMaxMotor);
        System.out.println("Lahan Parkir Mobil yang tersedia : " + jumlahMaxMobil);
        System.out.println("Lahan Parkir Truk yang tersedia : " + jumlahMaxTruk);
        next();
    }
    public String sambutan() {
        System.out.println("Selamat datang di aplikasi parkir kelompok 2");
        System.out.println("Silahkan inputkan nomor kendaraan");
        System.out.println("atau tekan tombol F untuk informasi kendaraan di lahan parkir");
        proses();
        return null;
    }
    public void proses() {
        Scanner sc = new Scanner(System.in);
        keyword = sc.nextLine();
        if (keyword.equalsIgnoreCase("F")) {
            dataKendaraan();
        } else {
            input();
        }
    }
    public void next(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tekan Y Untuk Melanjutkan");
        System.out.println("Tekan X Untuk Selesai");
        keyword = sc.nextLine();
        if (keyword.equalsIgnoreCase("Y")) {
            sambutan();
        } else if (keyword.equalsIgnoreCase ("X")) {
            penutup();
        }
    }
    public void penutup(){
        System.out.println("Terima Kasih Program Selesai!");
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kendaraan apa?");
        System.out.println("Tekan tombol :");
        System.out.println("A. Motor");
        System.out.println("B. Mobil");
        System.out.println("C. Truk");
        keyword = sc.nextLine();
        if (keyword.equalsIgnoreCase("A")) {
            jumlahMaxMotor = jumlahMaxMotor - 1;
            if (jumlahMaxMotor == 0) {
                System.out.println("Parkiran Penuh! Tidak Bisa Menampung Kendaraan Ini Lagi");
            }
                next();
        } else if (keyword.equalsIgnoreCase("B")) {
            jumlahMaxMobil = jumlahMaxMobil - 1;
            if (jumlahMaxMobil == 0) {
                System.out.println("Parkiran Penuh! Tidak Bisa Menampung Kendaraan Ini Lagi");
            }
                next();
        } else if (keyword.equalsIgnoreCase("C")) {
            jumlahMaxTruk = jumlahMaxTruk - 1;
            if (jumlahMaxTruk == 0) {
                System.out.println("Parkiran Penuh! Tidak Bisa Menampung Kendaraan Ini Lagi");
            }
                next();
        }
    }

}
