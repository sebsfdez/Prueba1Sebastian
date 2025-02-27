
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sebas
 */
public class FacturaRealizada {

    //Atributos
    private String nombre;
    private int IDCliente;
    private String codigo;
    private int monto;
    private int numeroMes;
    private String facturaProductosElectricos;
    private String facturaProductosAutomotrices;
    private String facturaProductosConstruccion;
    private int puntos = 0;
    private int contadorE = 0;
    private int contadorA = 0;
    private int contadorC = 0;
    private int contadorMes = 0;

    //constructor
    public FacturaRealizada(String nombre, int IDCliente, String codigo, int monto, int numeroMes, String facturaProductosElectricos, String facturaProductosAutomotrices, String facturaProductosConstruccion) {
        this.nombre = nombre;
        this.IDCliente = IDCliente;
        this.codigo = codigo;
        this.monto = monto;
        this.numeroMes = numeroMes;
        this.facturaProductosElectricos = facturaProductosElectricos;
        this.facturaProductosAutomotrices = facturaProductosAutomotrices;
        this.facturaProductosConstruccion = facturaProductosConstruccion;
    }

    //puntos y bonos
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
  
    //datosGetySet
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setID(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getNumeroMes() {
        return numeroMes;
    }

    public void setNumeroMes(int numeroMes) {
        this.numeroMes = numeroMes;
    }

    public String getFacturaProductosElectricos() {
        return facturaProductosElectricos;

    }

    public void setFacturaProductosElectricos(String facturaProductosElectricos) {
        this.facturaProductosElectricos = facturaProductosElectricos;
    }

    public String getFacturaProductosAutomotrices() {
        return facturaProductosAutomotrices;
    }

    public void setFacturaProductosAutomotrices(String facturaProductosAutomotrices) {
        this.facturaProductosAutomotrices = facturaProductosAutomotrices;
    }

    public String getFacturaProductosConstruccion() {
        return facturaProductosConstruccion;
    }

    public void setFacturaProductosConstruccion(String facturaProductosConstruccion) {
        this.facturaProductosConstruccion = facturaProductosConstruccion;
    }

    //metodo1Calculo
    public void CalcBono() {

    //condiciones1
        if (getFacturaProductosAutomotrices().equalsIgnoreCase("si") && getFacturaProductosConstruccion().equalsIgnoreCase("si") && getFacturaProductosElectricos().equalsIgnoreCase("si")) {
            puntos += 3;

        }
        //contadores
        if (getFacturaProductosAutomotrices().equalsIgnoreCase("si")) {
            contadorA++;
            JOptionPane.showMessageDialog(null, "contador: " + contadorA);
        }
        if (getFacturaProductosConstruccion().equalsIgnoreCase("si")) {
            contadorC++;
            JOptionPane.showMessageDialog(null, "contador: " + contadorC);

        }
        if (getFacturaProductosElectricos().equalsIgnoreCase("si")) {
            contadorE++;
            JOptionPane.showMessageDialog(null, "contador: " + contadorE);

        }
        //continuacondiciones
        if (contadorE >= 3) {
            puntos += 1;

        }
        if (contadorA > 4) {
            puntos += 1;
        }
        if (getFacturaProductosConstruccion().equalsIgnoreCase("si")) {
            puntos += 2;
        }
        if (getMonto() > 50000) {
            puntos += 1;

        }

    }

    //metodo2Calculo

    public void BonoExtra() {
        if (getNumeroMes()==1 || getMonto() > 300000) {
            contadorMes++;
        }
    }
}
