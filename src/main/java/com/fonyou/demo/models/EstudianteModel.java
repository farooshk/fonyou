package com.fonyou.demo.models;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "estudiante")
public class EstudianteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idEstudiante;

    private String nombre;
    private int edad;
    private String ciudad;
    private int zonaHoraria;

    @ManyToMany
    @JoinTable(name = "estudiante_examenes", joinColumns = @JoinColumn(name = "idEstudiante"), inverseJoinColumns = @JoinColumn(name = "idExamen"))
    private List<ExamenModel> examenes;

    public EstudianteModel(){
    }

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getZonaHoraria() {
        return zonaHoraria;
    }

    public void setZonaHoraria(int zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }

    public List<ExamenModel> getExamenes() {
        return examenes;
    }

    public void setExamenes(List<ExamenModel> examenes) {
        this.examenes = examenes;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
        result = prime * result + edad;
        result = prime * result + ((examenes == null) ? 0 : examenes.hashCode());
        result = prime * result + ((idEstudiante == null) ? 0 : idEstudiante.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + zonaHoraria;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EstudianteModel other = (EstudianteModel) obj;
        if (ciudad == null) {
            if (other.ciudad != null)
                return false;
        } else if (!ciudad.equals(other.ciudad))
            return false;
        if (edad != other.edad)
            return false;
        if (examenes == null) {
            if (other.examenes != null)
                return false;
        } else if (!examenes.equals(other.examenes))
            return false;
        if (idEstudiante == null) {
            if (other.idEstudiante != null)
                return false;
        } else if (!idEstudiante.equals(other.idEstudiante))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (zonaHoraria != other.zonaHoraria)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "EstudianteModel [ciudad=" + ciudad + ", edad=" + edad + ", examenes=" + examenes + ", idEstudiante=" + idEstudiante
                + ", nombre=" + nombre + ", zonaHoraria=" + zonaHoraria + "]";
    }

}
