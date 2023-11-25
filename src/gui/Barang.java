
package gui;

public class Barang {
    String bulan, nama, kondisi, ket;
    double harga;
    int stok;

    public Barang(String bulan, String nama, String kondisi, double harga, int stok, String ket ) {
        this.bulan = bulan;
        this.nama = nama;
        this.kondisi = kondisi;
        this.harga = harga;
        this.stok = stok;
        this.ket = ket;
    }

    public Barang() {
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    
}
