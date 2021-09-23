class PetugasLab {
    String nama, jenisKelamin, jabatan, alamat, nomorTelepon;
    int id;
    public PetugasLab(String nama, String jenisKelamin, String jabatan, String alamat, int id, String nomorTelepon){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.jabatan = jabatan;
        this.alamat = alamat;
        this.id = id;
        this.nomorTelepon = nomorTelepon;
    }
    String setNama(){
        return "Nama : " +nama;
    }
    String setJenisKelamin(){
        return "Jenis Kelamin : " +jenisKelamin;
    }
    String setJabatan(){
        return "Jabatan : " +jabatan;
    }
    String setAlamat(){
        return "Alamat : " +alamat;
    }
    int getId(){
        return id;
    }
    String setNomorTelepon(){
        return "Nomor Telepon : " +nomorTelepon;
    }
}

class Barang{
    String namaBarang, keterangan;
    int id;
    public Barang(String namaBarang, String keterangan, int id){
        this.namaBarang = namaBarang;
        this.keterangan = keterangan;
        this.id = id;
    }
    String setNamaBarang(){
        return "Nama Barang :" +namaBarang;
    }
    String setKeterangan(){
        return "Keterangan :" +keterangan;
    }
    int getId(){
        return id;
    }
}

public class entitas{
    public static void main(String[] args) {
        PetugasLab petugas1 = new PetugasLab("Billy", "Laki-laki", "Kepala Lab", "Perumahan Gunung Batu No.20", 101010, "089672752708");
        System.out.println("~~ Entitas Petugas Lab ~~");
        System.out.println(petugas1.setNama());
        System.out.println(petugas1.setJenisKelamin());
        System.out.println(petugas1.setJabatan());
        System.out.println(petugas1.setAlamat());
        System.out.println("Id :" +petugas1.getId());
        System.out.println(petugas1.setNomorTelepon());
        System.out.println("");
        System.out.println("~~ Entitas Barang ~~");
        Barang barang1 = new Barang("Meja", "Tersedia", 1234);
        System.out.println(barang1.setNamaBarang());
        System.out.println(barang1.setKeterangan());
        System.out.println("Id :" +barang1.getId());
    }
}
