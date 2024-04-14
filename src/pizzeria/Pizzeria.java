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
public class Pizzeria {
    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Item> items;
    private ArrayList<Pedido> pedidos;

    public Pizzeria(String nombre, ArrayList<Cliente> clientes, ArrayList<Item> items, ArrayList<Pedido> pedidos) {
        this.nombre = nombre;
        this.clientes = clientes;
        this.items = items;
        this.pedidos = pedidos;
    }
    
    
    
    public boolean addCliente(Cliente cliente){
        if(clientes.contains(cliente)){
            System.out.println("el cliente ya extiste");
            return false;
        }else{
            clientes.add(cliente);
            return true;
        }
    }
    
    public boolean addItem (Item item){
         if(items.contains(item)){
            System.out.println("el item ya extiste");
            return false;
        }else{
            items.add(item);
            return true;
        }
    }
    
    public boolean addPedido (Pedido pedido){
         if(pedidos.contains(pedido)){
            System.out.println("el pedido ya extiste");
            return false;
        }else{
            pedidos.add(pedido);
            return true;
        }
    }
    
    public Cliente getCliente (int index){
        return clientes.get(index);
    }
    
    public Item getItem (int index){
        return items.get(index);
    }
    
    public int calcProdMasVendidoCliente(int numCliente){
        
    }
    
    
    
}
