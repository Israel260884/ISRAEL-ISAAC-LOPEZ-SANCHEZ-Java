package examen;

public class Persona {

    private String nombre;
    private Integer edad;
    private Boolean vivo;

    public Persona() {
    }

    public Persona(final String nombre, final Integer edad, final Boolean vivo) {
        this.nombre = nombre;
        this.edad = edad;
        this.setVivo(vivo);
    }

//**getter nombre
    public String getNombre() {
        return this.nombre;
    }

//**setter nombre
    public void setNombre() {
        this.nombre = this.nombre;
    }

//**getter edad
    public Integer getEdad() {
        return this.edad;
    }

//**setter edad
    public void setEdad() {
        this.edad = this.edad;
    }

//**getter vivo
    public Boolean getVivo() {
        return this.vivo;
    }

//**setter vivo
    public void setVivo(final Boolean vivo) {
        this.vivo = vivo;
    }

}
