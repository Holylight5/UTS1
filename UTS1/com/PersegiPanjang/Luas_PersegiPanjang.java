
package UTS1.com.PersegiPanjang;

public class Luas_PersegiPanjang implements UTS1.com.BangunDatar.BangunDatar{
    double panjang;
    double lebar;
    double luasPersegiPanjang;

    public Luas_PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void luas() {
        luasPersegiPanjang = this.panjang * this.lebar;
    }

    @Override
    public double getLuas() {
        return luasPersegiPanjang;
    }
}
