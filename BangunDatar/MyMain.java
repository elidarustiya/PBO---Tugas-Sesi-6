package tugas6_pbo;

public class MyMain {
    public static void main(String[] args) {
        BangunDatar segitiga=new Segitiga(12, 20);
        BangunDatar lingkaran=new Lingkaran(60);

        System.out.println("Luas dari bangun datar segitiga : "+segitiga.getLuas());
        System.out.println("Luas dari bangun datar luangkaran : "+lingkaran.getLuas());
    }
}