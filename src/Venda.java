import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Venda {
    private LocalDate data;
    private Cliente cliente;
    private List<Produto> listaProdutos = new ArrayList();
    private Imposto imposto;

    public Venda (){

    }

    public Venda(LocalDate data, Cliente cliente,Imposto imposto) {
        this.data = data;
        this.cliente = cliente;
        this.imposto = imposto;
    }

    public BigDecimal getTotalNota() {
        BigDecimal valorProdutos = BigDecimal.ZERO;
        for (Produto produto:listaProdutos) {
            valorProdutos = valorProdutos.add(produto.getValorUnitario());

        }
        return valorProdutos.subtract(valorProdutos.multiply
                (cliente.getPercentualDesconto().divide(new BigDecimal("100.00"))));


    }
    public BigDecimal getValorImposto(){
        BigDecimal impostoNota = BigDecimal.ZERO;
        impostoNota = impostoNota.add(getTotalNota());

        return impostoNota.subtract(impostoNota.multiply(imposto.getAliquota().divide(new BigDecimal("100.00"))));

    }
    public void addProduto(Produto produto){
        listaProdutos.add(produto);
    }
    public LocalDate getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List getListaProdutos() {
        return listaProdutos;
    }


    @Override
    public String toString() {
        return "Venda{" +
                "data=" + data +
                ", cliente=" + cliente +
                ", listaProdutos=" + listaProdutos +
                ", imposto=" + imposto +
                '}';
    }
}
