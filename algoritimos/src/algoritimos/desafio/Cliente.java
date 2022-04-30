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
public class Cliente {
    final String nome;
    final List<Compra> compras = new ArrayList<Compra>();

    Cliente(String nome)
    {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra)
    {
        this.compras.add(compra);
    }
    double obterValorTotal()
    {
        double total = 0;
        for(Compra compra: compras)
        {
            total += compra.obterValorTotal();
        }
        return total;
    }
}
