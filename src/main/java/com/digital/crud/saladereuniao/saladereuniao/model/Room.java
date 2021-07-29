package com.digital.crud.saladereuniao.saladereuniao.model;

import javax.persistence.Column; //
import javax.persistence.Entity; // Entidade dos dados
import javax.persistence.GeneratedValue; //Principalmente para a parte de ID
import javax.persistence.GenerationType;
import javax.persistence.Id; //ID da Entidade
import javax.persistence.Table; //Tabela do nosso banco de dados

@Entity
@Table(name="meetingroom")
public class Room {

    private long id;
    private String name;
    private String date;
    private String starthour;
    private String endhour;

    //Construtores para acesso aos dados
    public Room(){
        
    }
    
    public Room(long id, String name, String date, String starthour, String endhour){
        this.id=id;
        this.name=name;
        this.date=date;
        this.starthour=starthour;
        this.endhour=endhour;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "date", nullable = false)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Column(name = "startHour", nullable = false)
    public String getStarthour() {
        return starthour;
    }

    public void setStarthour(String starthour) {
        this.starthour = starthour;
    }

    @Column(name = "endHour", nullable = false)
    public String getEndhour() {
        return endhour;
    }

    public void setEndhour(String endhour) {
        this.endhour = endhour;
    }

    //Transformar em String para Front puder acessar
    @Override
    public String toString() {
        return "Room [id="+ id+",name="+ name+",startHour="+ starthour+",endHour="+ endhour+" ]";
    }
}
