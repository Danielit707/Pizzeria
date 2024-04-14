/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeria;

import java.util.ArrayList;

/**
 *
 * @author decera
 */
public class PedidoOnline extends Pedido {
    private String email;

    public PedidoOnline(String email, Cliente cliente, ArrayList<Item> items) {
        super(cliente, items);
        this.email = email;
    }
    
        
    
    
}
