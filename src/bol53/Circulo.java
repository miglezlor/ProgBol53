
package bol53;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Circulo {
    private double radio;
    final double PI=3.14;
    
    
    public Circulo (){
        
    }
    public Circulo(double r, double PI){
        radio=r;
    }
    public double calcularArea (){
        
        return PI*Math.pow(radio,2);
    }
    public double calcularLonxitude(){
        return PI*radio*2;
    }
}
