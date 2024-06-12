import java.util.ArrayList;

/**
 * Write a description of class veterinaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class veterinaria
{
   private ArrayList<Mascota> mascotas;

    public veterinaria() {
        mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public ArrayList<Mascota> obtenerMascotas() {
        return mascotas;
    }
    
    
}



