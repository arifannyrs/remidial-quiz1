/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arifannyrs
 */
public class BoxMotor {
    private String merk;
    private float tipe;
    public float jumlah;
    public float harga;
    
    public BoxMotor(){   
    }
    
    public BoxMotor(String merk, float tipe, float jumlah, float harga) {
        this.merk = merk;
        this.tipe = tipe;
        this.jumlah = jumlah;
        this.harga = harga;      
    }

    public String getNama() {
        return merk;
    }

    public void setNama(String nama) {
        this.merk = merk;
    }

    public float getTipe() {
        return tipe;
    }

    public void setTipe(float tipe) {
        this.tipe = tipe;
    }

    public float getJumlah() {
        return jumlah;
    }

    public void setJumlah(float liter) {
        this.jumlah = jumlah;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }
    
    public String info(){
        String info = "";
        info +="Merk Box : " + this.merk + "\n";
        info +="Tipe : " + this.tipe + "\n";
        info +="Jumlah : " + this.jumlah + "\n";
        info +="Harga : " + this.harga + "\n";
        return info;
    }
}
