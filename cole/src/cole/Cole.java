
package cole;


public class Cole {

    
    public static void main(String[] args) {
      
        Datos dt = new Datos("Laura","Calle Urzaiz, numero 12");
        System.out.println(dt.toString());
        
        Estudante est = new Estudante("Adrián","Calle Príncipe numero 10","Salesianos","4º primaria");
        System.out.println(est.toString());
         
        Estudante_internacional inter = new Estudante_internacional("Marie","Rue Touluse nº 3","Le etoile","3º eso","France");
        System.out.println(inter.toString());
        
        Ensinante ens = new Ensinante("Andrea","Rua Florida","matematicas");
        System.out.println(ens.toString());
        
        est.setNivel("5º primaria");
        System.out.println(est.toString());
        ens.setMateria("ingles");
        System.out.println(ens.toString());
        
    }
    
}
