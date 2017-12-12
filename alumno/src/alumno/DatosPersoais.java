
package alumno;


public class DatosPersoais {
    
    private String direccion;
    private String telefono;
    
    
public DatosPersoais(){
    
}
public DatosPersoais(String dir, String tlfn){
    direccion=dir;
    telefono=tlfn; 
}
 public String getDir(){
     return direccion;
 } 
 public void setDir(String dir){
     direccion=dir;  
 }
 public String getTlfn(){
     return telefono;
 }
 public void setTlfn(String tlfn){
     telefono=tlfn;    
 }
    @Override
 public String toString(){
     return "direccion: "+direccion+" telefono: "+telefono;
 }
}
