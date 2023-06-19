package pkgFinalProject;
import java.util.Scanner;
public class appToko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //daftar barang yang dijual
        cBarang brg1 = new cBarang("Es Teh Jumbo",6000);
        cBarang brg2 = new cBarang("Alpukat Susu",12000);
        cBarang brg3 = new cBarang("Milo",5000);
        cBarang brg4 = new cBarang("Air Putih",5000);
        cBarang brg5 = new cBarang("Kopi Hitam",3000);
        
        //data member toko
        int id1 = 2201, pwd1 = 111;
        int id2 = 2202, pwd2 = 222;
        int id3 = 2203, pwd3 = 333;
        int id,pin;
        
        //daftar antrian transaksi yang masuk ke toko
        cDaftarTransaksi jual = new cDaftarTransaksi();
        int pilih=0,pilih2=0,pilih3=0;
        int kode=070200,jumlah;
        do{
            System.out.println("\nAplikasi Warkop Revo 99");
            System.out.println("1.Pembeli");
            System.out.println("2.Anggota");
            System.out.println("3.Admin");
            System.out.println("4.Pemilik");
            System.out.println("5.Exit");
            System.out.print("Pilih = ");
            pilih=sc.nextInt();
            switch(pilih){
                case 1:
                    //pembeli
                    kode++;
                    cDaftarTransaksi beli = new cDaftarTransaksi();
                    System.out.print("Masukkan Nama = ");
                    String nama=sc.next();
                    do{
                        System.out.println("\n| Akun Pembeli |");
                        System.out.println(" 1.Tambah");
                        System.out.println(" 2.Hapus");
                        System.out.println(" 3.Lihat");
                        System.out.println(" 4.Kembali");
                        System.out.print("Pilih = ");
                        pilih2=sc.nextInt();
                        switch(pilih2){
                            case 1:
                                cTransaksi br=null;
                                System.out.println("Daftar Minuman :");
                                System.out.println(" 1.Es Teh Jumbo");
                                System.out.println(" 2.Alpukat Susu");
                                System.out.println(" 3.Milo");
                                System.out.println(" 4.Air Putih");
                                System.out.println(" 5.Kopi Hitam");
                                System.out.print("Pilih  = ");
                                pilih3=sc.nextInt();
                                System.out.print("Jumlah = ");
                                jumlah=sc.nextInt();
                                if (pilih3==1) {
                                    br = new cTransaksi(String.valueOf(kode),nama,brg1,jumlah,0);
                                }
                                else if (pilih3==2) {
                                    br = new cTransaksi(String.valueOf(kode),nama,brg2,jumlah,0);
                                }
                                if (pilih3==3) {
                                    br = new cTransaksi(String.valueOf(kode),nama,brg3,jumlah,0);
                                }
                                if (pilih3==4) {
                                    br = new cTransaksi(String.valueOf(kode),nama,brg4,jumlah,0);
                                }
                                if (pilih3==5) {
                                    br = new cTransaksi(String.valueOf(kode),nama,brg5,jumlah,0);
                                }
                                beli.tambahTransaksi(br);
                                break;
                            case 2:
                                //hapus transaksi
                                beli.lihatTransaksi();
                                System.out.print("Hapus Nomor = ");
                                int hapus = sc.nextInt();
                                beli.hapusTransaksi(hapus);
                                break;
                            case 3:
                                beli.lihatTransaksi();
                                break;
                            case 4:
                                //selesai sambungkan transaksi pembeli
                                //ke antrian transaksi toko
                                jual.sambungTransaksi(beli.getFront(), beli.getRear());
                                System.out.println("Selamat datang kembali..");
                                break;
                        }
                    }while(pilih2!=4);
                    break;
                case 2:
                    //anggota
                    boolean valid=false;
                    do{
                        System.out.print("ID  = ");
                        id=sc.nextInt();
                        System.out.print("PIN = ");
                        pin=sc.nextInt();
                        if (id==id1 && pin==pwd1)
                            valid=true;
                        else if(id==id2 && pin==pwd2)
                            valid=true;
                        else if(id==id3 && pin==pwd3)
                            valid=true;
                        if(valid==false)
                            System.out.println("ID/PIN Salah!");
                        else break;
                    }while(valid==true);
                    if (valid==true) {
                        System.out.println("Selamat Datang..");
                        kode++;
                        beli = new cDaftarTransaksi();
                        do{
                            System.out.println("\n| Akun Member |");
                            System.out.println(" 1.Tambah");
                            System.out.println(" 2.Hapus");
                            System.out.println(" 3.Lihat");
                            System.out.println(" 4.Kembali");
                            System.out.print("Pilih = ");
                            pilih2=sc.nextInt();
                            switch(pilih2){
                                case 1:
                                    cTransaksi br=null;
                                    System.out.println("Daftar Minuman :");
                                    System.out.println(" 1.Es Teh Jumbo");
                                    System.out.println(" 2.Alpukat Susu");
                                    System.out.println(" 3.Milo");
                                    System.out.println(" 4.Air Putih");
                                    System.out.println(" 5.Kopi Hitam");
                                    System.out.print("Pilih  = ");
                                    pilih3=sc.nextInt();
                                    System.out.print("Jumlah = ");
                                    jumlah=sc.nextInt();
                                    if (pilih3==1) {
                                        br = new cTransaksi(String.valueOf(kode),String.valueOf(id),brg1,jumlah,0);
                                    }
                                    else if (pilih3==2) {
                                        br = new cTransaksi(String.valueOf(kode),String.valueOf(id),brg2,jumlah,0);
                                    }
                                    if (pilih3==3) {
                                        br = new cTransaksi(String.valueOf(kode),String.valueOf(id),brg3,jumlah,0);
                                    }
                                    if (pilih3==4) {
                                        br = new cTransaksi(String.valueOf(kode),String.valueOf(id),brg4,jumlah,0);
                                    }
                                    if (pilih3==5) {
                                        br = new cTransaksi(String.valueOf(kode),String.valueOf(id),brg5,jumlah,0);
                                    }
                                    beli.tambahTransaksi(br);
                                    break;
                                case 2:
                                    //hapus transaksi
                                    beli.lihatTransaksi();
                                    System.out.print("Hapus Nomor = ");
                                    int hapus = sc.nextInt();
                                    beli.hapusTransaksi(hapus);
                                    break;
                                case 3:
                                    //menampilkan daftar belanja dan diskon
                                    beli.lihatTransaksiMember();
                                    break;
                                case 4:
                                    //selesai sambungkan transaksi pembeli
                                    //ke antrian transaksi toko
                                    jual.sambungTransaksi(beli.getFront(), beli.getRear());
                                    System.out.println("Selamat datang kembali..");
                                    break;
                            }
                        }while(pilih2!=4);
                    }
                    break;
                case 3:
                    //admin
                    do{
                    System.out.println("\n| Akun Admin |");
                    System.out.println(" 1.Memproses Transaksi");
                    System.out.println(" 2.Lihat Transaksi Belum Diproses");
                    System.out.println(" 3.Kembali");
                    System.out.print("Pilih = ");
                    pilih2 = sc.nextInt();
                    switch(pilih2){
                        case 1:
                            jual.lihatTransaksi();
                            //memproses setiap transaksi yang belum diproses
                            cTransaksi t=jual.getFront();
                            do{
                                if (t.getStatus()==0) {
                                    System.out.println("Kode    : "+t.getKode());
                                    System.out.println("Pembeli : "+t.getPembeli());
                                    System.out.println("Minuman : "+t.getBarang().getNama());
                                    System.out.println("Jumlah  : "+t.getJumlah());
                                    System.out.println("= Pilih Aksi =");
                                    System.out.println(" 1.Diproses");
                                    System.out.println(" 2.Selesai");
                                    System.out.print("Pilih = ");
                                    int aksi=sc.nextInt();
                                    if (aksi==1) {
                                        jual.prosesTransaksi(t);
                                        System.out.println("Berhasil diproses..");
                                    }
                                    else if(aksi==2) {
                                        jual.prosesTransaksi2(t);
                                        System.out.println("Belum Diproses");
                                    }
                                }
                                t=t.next;
                            }while(t!=null);
                        break;
                        case 2:
                            System.out.println("Transaksi Belum Diproses  : "+jual.lihatBlmdiproses());
                            jual.lihatTransaksiBlmDiproses();
                            break;
                        case 3:
                            System.out.println("Selamat datang kembali..");
                            break;
                    }
                    }while(pilih2!=3);
                case 4:
                    //pemilik
                    do{
                        System.out.println("\n| Akun Pemilik |");
                        System.out.println(" 1.Nilai Penjualan Sudah Diproses");
                        System.out.println(" 2.Nilai Penjualan Belum Diproses");
                        System.out.println(" 3.Ubah Harga Barang");
                        System.out.println(" 4.Daftar Total Biaya Member");
                        System.out.println(" 5.Daftar Laporan");
                        System.out.println(" 6.Grafik Penjualan");
                        System.out.println(" 7.Kembali");
                        System.out.print("Pilih = ");
                        pilih2 = sc.nextInt();
                        switch(pilih2){
                            case 1:
                                System.out.println("Transaksi Diproses : "+jual.lihatDiproses());
                                System.out.println("Pemasukan : "+jual.lihatPemasukan());
                                break;
                            case 2:
                                System.out.println("Transaksi Belum Diproses : "+jual.lihatBlmdiproses());
                                System.out.println("Pemasukan : "+jual.lihatPemasukan2());
                                break;
                            case 3:
                                System.out.println("= UBAH HARGA =");
                                System.out.print("Nama Minuman = ");
                                String n = sc.next();
                                System.out.print("Harga        = ");
                                int h = sc.nextInt();
                                brg1 = new cBarang(n,h);
                                brg2 = new cBarang(n,h);
                                brg3 = new cBarang(n,h);
                                brg4 = new cBarang(n,h);
                                brg5 = new cBarang(n,h);
                                System.out.print("Harga Baru   = ");
                                int hb = sc.nextInt();
                                brg1.setHarga(hb);
                                brg2.setHarga(hb);
                                brg3.setHarga(hb);
                                brg4.setHarga(hb);
                                brg5.setHarga(hb);
                                break;
                            case 4:
                                System.out.println("= TOTAL BIAYA MEMBER =");
                                jual.daftarPenjualanMember();
                                System.out.println("");
                                break;
                            case 5:
                                System.out.println("= LAPORAN PENJUALAN HARIAN =");
                                jual.laporanPenjualan();
                                System.out.println("");
                                break;
                            case 6:
                                System.out.println("= Grafik  Pendapatan Bulanan =");
                                jual.grafikPenjualan();
                                System.out.println("");
                                break;
                            case 7:
                                System.out.println("=========== SELESAI ============");
                                break;
                        }
                    }while(pilih2!=7);
                case 5:
                    System.out.println("^^^^^^^^^ Terima Kasih ^^^^^^^^^");
                    System.out.println("**** SELAMAT DATANG KEMBALI ****");
                    break;
            }
        }while(pilih!=5);
    }
}
