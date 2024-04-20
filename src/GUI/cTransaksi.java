package GUI;
public class cTransaksi {
    private String idTransaksi;
    private String trx[] = new String [30];
    private cPelanggan namaPembeli;
    private cMenu hargaMenu;
    private cMenu menu;
    private cMenu menus[];
    private int jumlahMenu;
    private int jumlahMenus[];
    private int totals[];
    private int total;
    private int tanggalPembelian;
    private int jm,maksm,gtotal;

    public cTransaksi() {    
        maksm=3; jm=0; gtotal=0;
        //deklarasi array
        menus=new cMenu[maksm]; jumlahMenus=new int[maksm];
        totals=new int[maksm];
    }
    
    public int getTanggalPembelian() {
        return tanggalPembelian;
    }
    public void setTanggalPembelian(int tanggalPembelian) {
        this.tanggalPembelian = tanggalPembelian;
    }
    public String getIdTransaksi() {
        return idTransaksi;
    }
    public void setIdTransaksi(String idTransaksi) {
        idTransaksi = idTransaksi;
    }
    public String ToString() {
        return idTransaksi + "[" + hargaMenu + "]"  + tanggalPembelian;
    }
}
