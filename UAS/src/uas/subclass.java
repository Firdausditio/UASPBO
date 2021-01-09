/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import java.text.SimpleDateFormat;
import java.util.*;
import java.time.LocalDate;

public class subclass {
    private final java.util.ArrayList<String> nama = new java.util.ArrayList();
    private final java.util.ArrayList<String> Alamat = new java.util.ArrayList();
    private final java.util.ArrayList<Integer> jk = new java.util.ArrayList();
    private final java.util.ArrayList<Date> tl = new java.util.ArrayList();
    private final java.util.ArrayList<String> Gol = new java.util.ArrayList();
    private final java.util.ArrayList<String> Pil = new java.util.ArrayList();
    private final java.util.ArrayList<Integer> Code = new java.util.ArrayList();
    private final java.util.ArrayList<Integer> Umur = new java.util.ArrayList();
    private final java.util.ArrayList<Integer> Anak = new java.util.ArrayList();
    long um;
    long mur;
    long nak;
    String gln;
    Scanner in = new Scanner(System.in);
    
    void menu(){
        System.out.println("==================");
        System.out.println("    Menu Utama");
        System.out.println("==================");
        System.out.println("Menu :");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data(menggunakan Kode)");
        System.out.println("3. Cari Data");
        System.out.println("4. Tampil Data");
        System.out.println("5. Keluar");
        System.out.print("Pilihan menu anda : ");
        String menu = in.next();
        while (true) {
            switch (menu) {
                case "1":
                        System.out.println("===================");
                        System.out.println("    Tambah Data");
                        System.out.println("===================");
                        System.out.print("Masukan Kode Karyawan: ");
                        int code = in.nextInt();
                        System.out.print("Masukan Nama Karyawan : ");
                        String name = in.next();
                        System.out.print("Masukan Alamat  : ");
                        String alamat = in.next();
                        System.out.println("Tanggal Lahir: ");
                        System.out.print("Tahun: ");
                        int tahun = in.nextInt();
                        System.out.print("Bulan: ");
                        int bulan = in.nextInt();
                        System.out.print("Tanggal: ");
                        int hari = in.nextInt();
                        Date tanggal = new GregorianCalendar(tahun, bulan - 1, hari).getTime();
                        int usia = 2021 - tahun;
                        System.out.println("Usia :" + usia);
                        while(true){
                            System.out.print("Masukan Golongan (A,B,C,D)  : ");
                            this.gln = in.next();
                            if(!("A".equals(this.gln)) & !("B".equals(this.gln)) & !("C".equals(this.gln)) & !("D".equals(this.gln))){
                                System.out.println("Masukan Sesuai Data!");
                            }
                            else{
                                break;
                            }
                        }
                        
                        System.out.print("Masukan Status Menikah (0 : blm menikah, 1 : sudah menikah)  : ");
                        int mnk = in.nextInt();
                        if (mnk == 1){
                            System.out.print("Masukan Jumlah Anak : ");
                            int ank = in.nextInt();
                            Anak.add(ank);
                        }
                        else {
                            Anak.add(0);
                        }
                        nama.add(name);
                        Code.add(code);
                        Alamat.add(alamat);
                        tl.add(tanggal); 
                        Umur.add(usia);
                        jk.add(mnk);
                        Gol.add(this.gln);
                        System.out.println("Pilih Sub Menu :");
                        System.out.println("A. Kembali Ke Menu Utama");
                        System.out.println("B. Tambah Data Kembali");
                        System.out.print("Menu Pilihan :");
                        String pil = in.next();
                        Pil.add(pil);
                        if (pil.equals ("A")){
                            menu();
                        }
                        else {
                            break;
                        }
                case "2":{
                    System.out.println("===================");
                    System.out.println("    Hapus Data");
                    System.out.println("===================");
                    System.out.print  ("Masukkan Kode Karyawan  : ");
                    int cari = in.nextInt();
                    int index= Code.indexOf(cari);
                        if (index == -1){
                        System.out.println("Kode Tidak ditemukan");
                        }
                        else{
                            System.out.println("Data Telah dihapus");
                            if (jk.get(index) == 0){
                            nama.remove(index);
                            Alamat.remove(index);
                            Code.remove(index);
                            Umur.remove(index);
                            tl.remove(index);
                            Gol.remove(index);
                            jk.remove(index); 
                            } 
                            else{
                            nama.remove(index);
                            Alamat.remove(index);
                            Code.remove(index);
                            Umur.remove(index);
                            tl.remove(index);
                            Gol.remove(index);
                            jk.remove(index); 
                            Anak.remove(index);
                            }
                            System.out.println ("Pilih Sub Menu : " );
                            System.out.println ("1. Kembali ke menu utama " );
                            System.out.println ("2. Hapus Data Kembali "   );
                            System.out.print   ("Menu Pilihan : " );
                            int sub = in.nextInt();
                            in.nextLine();
                                if (sub == 1) {
                                    menu();
                                }
                                else if (sub == 2) {
                                    break;
                                }
                }
                }
                case "3":
                    System.out.println("===========================");
                    System.out.println("        DATA KARYAWAN");
                    System.out.println("---------------------------");
                    System.out.println("Masukan Kode Karyawan");
                    System.out.print("Kode : ");
                    int cdee = in.nextInt();
                    int index= Code.indexOf(cdee);
                    System.out.println("===========================");
                    System.out.println("    DATA PROFILE KARYAWAN");
                    System.out.println("---------------------------");
                    System.out.println("Kode Karyawan   : " + Code.get(index));
                    System.out.println("Nama Karyawan   : " + nama.get(index));
                    System.out.println("Golongan        : " + Gol.get(index));
                    System.out.println("Usia            : " + Umur.get(index));
                    System.out.println("Status Menikah  : " + jk.get(index));
                    System.out.println("Jumlah Anak     : " + Anak.get(index));
                    System.out.println("----------------------------");
                    GolA gj = new GolA();
                    if ("A".equals(Gol.get(index))){
                        System.out.println("Gaji Pokok            : Rp " + gj.tipeA());
                        this.um = (long)(gj.tipeA()*0.1);
                        System.out.println("Tunjangan Istri/suami : Rp " + this.um);
                        if (Umur.get(index)>30){
                            this.mur = (long)(gj.tipeA()*0.15);
                            System.out.println("Tunjangan Pegawai     : Rp " + this.mur);
                        }
                        else {
                            this.mur = (long)(gj.tipeA()*0);
                            System.out.println("Tunjangan Pegawai     : Rp " + this.mur);
                        }
                        if (Anak.get(index)>0){
                            this.nak = (long)(gj.tipeA()*0.5*Anak.get(index));
                            System.out.println("Tunjangan Anak        : Rp " + this.nak);
                        }
                        else {
                            this.nak = (long)(gj.tipeA()*0);
                            System.out.println("Tunjangan Anak        : Rp " + this.nak);
                        }
                        System.out.println("-----------------------------");
                        long GK = (long)(gj.tipeA()+ this.um + this.mur + this.nak);
                        System.out.println("Gaji Kotor      : Rp " + GK);
                        long PT = (long)(0.025*GK);
                        System.out.println("Potongan        : Rp " + PT);
                        System.out.println("-----------------------------");
                        long BR = GK - PT;
                        System.out.println("Gaji Bersih     : Rp " + BR);
                        System.out.println("Pilih Sub Menu :");
                        System.out.println("A. Kembali Ke Menu Utama");
                        System.out.print("Menu Pilihan :");
                        String pill = in.next();
                        Pil.add(pill);
                        if (pill.equals ("A")){
                            menu();
                        }
                        else {
                        break;
                    }
                    }
                    
                    if ("B".equals(Gol.get(index))){
                        System.out.println("Gaji Pokok            : Rp " + gj.tipeB());
                        this.um = (long)(gj.tipeB()*0.1);
                        System.out.println("Tunjangan Istri/suami : Rp " + this.um);
                        if (Umur.get(index)>30){
                            this.mur = (long)(gj.tipeB()*0.15);
                            System.out.println("Tunjangan Pegawai     : Rp " + this.mur);
                        }
                        else {
                            this.mur = (long)(gj.tipeB()*0);
                            System.out.println("Tunjangan Pegawai     : Rp " + this.mur);
                        }
                        if (Anak.get(index)>0){
                            this.nak = (long)(gj.tipeB()*0.5*Anak.get(index));
                            System.out.println("Tunjangan Anak        : Rp " + this.nak);
                        }
                        else {
                            this.nak = (long)(gj.tipeB()*0);
                            System.out.println("Tunjangan Anak        : Rp " + this.nak);
                        }
                        System.out.println("-----------------------------");
                        long GK = (long)(gj.tipeB()+ this.um + this.mur + this.nak);
                        System.out.println("Gaji Kotor      : Rp " + GK);
                        long PT = (long)(0.025*GK);
                        System.out.println("Potongan        : Rp " + PT);
                        System.out.println("-----------------------------");
                        long BR = GK - PT;
                        System.out.println("Gaji Bersih     : Rp " + BR);
                        System.out.println("Pilih Sub Menu :");
                        System.out.println("A. Kembali Ke Menu Utama");
                        System.out.print("Menu Pilihan :");
                        String pill = in.next();
                        Pil.add(pill);
                        if (pill.equals ("A")){
                            menu();
                        }
                        else {
                        break;
                    }
                    }
                    
                    if ("C".equals(Gol.get(index))){
                        System.out.println("Gaji Pokok            : Rp " + gj.tipeC());
                        this.um = (long)(gj.tipeC()*0.1);
                        System.out.println("Tunjangan Istri/suami : Rp " + this.um);
                        if (Umur.get(index)>30){
                            this.mur = (long)(gj.tipeC()*0.15);
                            System.out.println("Tunjangan Pegawai     : Rp " + this.mur);
                        }
                        else {
                            this.mur = (long)(gj.tipeC()*0);
                            System.out.println("Tunjangan Pegawai     : Rp " + this.mur);
                        }
                        if (Anak.get(index)>0){
                            this.nak = (long)(gj.tipeC()*0.5*Anak.get(index));
                            System.out.println("Tunjangan Anak        : Rp " + this.nak);
                        }
                        else {
                            this.nak = (long)(gj.tipeC()*0);
                            System.out.println("Tunjangan Anak        : Rp " + this.nak);
                        }
                        System.out.println("-----------------------------");
                        long GK = (long)(gj.tipeC()+ this.um + this.mur + this.nak);
                        System.out.println("Gaji Kotor      : Rp " + GK);
                        long PT = (long)(0.025*GK);
                        System.out.println("Potongan        : Rp " + PT);
                        System.out.println("-----------------------------");
                        long BR = GK - PT;
                        System.out.println("Gaji Bersih     : Rp " + BR);
                        System.out.println("Pilih Sub Menu :");
                        System.out.println("A. Kembali Ke Menu Utama");
                        System.out.print("Menu Pilihan :");
                        String pill = in.next();
                        Pil.add(pill);
                        if (pill.equals ("A")){
                            menu();
                        }
                        else {
                        break;
                    }
                    }
                    
                    if ("D".equals(Gol.get(index))){
                        System.out.println("Gaji Pokok            : Rp " + gj.tipeD());
                        this.um = (long)(gj.tipeD()*0.1);
                        System.out.println("Tunjangan Istri/suami : Rp " + this.um);
                        if (Umur.get(index)>30){
                            this.mur = (long)(gj.tipeD()*0.15);
                            System.out.println("Tunjangan Pegawai     : Rp " + this.mur);
                        }
                        else {
                            this.mur = (long)(gj.tipeD()*0);
                            System.out.println("Tunjangan Pegawai     : Rp " + this.mur);
                        }
                        if (Anak.get(index)>0){
                            this.nak = (long)(gj.tipeD()*0.5*Anak.get(index));
                            System.out.println("Tunjangan Anak        : Rp " + this.nak);
                        }
                        else {
                            this.nak = (long)(gj.tipeD()*0);
                            System.out.println("Tunjangan Anak        : Rp " + this.nak);
                        }
                        System.out.println("-----------------------------");
                        long GK = (long)(gj.tipeD()+ this.um + this.mur + this.nak);
                        System.out.println("Gaji Kotor      : Rp " + GK);
                        long PT = (long)(0.025*GK);
                        System.out.println("Potongan        : Rp " + PT);
                        System.out.println("-----------------------------");
                        long BR = GK - PT;
                        System.out.println("Gaji Bersih     : Rp " + BR);
                        System.out.println("Pilih Sub Menu :");
                        System.out.println("A. Kembali Ke Menu Utama");
                        System.out.print("Menu Pilihan :");
                        String pill = in.next();
                        Pil.add(pill);
                        if (pill.equals ("A")){
                            menu();
                        }
                    }
                    else {
                        break;
                    }
                case "4":
                    System.out.println("============================================================================");
                    System.out.println("                               Tampilkan Data");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Kode Kar\t Nama Kar\t Gol\t Usia\t Status Nikah\t Jumlah Anak");
                    for  (int i = 0; i < Code.size(); i++){
                        String status_menikah = (jk.get(i) == 1) ? "Menikah" : "Belum";
                        System.out.print(Code.get(i) + " \t\t"  + "  " + nama.get(i) + "\t\t" + "  " + Gol.get(i) + "\t" + "  "+ Umur.get(i) + "\t" + " "+ jk.get(i) + "\t\t" + " "+ Anak.get(i) + "\n");
                    }
                    System.out.println("============================================================================");
                    System.out.println("Jumlah Data" + Code.size());
                    System.out.println("Pilih Sub Menu :");
                    System.out.println("A. Kembali Ke Menu Utama");
                    System.out.print("Menu Pilihan :");
                    String pilll = in.next();
                    Pil.add(pilll);
                    if (pilll.equals ("A")){
                        menu();
                    }
                    else {
                        break;
                    }
                    
                case "5":
                    break;
                
            }
        }
    }
    
}
