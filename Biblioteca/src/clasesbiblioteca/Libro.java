package clasesbiblioteca;

public class Libro extends General {
    private int edicion;
    private int añoPublicacion;
    private Autor autor;

    public Libro() {


    }
    public Libro(int cod, String nom, int edicion, int añoPublicacion, Autor autor){
        super(cod, nom);
        this.edicion = edicion;
        this.añoPublicacion = añoPublicacion;
        this.autor = autor;
    }

    
    public void setEdicion(int edicion){

        this.edicion = edicion;
    }
    public void añoPublicacion(int añoPublicacion){

        this.añoPublicacion = añoPublicacion;
    }

    public void setAutor(Autor autor){

        this.autor = autor;
    }

    public int getEdicion(){
        return edicion;
    }
    public int getAñoPublicacion(){
        return getPublicacion;
    }
    public Autor getAutor(){
        return autor;
    }
    public String toString(){
        return "libro{"+" edicion " + Edicion + ", año publicacion " + añoPublicacion + ", autor  " + autor + super.toString() + '}';}
    }
}
