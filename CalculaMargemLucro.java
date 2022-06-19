
package produto;
//@author caua_marinho

import java.util.Scanner;

public class TesteProduto{
    
    public static void main(String[] args){
        String nome;
        double precoCusto, precoVenda, margemLucro;
        
        Scanner p = new Scanner(System.in);
        System.out.println("Nome do produto: ");
        nome = p.next();
        System.out.println("precoCusto: ");
        precoCusto = p.nextDouble();
        System.out.println("precoVenda: ");
        precoVenda = p.nextDouble();
        margemLucro = precoVenda - precoCusto;
        if(precoVenda < precoCusto){
            System.out.println("Impossivel comprar este produto, quantia de dinheiro insuficiente!");
        }
        if(margemLucro <= 0){
            System.out.println("Você não irá lucrar com essa venda!");
        }else{
            System.out.println("margemLucro: "+margemLucro);
            margemLucro = (margemLucro / 100);
            System.out.println("Percentual Margem de Lucro: "+margemLucro);
        }
        
    }   
}
/*Crie uma classe Produto para representar um produto do mundo real. Sua classe
deverá conter os seguintes atributos e métodos:
a) Um campo de dados privado do tipo String chamado nome, que representará o nome do
produto.
b) Um campo de dados privado do tipo double chamado precoCusto, que guardará o preço de
custo do produto.
c) Um campo de dados privado do tipo double chamado precoVenda, que guardará o preço de
venda do produto.
d) Um campo de dados privado do tipo double chamado margemLucro, que guardará a margem
de lucro do produto.
e) Métodos públicos get() e set() para os atributos acima. Modifique o método setPrecoVenda()
para que o preço de venda não seja inferior ao preço de compra. Caso isso aconteça, exiba uma
mensagem alertando o usuário.
f) Crie um método chamado calcularMargemLucro() que calculará a margem de lucro do
produto.

g) Crie um método chamado getMargemLucroPorcentagem() que retornará a margem de lucro
como percentual.
Para finalizar, no método main() da classe de teste, crie um novo objeto da classe Produto, peça
para o usuário informar os preços de custo e de venda e exiba a margem de lucro em moeda e
em percentual. Sua saída deverá ser algo parecido com o mostrado na imagem abaixo:*/