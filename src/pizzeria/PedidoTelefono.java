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
public class PedidoTelefono extends Pedido {
   protected String telefono;

    public PedidoTelefono(String telefono, Cliente cliente, ArrayList<Item> items) {
        super(cliente, items);
        this.telefono = telefono;
    }
   
   
}
