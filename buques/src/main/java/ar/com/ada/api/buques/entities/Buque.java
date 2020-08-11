package ar.com.ada.api.buques.entities;

import java.util.*;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "buques")
public class Buque {

    private ObjectId _id;
    private String matricula;
    private String nombre;
    private List<Viaje> viajes = new ArrayList<>();

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(List<Viaje> viajes) {
        this.viajes = viajes;
    }

}