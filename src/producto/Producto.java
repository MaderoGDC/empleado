/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

/**
 *
 * @author Estudiante
 */
public class Producto {
    private String Nombre;
    private int CantidadAct;
    private int Pedir;
    private int PriceBase;
    private int PriceFinal;

    public Producto(String Nombre, int CantidadAct, int Pedir, int PriceBase, int PriceFinal) {
        this.Nombre = Nombre;
        this.CantidadAct = CantidadAct;
        this.Pedir = Pedir;
        this.PriceBase = PriceBase;
        this.PriceFinal = PriceFinal;
    }
//GET
    public String getNombre() {
        return Nombre;
    }

    public int getCantidadAct() {
        return CantidadAct;
    }

    public int getPedir() {
        return Pedir;
    }

    public int getPriceBase() {
        return PriceBase;
    }

    public int getPriceFinal() {
        return PriceFinal;
    }
//SET

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCantidadAct(int CantidadAct) {
        this.CantidadAct = CantidadAct;
    }

    public void setPedir(int Pedir) {
        this.Pedir = Pedir;
    }

    public void setPriceBase(int PriceBase) {
        this.PriceBase = PriceBase;
    }

    public void setPriceFinal(int PriceFinal) {
        this.PriceFinal = PriceFinal;
    }
    
   
    

    
    
}
