/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan55.handphone;

/**
 *
 * @author RizalSihombing
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program untuk menampilkan produk handphone
 */
public class BlackBerry extends Handphone {
    
    private String pinBB;
    
    public BlackBerry(String man, String os, String model, int harga, String pinBB) {
        super(man, os, model, harga);
        this.pinBB = pinBB;
    }
    
    public String getPinBB() {
        return this.pinBB;   
    }
    
    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
}
