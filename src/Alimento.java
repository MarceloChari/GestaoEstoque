public class Alimento extends Produto{
    public Alimento(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem){
        if (porcentagem > 40){
            porcentagem = 40;
        }

        double valorDesconto = getPreco() *  (porcentagem / 100);
        double precoFinal = getPreco() - valorDesconto;

        System.out.println("O preço com desconto do alimento ficou de: R$ " + precoFinal);
        return precoFinal;
    }

}
