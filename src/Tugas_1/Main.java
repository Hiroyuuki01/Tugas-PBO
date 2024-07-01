package Tugas_1;

class Main {
    public String nama = "Uhuy";
    public char kelamin = 'L';
    public int umur = 1;
    public void namaKucing() {
        System.out.println("Nama: " +nama);
    }
    public void kelaminKucnig() {
        System.out.println("Id " +kelamin);
    }
    public void umurKucing() {
        System.out.println("Umur: " +umur);
    }

    public static void main(String[] args) {
        Main kelinci = new Main();
        kelinci.namaKucing();
        kelinci.kelaminKucnig();
        kelinci.umurKucing();
    }
}
