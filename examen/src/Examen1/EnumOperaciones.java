package Examen1;

public enum EnumOperaciones {SUMA, RESTA, MULTIPLICACION, DIVISION, MENU};

   
    private final String OperacionAritmetica;

    EnumOperaciones(final String OperacionAritmetica) {
        this.OperacionAritmetica = OperacionAritmetica;
    }

    public String getOperacionAritmetica() {
        return this.OperacionAritmetica;

    }
}
