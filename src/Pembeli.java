/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arifannyrs
 */
public class Pembeli {
    private String nama;
    private int NoHp;

    public Pembeli(String nama, int NoHp) {
        this.nama = nama;
        this.NoHp = NoHp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getNoHp() {
        return NoHp;
    }

    public void setNoHp(int NoHp) {
        this.NoHp = NoHp;
    }
    
    public String info(){
        String info = "";
        info +="Nama Pembeli: " + this.nama + "\n";
        info +="Nomor hp : " + this.NoHp + "\n";
        return info;
    }
}
