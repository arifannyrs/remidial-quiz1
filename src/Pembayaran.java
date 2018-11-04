/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arifannyrs
 */
public class Pembayaran {
    private BoxMotor boxmotor;
    private Pembeli pembeli;
    private Diskon diskon;

    public Pembayaran(BoxMotor boxmotor, Pembeli pembeli, Diskon diskon) {
        this.boxmotor = boxmotor;
        this.pembeli = pembeli;
        this.diskon = diskon;
    }
    
    public float getHargaTotal(){
        return boxmotor.getHarga()-diskon.getHarga();
    }
    
    public void print(){
        System.out.println(boxmotor.info());
        System.out.println(pembeli.info());
        System.out.println(diskon.info());
        System.out.println("Total Harga yang harus dibayar: "+getHargaTotal());
    }
}
