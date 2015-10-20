
package bol53;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Bol53 {


    public static void main(String[] args) {
    
        double radio;
        Scanner obx=new Scanner (System.in);
        System.out.println("Introduce o radio da circunferencia en cm: ");
        radio=obx.nextFloat();
        Circulo circulo = new Circulo (radio, PI);
        
        System.out.println("Area do círculo= "+circulo.calcularArea()+" cm²");
        System.out.println("Lonxitude da circunferencia= "+circulo.calcularLonxitude()+" cm");
    
    
    }
    
    
}
