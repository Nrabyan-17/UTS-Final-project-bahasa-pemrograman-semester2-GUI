package GUI;
import java.util.Scanner;
public class cMenu {
    private String kodeMenu,namaMenu;
    private int hrgMenu,stockMenu;
    private String menus[] = new String [30];
    private int harga [] = new int [30];
    private int jmlhMenu[] = new int[1000];
    private int bm = 5;
    private int jBrg,mBrg;
    private Scanner m1 = new Scanner (System.in);
    private Scanner m2 = new Scanner (System.in);

    cMenu(){
        
    }
    cMenu(String km, String nm, int hm, int sm) {
        kodeMenu=km; namaMenu=nm; hrgMenu=hm; stockMenu=sm;
        System.out.println("Objek "+namaMenu+" dibuat");
    }

    cMenu(String km, String nm, double hm, int sm) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void tambahMenu(){
        if (jBrg<mBrg) {
            System.out.println("");
            System.out.println("Masukkan kode menu              :");
            String nb = m2.nextLine();
            System.out.print("Masukkan nama menu                : ");
            String nb2 = m2.nextLine(); // Membersihkan newline
            System.out.print("Masukkan harga menu               : ");
            int hb = m1.nextInt();
            System.out.print("Masukkan stock menu yang tersedia : ");
            int sb = m1.nextInt();

            // Tambahkan data menu ke dalam array menus
            menus[jBrg] = nb;
            harga[jBrg] = hb;
            jmlhMenu[jBrg] = sb;
            jBrg++; // Perbarui jumlah menu

            System.out.println("Menu berhasil ditambahkan.");
        } else {
            System.out.println("Maaf, jumlah menu sudah mencapai batas maksimum.");
        }
    }
    
    public void lihatMenu(){
        if(bm>0){
            System.out.println("Data Menu");
            System.out.printf("%-5s %-15ss %-10s %-10s\n","No","Menu","Harga", "Stock");
            for (int i = 0; i < bm; i++) {
                if(menus[i]!=null){
                    System.out.printf("%-5s %-15s %-10s %-10s\n",(i+1),menus[i],harga[i],jmlhMenu[i]);
                }
            }
            System.out.println("");
        }else System.out.println("Menu tidak tersedia");        
    }
    
    public void ubahMenu(){
        String nb; int hb; int sb;
        String ubahmenu;
        int pilih1;
        
        System.out.print("\nMasukkan nama menu yang ingin diubah datanya: ");
        ubahmenu = m1.nextLine();
        String namaMenu = m1.nextLine();
        boolean menuDitemukan = false;

        for (int i = 0; i < bm; i++) {
            lihatMenu();
            
            if (menus[i] != null && menus[i].equalsIgnoreCase(namaMenu)) {
                menuDitemukan = true;

                System.out.println("\nApa yang ingin diubah datanya? ");
                System.out.println("1. Harga Menu");
                System.out.println("2. Stock Menu");
                System.out.println("3. Exit");
                System.out.print("Pilih opsi: ");
                pilih1 = m2.nextInt();

                    switch (pilih1) {
                        case 1:
                            System.out.print("\nMasukkan harga menu yang baru: ");
                            hb = m2.nextInt();
                                                
                            System.out.println("\nApakah kamu yakin ingin mengubah harga?");
                            System.out.println("1. Ya");
                            System.out.println("2. Tidak");
                            System.out.print("Pilih opsi: ");
                            int jwb=m2.nextInt();
                                                
                            if(jwb==1){
                                harga[i]=hb;//mengubah harga pada array
                                System.out.println("Harga berhasil diubah..."); 
                            }else{
                                System.out.println("Ubah harga dibatalkan!!!");
                            }
                            break;

                        case 2:
                            System.out.print("Masukkan stock menu yang baru: ");
                            sb = m1.nextInt();
                                                                                            
                            System.out.println("\nApakah kamu yakin ingin mengubah stock?");
                            System.out.println("1. Ya");
                            System.out.println("2. Tidak");
                            System.out.print("Pilih opsi: ");
                            int jwb1=m1.nextInt();
                                                
                            if(jwb1==1){
                                jmlhMenu[i]=sb;//ubah jumlah stock pada array
                                System.out.println("Stock berhasil diubah..."); 
                            }else{
                                System.out.println("Ubah stock dibatalkan!!!");
                            }
                            break;

                        case 3:
                            System.out.println("");
                            break;
                                                
                        default:
                            System.out.println("Opsi tidak valid.");
                            break;
                    }
                    break;
            }
        }
        if (!menuDitemukan) {
            System.out.println("Menu tidak ditemukan!");
        }
    }
    
    public void hapusMenu() {
        lihatMenu();
        
        System.out.print("Hapus Menu (pilih dengan angka): ");
            int indekshapus = m1.nextInt();
            indekshapus--;

            for (int i = indekshapus; i < bm-1; i++) {
                menus[i] = menus[i+1];
                harga[i] = harga[i+1];
            }

            menus[menus.length-1]=null;
            harga[harga.length-1]=0;
            bm--;

            System.out.println("");

                 System.out.printf("%-5s %-15s %-10s %-10s\n","No","Menu","Harga", "Stock");
                for (int i = 0; i < bm; i++) {
                    System.out.printf("%-5s %-15s %-10s %-10s\n",(i+1),menus[i],harga[i],jmlhMenu[i]);
                }
        System.out.println("");
    }
    
    public void setkodeMenu(String km) {
        kodeMenu = km;
    }
    public String getkodeMenu() {
        return kodeMenu;
    }
    public String getnamaMenu() {
        return namaMenu;
    }
    public void setnamaMenu(String nm) {
        namaMenu = nm;
    }
    public int gethrgMenu() {
        return hrgMenu;
    }
    public void sethrgMenu(int hm) {
        hrgMenu = hm;
    }
    public int getstockMenu() {
        return stockMenu;
    }
    public void setstockMenu(int sm) {
        stockMenu = sm;
    }
}
