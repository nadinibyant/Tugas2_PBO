package tugas2;

public class Simulator {

        public static void main(String[] args) {

                // upcasting
                Mahasiswa fairuzikun = new Asdos(1, 24);
                System.out.println(fairuzikun.getNama("Fairuzikun") + fairuzikun.getJamSibuk());

                Dosen dosen = new Dosen(5);
                System.out.println(dosen.getNama("Raja OP Damanik") + dosen.getJamSibuk());

                // upcasting
                Mahasiswa angel = new Asdos(4, 20);
                System.out.println(angel.getNama("Angel-chan") + angel.getJamSibuk());

                Mahasiswa firman = new Mahasiswa(20);
                System.out.println(firman.getNama("Firman") + firman.getJamSibuk());

                Mahasiswa nid = new Mahasiswa(23);
                System.out.println(nid.getNama("Nid to pass this sem") + nid.getJamSibuk());

                Dosen nivo = new Dosen(3);
                System.out.println(nivo.getNama("Nivotko") + nivo.getJamSibuk());

                int total = fairuzikun.getJamSibuk() + dosen.getJamSibuk() + angel.getJamSibuk() + nid.getJamSibuk()
                                + nivo.getJamSibuk() + firman.getJamSibuk();
                System.out.println("Total jam sibuk elemen fasilkom adalah " + total);

        }

}
