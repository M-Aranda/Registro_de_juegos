package ejemploClase.model;

import java.util.List;

/**
 *
 * @author prez
 */
public class Juego {
    private int id;
    private String nombre;
    private Consola consola;
    private boolean digital;
    private int precio;
    private int stock;
    private List<String> categorias;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public boolean isDigital() {
        return digital;
    }
    
    public String getEstado(){
        if(this.isDigital()){
            return "Digital";
        }else{
            return "Físico";
        }
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<String> categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return nombre+" $"+precio+" ["+stock+"]";
    }
}
