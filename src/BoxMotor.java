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
    private String nama;
    private float tipe;
    public float jumlah;
    private float harga;

    public BoxMotor(String nama, float tipe, float jumlah, float harga) {
        this.nama = nama;
        this.tipe = tipe;
        this.jumlah = jumlah;
        this.harga = harga;
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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
    
    public float HargaTotal(){
        return jumlah*harga;
    } 
}
