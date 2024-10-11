import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        Produto camisa = new Roupa("Camisa", 90.00);
        Produto calca = new Roupa("Calça Jeans", 200.00);
        Produto arroz = new Alimento("Arroz", 25.00);
        Produto feijao = new Alimento("Feijão", 10.00);

        produtos.add(camisa);
        produtos.add(calca);
        produtos.add(arroz);
        produtos.add(feijao);

        Estoque estoque = new Estoque(produtos);

        System.out.println("Exibir preços com 10% de desconto:");
        estoque.exibirPrecosComDesconto(10.0);

        System.out.println("Exibir preços com 50% de desconto:");
        estoque.exibirPrecosComDesconto(50.0);
    }
}

