package enum_sexo;

public class Sexo {
    public static final String MASCULINO = null;

    MASCULINO("Masculino"),
    FEMININO ("Feminino"),
    TRANS("Trans");

    private String texto;

    public Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Sexo [texto=" + texto + "]";
    }

}
