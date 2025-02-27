
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Agente {

    //atributos
    private String nombre;
    private int ID;
    private String codigo;
    private String sucursalPerteneciente;
    private String vehiculo;
    

    //constructores
    public Agente(String nombre, int ID, String codigo, String sucursalPerteneciente, String vehiculo) {
        this.nombre = nombre;
        this.ID = ID;
        this.codigo = codigo;
        this.sucursalPerteneciente = sucursalPerteneciente;
        this.vehiculo = vehiculo;
      
    }

    //getterYsetters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSucursalPerteneciente() {
        return sucursalPerteneciente;
    }

    public void setSucursalPerteneciente(String sucursalPerteneciente) {
        this.sucursalPerteneciente = sucursalPerteneciente;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
   
    //metodo
    public void datosAgente(){
        
        nombre=JOptionPane.showInputDialog("Ingrese el nombre:");
        ID=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula: "));
        codigo=JOptionPane.showInputDialog("Ingrese el codigo: ");
        sucursalPerteneciente=JOptionPane.showInputDialog("Ingrese la sucursal: ");
        vehiculo=JOptionPane.showInputDialog("Posee vehiculo(si/no): ");
        
        
    }
   
}
