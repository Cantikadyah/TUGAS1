/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo1.ruang;

import tugaspbo1.bidang.PersegiPanjang;
/**
 *
 * @author ASUS
 */
public class Balok extends PersegiPanjang implements HitungRuang{
    
    private int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double Volume() {
        return this.Luas()*this.tinggi;
    }

    @Override
    public double LuasPermukaan() {
        return 2*((this.panjang*this.lebar) + (this.panjang*this.tinggi) + (this.lebar*this.tinggi)) ;
    }
}
