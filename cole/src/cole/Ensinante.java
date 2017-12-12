
package cole;


public class Ensinante extends Datos{
    
    private String materia;
    
    public Ensinante(){
        
    }
    public Ensinante(String nome, String dir, String materia){
        super(nome,dir);
        
        this.materia=materia;
        
    }
    public String getMateria(){
        return materia;
    }
    public void setMateria(String materia){
        this.materia=materia;    
    }
    @Override
    public String toString(){
        return "Ensinante: "+super.toString()+"\nMateria: "+materia;
    }
}
