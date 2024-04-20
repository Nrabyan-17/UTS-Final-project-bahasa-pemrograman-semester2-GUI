
public class cPembeli1 {
    private String IDPelanggan;
    private String namaPelanggan;
    private String alamatPelanggan;
    private int IDPels [] = new int [5];
    
    public cPembeli1 (String IDPel, String np, String ap) {
        IDPelanggan = IDPel;
        namaPelanggan = np;
        alamatPelanggan = ap;
        
        System.out.println("Objek "+namaPelanggan+" dibuat");;
    }
    
    public cPembeli1( ){
        
    }
    public String getIDPelanggan(){
        return IDPelanggan;
    }
    public void setIDPelanggan(String IDPel){
        IDPelanggan = IDPel;
    }
    public String getNamaPelanggan(){
        return namaPelanggan;
    }
    public String getAlamatPelanggan(){
        return alamatPelanggan;
    }
    public void setNamaPelanggan(String np){
        namaPelanggan = np;
    }
    public void setAlamatPelanggan(String ap){
        alamatPelanggan = ap;
    }
}