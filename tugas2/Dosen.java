package tugas2;

//polymorphism
public class Dosen extends Elemen {
    private int jumlahHariKerja;

    public Dosen(int jumlahHariKerja) {
        this.jumlahHariKerja = jumlahHariKerja;
    }

    public int getJamSibuk() {
        return jumlahHariKerja * 8;
    }

    @Override
    String getNama(String nama) {
        return nama + " adalah seorang dosen dengan jam sibuk ";
    }

}
