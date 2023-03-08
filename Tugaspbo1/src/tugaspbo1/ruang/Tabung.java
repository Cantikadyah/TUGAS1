/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo1.ruang;
import tugaspbo1.bidang.Lingkaran;
/**
 *
 * @author ASUS
 */
public class Tabung extends Lingkaran implements HitungRuang{
    private double tinggi;

    public Tabung(double tinggi, double jariJari) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double getJariJari() {
        return jariJari;
    }
    
    @Override
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public double Volume(){
        return super.Luas() * this.tinggi;
    }
    
    @Override
    public double LuasPermukaan(){
        return 2 * super.Luas() + super.Keliling() * this.tinggi;
    }
}
