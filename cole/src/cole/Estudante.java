
package cole;


public class Estudante extends Datos {
    
    private String nomeCole;
    private String nivel;
    
    public Estudante(){
        
    }
    public Estudante(String nome, String dir, String nomeCole,String nivel){
        super(nome, dir);
        
        this.nomeCole=nomeCole;
        this.nivel=nivel;
    }
    public String getNomeCole(){
        return nomeCole;
    }
    public void setNomeCole(String nomeCole){
        this.nomeCole=nomeCole;
    }
    public String getNivel(){
        return nivel;
    }
    public void setNivel(String nivel){
        this.nivel=nivel;
    }
    @Override
    public String toString(){
        return "\nEstudante: "+super.toString()+"\nNome Colexio: "+nomeCole+"\nNivel: "+nivel;
    }
}
