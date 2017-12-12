package proxecto_intervalo;

import javax.swing.JOptionPane;

public class Dividir {

    private int numerador;
    private int denominador;

    public Dividir() {

    }

    public void dividirPropaga() throws MiExcepcion {

        numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea numerador: "));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea denominador: "));

        if (numerador < 20 || numerador > 100) {
            throw new MiExcepcion("... El numerador tiene que ser mayor de 20 y menor de 100 ...");
        }
        System.out.println("resultado= " + numerador / denominador);
    }

    public void dividirCaptura() {

        try {

            numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea numerador: "));
            denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea denominador: "));
            
            if(numerador < 20 || numerador > 100){
                
                throw new MiExcepcion();
           
            }
            int resultado = numerador / denominador;
            System.out.println(numerador + "/" + denominador + " = " + resultado);

        } catch (MiExcepcion e1) {
            System.out.println("El numerador tiene que estar entre 20 y 100");
        }
    }
}
