/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arifannyrs
 */
public class Diskon extends BoxMotor {
    private float Diskon;

    public Diskon(float Diskon, String merk, float tipe, float jumlah, float harga) {
        super(merk, tipe, jumlah, harga);
        this.Diskon = Diskon;
    }
    
    public float getDiskon(){
        return(jumlah*harga)*Diskon;
    }
    
    public float getHargaTotal(){
        return jumlah*harga-getDiskon();
    }
}