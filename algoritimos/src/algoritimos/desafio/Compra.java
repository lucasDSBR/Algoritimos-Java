/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritimos.desafio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acerte
 */
public class Compra {
    final List<Item> itens = new ArrayList<Item>();

    void adicionarItem(Produto p, int qtde)
    {
        this.itens.add(new Item(p, qtde)); 
    }

    void adicionarItem(String nome, double preco, int qtde)
    {
        Produto prod = new Produto(nome, preco);
        this.itens.add(new Item(prod, qtde)); 
    }

    double obterValorTotal()
    {
        double total = 0;
        for(Item item: itens)
        {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
