/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De2;

/**
 *
 * @author winan
 */
public class Nhanvien extends Person{
    private String PB;
    private float HSL, TN, LCB, LTL;

    public Nhanvien(String PB, float HSL, float TN, float LCB, float LTL, String HT, String NS, String DC, String GT) {
        super(HT, NS, DC, GT);
        this.PB = PB;
        this.HSL = HSL;
        this.TN = TN;
        this.LCB = LCB;
        this.LTL = LTL;
    }

    public Nhanvien() {    
    }

    public String getPB() {
        return PB;
    }

    public void setPB(String PB) {
        this.PB = PB;
    }

    public float getHSL() {
        return HSL;
    }

    public void setHSL(float HSL) {
        this.HSL = HSL;
    }

    public float getTN() {
        return TN;
    }

    public void setTN(float TN) {
        this.TN = TN;
    }

    public float getLCB() {
        return LCB;
    }

    public void setLCB(float LCB) {
        this.LCB = LCB;
    }

    public float getLTL() {
        return LTL;
    }

    public void setLTL(float LTL) {
        this.LTL = LTL;
    }

    public float Tinh_LTL(){
        LTL = LCB*HSL*(1+TN/100);
        return LTL;
    }
    
    @Override
    public String toString() {
        return super.toString()+"$"+PB+"$"+HSL+"$"+TN+"$"+LCB+"$"+LTL; 
    }
}
