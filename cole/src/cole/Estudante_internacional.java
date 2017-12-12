
package cole;


public class Estudante_internacional extends Estudante {
    
    private String pais;
    
    public Estudante_internacional(){
        
    }
    public Estudante_internacional(String nome, String dir, String nomeCole,String nivel, String pais){
        super(nome, dir,nomeCole,nivel);
        
        this.pais=pais;
        
    }
    public String getPais(){
        return pais;
    }
    public void setPais(String pais){
        this.pais=pais;
    }
    @Override
    public String toString(){
        return "Estudante internacional: "+super.toString()+"\nPais: "+pais;
    }
    
    
}
