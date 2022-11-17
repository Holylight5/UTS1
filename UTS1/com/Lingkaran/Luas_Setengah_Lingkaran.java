
package UTS1.com.Lingkaran;

public class Luas_Setengah_Lingkaran implements UTS1.com.BangunDatar.BangunDatar {
    double jari2;
    double luasSetengahLingkaran;

    public Luas_Setengah_Lingkaran(double diameter) {
        this.jari2 = diameter / 2;
    }

    @Override
    public void luas() {
        luasSetengahLingkaran = jari2 * jari2 * 3.14 * 0.5;
    }

    @Override
    public double getLuas() {
        return luasSetengahLingkaran;
    }

}
