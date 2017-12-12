
package alumno;

public class DatosAcademicos {
    
    private String referencia;
    private int nota;
    
    
public DatosAcademicos(){
    
}
public DatosAcademicos(String ref, int nota){
    referencia=ref;
    this.nota=nota;   
}

public String getRef(){
    return referencia;
}
public void setRef(String ref){
    referencia=ref;  
}  
public int getNota(){
    return nota;
}
public void setNota(int nota){
    this.nota=nota;    
}
    @Override
    public String toString(){
    return "referencia: "+referencia+" nota: "+nota;
}

}
