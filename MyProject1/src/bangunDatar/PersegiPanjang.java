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
public class PersegiPanjang {
    //atribut
    public int panjang;
    public int lebar;
    
    
    //methods
    public void hitungLuas(){
        int hasil = panjang * lebar;
        System.out.println("Hasil luas persegi panjang: "+ hasil);
    }

    public void hitungKeliling(){
        int hasil = 2*(panjang + lebar);
        System.out.println("Hasil keliling persegi panjang: "+ hasil);
    }
}
