/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import java.util.ArrayList;
import java.util.List;
import modelos.Producto;

/**
 *
 * @author alexc
 */
public class NegocioProducto {
    public static List<Producto> lstProductos=new ArrayList<>();
    public static List<Producto> pedido=new ArrayList<>();
    
    public NegocioProducto() {
        //lstProductos =new ArrayList<>();
    }
    public boolean altaProduto(Producto p){
        if(p.getNombreProducto().isEmpty()){
            return false;
        }else{
            lstProductos.add(p);
            return true;
        }
    }
    public boolean bajaProducto(Producto p,int cant){
        try{
            lstProductos.remove(p.getIdProducto()-1);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public Producto BuscarProducto(String nombre){
        for(int i=0; i<lstProductos.size();i++){
            Producto temp= lstProductos.get(i);
            if(temp.getNombreProducto().equals(nombre)){
                return temp;
            }
        }
        return null;
    }
    public void modificarcantidad(Producto p, int cantidad){
        for(int i=0; i<lstProductos.size();i++){
            if(lstProductos.get(i).equals(p)){
                lstProductos.get(i).setCantidadProducto(lstProductos.get(i).getCantidadProducto()-cantidad);
                //return true;
            }
        }
        //return false;
    }
    public void modificarcantidad2(Producto p, int cantidad){
        for(int i=0; i<pedido.size();i++){
            if(pedido.get(i).equals(p)){
                pedido.get(i).setCantidadProducto(cantidad);
                //return true;
            }
        }
        //return false;
    }
    public void modificarcantidadr(Producto p, int cantidad){
        for(int i=0; i<lstProductos.size();i++){
            if(lstProductos.get(i).getNombreProducto().equals(p.getNombreProducto())){
                lstProductos.get(i).setCantidadProducto(lstProductos.get(i).getCantidadProducto()+cantidad);
                //return true;
            }
        }
        //return false;
    }
}
