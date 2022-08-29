package com.fonyou.demo.models;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "examen")
public class ExamenModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idExamen;

    private String nombre;
    @ManyToMany(mappedBy = "examenes")
    private List<EstudianteModel> estudiantes;

    @OneToMany
    @JoinTable(name = "examen_preguntas", joinColumns = @JoinColumn(name = "idExamen"), inverseJoinColumns = @JoinColumn(name = "idPregunta"))
    private List<PreguntaModel> preguntas;

    public ExamenModel(){
    }

    public Long getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(Long idExamen) {
        this.idExamen = idExamen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<EstudianteModel> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<EstudianteModel> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<PreguntaModel> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<PreguntaModel> preguntas) {
        this.preguntas = preguntas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((estudiantes == null) ? 0 : estudiantes.hashCode());
        result = prime * result + ((idExamen == null) ? 0 : idExamen.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((preguntas == null) ? 0 : preguntas.hashCode());
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
        ExamenModel other = (ExamenModel) obj;
        if (estudiantes == null) {
            if (other.estudiantes != null)
                return false;
        } else if (!estudiantes.equals(other.estudiantes))
            return false;
        if (idExamen == null) {
            if (other.idExamen != null)
                return false;
        } else if (!idExamen.equals(other.idExamen))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (preguntas == null) {
            if (other.preguntas != null)
                return false;
        } else if (!preguntas.equals(other.preguntas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ExamenModel [estudiantes=" + estudiantes + ", idExamen=" + idExamen + ", nombre=" + nombre
                + ", preguntas=" + preguntas + "]";
    }

}
