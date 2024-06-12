
/**
 * Write a description of class Mascota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mascota
{
    private String nombre;
    private String especie;
    private int edad;
    private String raza; 
    
    public Mascota(){
        
    }

    public Mascota(String nombre, String especie, int edad, String raza) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Especie: " + especie + ", Edad: " + edad + ", Raza: " + raza;
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**SET Method Propertie nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**GET Method Propertie especie*/
    public String getEspecie(){
        return this.especie;
    }//end method getEspecie

    /**SET Method Propertie especie*/
    public void setEspecie(String especie){
        this.especie = especie;
    }//end method setEspecie

    /**GET Method Propertie edad*/
    public int getEdad(){
        return this.edad;
    }//end method getEdad

    /**SET Method Propertie edad*/
    public void setEdad(int edad){
        this.edad = edad;
    }//end method setEdad

    /**GET Method Propertie raza*/
    public String getRaza(){
        return this.raza;
    }//end method getRaza

    /**SET Method Propertie raza*/
    public void setRaza(String raza){
        this.raza = raza;
    }//end method setRaza

//End GetterSetterExtension Source Code


}//End class