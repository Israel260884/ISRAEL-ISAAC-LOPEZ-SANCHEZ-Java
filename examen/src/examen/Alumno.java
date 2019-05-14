package examen;

public class Alumno extends Persona {
    private String salon;
    private String grupo;
    private Float promedio;

    public Alumno() {
    }

    public Alumno(final String salon, final String grupo, final Float promedio) {
        this.salon = salon;
        this.grupo = grupo;
        this.promedio = promedio;
    }

//**getter salon
    public String getSalon() {
        return this.salon;
    }

//**setter salon
    public void setSalon() {
        this.salon = this.salon;
    }

//**getter grupo
    public String getGrupo() {
        return this.grupo;
    }

//**setter grupo
    public void setGrupo() {
        this.grupo = this.grupo;
    }

//**getter promedio
    public Float getPromedio() {
        return this.promedio;
    }

//**setter promedio
    public void setPromedio() {
        this.promedio = this.promedio;
    }

}
