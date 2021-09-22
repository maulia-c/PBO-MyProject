/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunDatar;

/**
 *
 * @author NURUL IMAN
 */
public class BangunDatarMain {
     Persegipanjang pjg = new Persegipanjang();
        pjg.panjang = 25;
        pjg.lebar = 38;
        pjg.hitungLuas();
        pjg.hitungKeliling();
        
        Persegi ps = new Persegi();
        ps.sisi = 10;
        ps.namepersegi = "A";
        ps.hitungLuas();
        ps.hitungKeliling();
        
        ps.sisi = 15;
        ps.namepersegi = "B";
        ps.hitungLuas();
        ps.hitungKeliling();
        
        Lingkaran ling = new Lingkaran();
        ling.jarijari = 25;
        ling.nameling = "A";
        ling.hitungLuas();
        ling.hitungKeliling();
        
        ling.jarijari = 37;
        ling.nameling = "B";
        ling.hitungLuas();
        ling.hitungKeliling();
    }
}
