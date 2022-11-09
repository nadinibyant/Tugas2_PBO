package tugas2;

//polymorphism
public class Asdos extends Mahasiswa {

    private int jamNgasdos;

    public Asdos(int jamNgasdos, int sks) {
        super(sks);
        this.jamNgasdos = jamNgasdos;
    }

    public int getJamSibuk() {
        return super.getJamSibuk() + jamNgasdos;
    }

    @Override
    String getNama(String nama) {
        return nama + " adalah seorang asdos dengan jam sibuk ";
    }
}
