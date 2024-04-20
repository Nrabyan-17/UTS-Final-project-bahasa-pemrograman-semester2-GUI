package GUI;
public class cPelanggan {
    private int IDPelanggan;
    private String namaPelanggan;
    private String alamatPelanggan;
    private int IDPels [] = new int [5];
    
    public cPelanggan(int IDPel, String np, String ap) {
        IDPelanggan = IDPel;
        namaPelanggan = np;
        alamatPelanggan = ap;
        
        System.out.println("Objek "+namaPelanggan+" dibuat");;
    }
    
    public cPelanggan(){
        
    }
    public int getIDPelanggan(){
        return IDPelanggan;
    }
    public void setIDPelanggan(int IDPel){
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