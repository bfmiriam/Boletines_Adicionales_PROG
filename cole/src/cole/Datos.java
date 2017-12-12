
package cole;


public class Datos {
    
    private String nome;
    private String direccion;
    
    public Datos(){
        
    }
    public Datos(String nome, String dir){
        this.nome=nome;
        direccion=dir;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String dir){
        direccion=dir;
    }

    @Override
    public String toString(){
        return "\nNome: "+nome+"\nDireccion: "+direccion;
    }
} 