package com.example.demo.models;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "usuario")

public class UsuarioModel {
    @id
    @GenerateValue(strategy = Generation.IDENTITY)
    @Column(unique = true, mullable =false)
    private long id;
    private String nombre;
    private String mail;
    private Interger prioridad; 
}
public void setPrioridad(Interger prioridad){
    this.prioridad =prioridad;
}
public interger getPrioridad(){
    return prioridad;
}
public long getId(){
    return id;
}
public void setId(Long id){
    this.id = id
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
public void setEmail( String email) {
    this.email = email; 

}