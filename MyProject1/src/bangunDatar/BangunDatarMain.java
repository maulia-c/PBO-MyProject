/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunDatar;

/**
 *
 * @author Maulia
 */
public class BangunDatarMain{
    public static void main(String[] args) {
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
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jarijari = 25;
        lingkaran.nameling = "A";
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        
        lingkaran.jarijari = 37;
        lingkaran.nameling = "B";
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
    }
}
