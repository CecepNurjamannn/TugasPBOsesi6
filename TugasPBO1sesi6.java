
package tugaspbo1sesi6;

public class TugasPBO1sesi6 {

    public static void main(String[] args) {
        BangunDatar segitiga=new SegiTiga(12, 20);
        BangunDatar lingkaran=new Lingkaran(60);

        System.out.println("Luas dari bangun datar segitiga : "+segitiga.getLuas());
        System.out.println("Luas dari bangun datar luangkaran : "+lingkaran.getLuas());
    }
    
}
