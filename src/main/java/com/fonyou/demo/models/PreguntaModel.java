package com.fonyou.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "pregunta")
public class PreguntaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idPregunta;

    private String pregunta;
    private String opcionA;
    private String opcionB;
    private String opcionC;
    private String opcionD;
    private String correcta;
    
    @ManyToOne
    private ExamenModel examen;

    public PreguntaModel(){
    }

    public Long getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Long idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getOpcionA() {
        return opcionA;
    }

    public void setOpcionA(String opcionA) {
        this.opcionA = opcionA;
    }

    public String getOpcionB() {
        return opcionB;
    }

    public void setOpcionB(String opcionB) {
        this.opcionB = opcionB;
    }

    public String getOpcionC() {
        return opcionC;
    }

    public void setOpcionC(String opcionC) {
        this.opcionC = opcionC;
    }

    public String getOpcionD() {
        return opcionD;
    }

    public void setOpcionD(String opcionD) {
        this.opcionD = opcionD;
    }

    public String getCorrecta() {
        return correcta;
    }

    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }

    public ExamenModel getExamen() {
        return examen;
    }

    public void setExamen(ExamenModel examen) {
        this.examen = examen;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((correcta == null) ? 0 : correcta.hashCode());
        result = prime * result + ((examen == null) ? 0 : examen.hashCode());
        result = prime * result + ((idPregunta == null) ? 0 : idPregunta.hashCode());
        result = prime * result + ((opcionA == null) ? 0 : opcionA.hashCode());
        result = prime * result + ((opcionB == null) ? 0 : opcionB.hashCode());
        result = prime * result + ((opcionC == null) ? 0 : opcionC.hashCode());
        result = prime * result + ((opcionD == null) ? 0 : opcionD.hashCode());
        result = prime * result + ((pregunta == null) ? 0 : pregunta.hashCode());
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
        PreguntaModel other = (PreguntaModel) obj;
        if (correcta == null) {
            if (other.correcta != null)
                return false;
        } else if (!correcta.equals(other.correcta))
            return false;
        if (examen == null) {
            if (other.examen != null)
                return false;
        } else if (!examen.equals(other.examen))
            return false;
        if (idPregunta == null) {
            if (other.idPregunta != null)
                return false;
        } else if (!idPregunta.equals(other.idPregunta))
            return false;
        if (opcionA == null) {
            if (other.opcionA != null)
                return false;
        } else if (!opcionA.equals(other.opcionA))
            return false;
        if (opcionB == null) {
            if (other.opcionB != null)
                return false;
        } else if (!opcionB.equals(other.opcionB))
            return false;
        if (opcionC == null) {
            if (other.opcionC != null)
                return false;
        } else if (!opcionC.equals(other.opcionC))
            return false;
        if (opcionD == null) {
            if (other.opcionD != null)
                return false;
        } else if (!opcionD.equals(other.opcionD))
            return false;
        if (pregunta == null) {
            if (other.pregunta != null)
                return false;
        } else if (!pregunta.equals(other.pregunta))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PreguntaModel [correcta=" + correcta + ", examen=" + examen + ", idPregunta=" + idPregunta
                + ", opcionA=" + opcionA + ", opcionB=" + opcionB + ", opcionC=" + opcionC + ", opcionD=" + opcionD
                + ", pregunta=" + pregunta + "]";
    }

}
