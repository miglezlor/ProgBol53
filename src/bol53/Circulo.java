
package bol53;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Circulo {
    private double radio;
    final double PI=3.14;
    private double radio2;
    
    public Circulo (){
        
    }
    public Circulo(double r, double PI){
        radio=r;
    }
    public double calcularArea (){
        radio2 =Math.pow(radio, 2);
        return (PI*radio2);
    }
    public double calcularLonxitude(){
        return (PI*radio*2);
    }
}
