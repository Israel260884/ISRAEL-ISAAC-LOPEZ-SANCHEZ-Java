package Examen1;

public enum EnumOperaciones {

	SUMA("suma"), RESTA("resta"), MULTIPLICACION("multiplicacion"), DIVISION("division"), S("suma"), R("resta"),
	M("multiplicacion"), D("division");

	private final String nombreOperaciones;

	EnumOperaciones(final String nombreOperaciones) {
		this.nombreOperaciones = nombreOperaciones;
	}

	public String getNombreOperaciones() {
		return nombreOperaciones.toUpperCase();
	}

}
