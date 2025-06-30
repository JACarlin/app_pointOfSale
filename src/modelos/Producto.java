/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author alexc
 */
public class Producto {
    private String imagen;
    private String nombreProducto;
    
    private int cantidadProducto;
    private String descripcionProducto;
    private int idProducto;
    private String codigoProducto;
    private double precioUnitario;
    private double precioMayoreo;

    public Producto() {
    }

    public Producto(String imagen, String nombreProducto, int cantidadProducto, String descripcionProducto, int idProducto, String codigoProducto, double precioUnitario, double precioMayoreo) {
        this.imagen = imagen;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.descripcionProducto = descripcionProducto;
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.precioUnitario = precioUnitario;
        this.precioMayoreo = precioMayoreo;
    }


    
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioMayoreo() {
        return precioMayoreo;
    }

    public void setPrecioMayoreo(double precioMayoreo) {
        this.precioMayoreo = precioMayoreo;
    }
    
}
