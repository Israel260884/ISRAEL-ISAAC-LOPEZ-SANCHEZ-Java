package Calculadora;

public enum EnumOperaciones {

    SUMA("suma"), RESTA("resta"), MULTIPLICACION("multipliacion"), DIVISION("division");

    private final String OperacionAritmetica;

    EnumOperaciones(final String OperacionAritmetica) {
        this.OperacionAritmetica = OperacionAritmetica;
    }

    public String getOperacionAritmetica() {
        return this.OperacionAritmetica;

    }
}
