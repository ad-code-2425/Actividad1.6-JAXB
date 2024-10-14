package cdm.jaxb.model;

import java.util.ArrayList;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://www.milibreria.com", name = "bookshop")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Libreria {

    private ArrayList<Libro> ListaLibro;

    private String nombre;

    private String lugar;

    public ArrayList<Libro> getListaLibro() {
        return ListaLibro;
    }

    @XmlElementWrapper(name = "listaLibro")
    @XmlElement(name = "libro")
    public void setListaLibro(ArrayList<Libro> ListaLibro) {
        this.ListaLibro = ListaLibro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public String getNombre() {
        return nombre;
    }
}
