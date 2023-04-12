import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("nome","09678543212","34378108","clientexave@checknheck.com");
        cliente1.setPercentualDesconto(BigDecimal.valueOf(10));

        Produto produto1 = new Produto(1,"papel higienico neve",BigDecimal.valueOf(13.99));
        Produto produto2 = new Produto(2,"anzol e linha",BigDecimal.valueOf(3.99));
        Produto produto3 = new Produto(3,"faca de cozinha",BigDecimal.valueOf(34.90));
        Produto produto4 = new Produto(4,"escova cabelo ",BigDecimal.valueOf(45.00));

        Imposto imposto1 = new Imposto("icms",new BigDecimal("7.5"));

        Venda venda = new Venda(LocalDate.now(),cliente1,imposto1);

        venda.addProduto(produto1);
        venda.addProduto(produto2);
        venda.addProduto(produto3);
        venda.addProduto(produto4);

        System.out.println(venda);
        System.out.println("total da nota sem impostos: "+venda.getTotalNota());
        System.out.println("total da venda com impostos: "+venda.getValorImposto());

    }
}