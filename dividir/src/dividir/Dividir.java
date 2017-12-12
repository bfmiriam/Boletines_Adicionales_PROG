
package dividir;


public class Dividir {

  
    public static void main(String[] args) {
       
        DividirSenExcepcion dse1 = new DividirSenExcepcion(5,2);
        dse1.dividirSenExcepcion();
        dse1.sumar();
        
        System.out.println("**************");
        
        DividirSenExcepcion dse2 = new DividirSenExcepcion(5,0);
        dse2.dividirSenExcepcion();
        dse2.sumar();
    }
    
}
