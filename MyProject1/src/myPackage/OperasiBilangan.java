/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

/**
 *
 * @author NURUL IMAN
 */
public class OperasiBilangan {
    //atribut
    public int bilPertama;
    public int bilKedua;
    
    //methods
    public void hitungPenjumlahan(){
        int hasil = bilPertama + bilKedua;
        System.out.println("Hasil Penjumlahannya: " + hasil);
    }
    
    public void hitungPengurangan(){
        int hasil = bilPertama - bilKedua;
        System.out.println("Hasil pengurangannya: " + hasil);
    }
     public void hitungPerkalian(){
        int hasil = bilPertama * bilKedua;
        System.out.println("Hasil pembagiannya:" + hasil); 
    }
    
    public void hitungPembagian(){
        double bilPertamadouble = bilPertama;
        double bilKeduadouble = bilKedua;
        
        double hasil = bilPertama/ bilKeduadouble;
        System.out.println("Hasil pembagiannya:" + hasil); 
    }
}
