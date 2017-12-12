
package alumno;


public class DatosAlumno {
    
    private String nome;
    private DatosAcademicos academicos;
    private DatosPersoais persoais;
    
public DatosAlumno(){
    academicos= new DatosAcademicos();
    persoais= new DatosPersoais();
}
public DatosAlumno(String nome, String ref, int nota, String dir, String tlfn){
    this.nome=nome;
    academicos=new DatosAcademicos();
    academicos.setRef(ref);
    academicos.setNota(nota);
    persoais=new DatosPersoais();
    persoais.setDir(dir);
    persoais.setTlfn(tlfn);
} 
public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome=nome;
}
public DatosAcademicos getAcademicos(){
    return academicos;
}
public void setAcademicos(DatosAcademicos academicos){
    this.academicos=academicos;   
}
public DatosPersoais getPersoais(){
    return persoais;
}
public void setPersoais(DatosPersoais persoais){
    this.persoais=persoais;  
}
    @Override
    public String toString(){
    return "DATOS DO ALUMNO:\nnome: "+nome+"\ndatos academicos: "+academicos+"\ndatos persoais: "+persoais;
}
}
