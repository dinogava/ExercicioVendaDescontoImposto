import java.math.BigDecimal;

public class Imposto {
    private String nome;
    private BigDecimal aliquota;

    public Imposto(){

    }
    public Imposto(String nome, BigDecimal aliquota) {
        this.nome = nome;
        this.aliquota = aliquota;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getAliquota() {
        return aliquota;
    }

    @Override
    public String toString() {
        return "Imposto{" +
                "nome='" + nome + '\'' +
                ", aliquota=" + aliquota +
                '}';
    }
}
