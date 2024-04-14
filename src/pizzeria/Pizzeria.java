/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeria;

import java.util.List;

/**
 *
 * @author decera
 */
public class Pizzeria {
    private String nombre;
    private List<Cliente> clientes;
    private List<Item> items;
    private List<Pedido> pedidos;

    public Pizzeria(String nombre, List<Cliente> clientes, List<Item> items, List<Pedido> pedidos) {
        this.nombre = nombre;
        this.clientes = clientes;
        this.items = items;
        this.pedidos = pedidos;
    }
    
    
    
    public boolean addCliente(Cliente cliente){
        
    }
    
    public boolean addItem (Item item){
        
    }
    
    public boolean addPedido (Pedido pedido){
        
    }
    
    public Cliente getCliente (int index){
        
    }
    
    public item getItem (int index){
        
    }
    
    public int calcProdMasVendidoCliente(int numCliente){
        
    }
    
    
    
}
