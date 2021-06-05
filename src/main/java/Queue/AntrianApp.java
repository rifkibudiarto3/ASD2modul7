package Queue;
public class AntrianApp {
    public static void main(String[] args) {
       var antrian = new Antrian(10);
        antrian.masuk(40);
        antrian.lihat();
        antrian.masuk(33);
        antrian.lihat();
        System.out.println("Nilai yang paling depan = "+ antrian.peekDepan());
        antrian.masuk(60);
        antrian.lihat();
        System.out.println("Nilai yang diambil dari antrian = "+ antrian.keluar());
        antrian.lihat();
        System.out.println("Nilai yang diambil dari antrian = "+ antrian.keluar());
        antrian.lihat();
        antrian.masuk(54);
        antrian.lihat();
        System.out.println("Nilai yang paling depan = "+ antrian.peekDepan());
    }
}