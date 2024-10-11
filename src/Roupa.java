public class Roupa extends Produto{

    public Roupa(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem){
        double valorDesconto = getPreco() * (porcentagem/100);
        double precoFinal = getPreco() - valorDesconto;

        System.out.println("O preço com desconto da roupa ficou de: R$ " + precoFinal);
        return precoFinal;
    }
}
