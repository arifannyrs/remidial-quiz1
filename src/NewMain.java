/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arifannyrs
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BoxMotor bm = new BoxMotor("SHAD", 48, 2, 0);
        Pembeli pb = new Pembeli ("Arifanny", 4422335);
        Diskon D = new Diskon (0.05f, "Givi", 45, 4, 1000);
        Pembayaran py = new Pembayaran(bm, pb, D);
                
        py.print();
    }
}

