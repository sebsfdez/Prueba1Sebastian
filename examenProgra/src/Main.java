
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sebas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llamadoConstructor
        Agente agente = new Agente("", 0, "", "", "");

        //mensaje
        JOptionPane.showMessageDialog(null, "A continuacion datos del agente*");
        //datos del agente
        agente.datosAgente();

        //ciclo
        while (true) {
            //llamados constructor
            FacturaRealizada facturaRealizada = new FacturaRealizada("", 0, "", 0, 0, "", "", "");

            //mensaje
            JOptionPane.showMessageDialog(null, "A continuacion datos del cliente*");

            //datos de la factura
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
            int IDCliente = Integer.parseInt(JOptionPane.showInputDialog("Cedula del cliente: "));
            String codigo = JOptionPane.showInputDialog("Ingrese el codigo de factura: ");
            int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de la factura: "));

            //validez
            int numeroMes;
            do {
                numeroMes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del mes indicado:"));//validar

            } while (numeroMes < 1 || numeroMes > 30);

            //continuadatos
            String facturaProductosAutomotrices = JOptionPane.showInputDialog("La factura contiene productos automotrices(si/no): ");
            String facturaProductosElectricos = JOptionPane.showInputDialog("La factura contiene productos electricos(si/no): ");
            String facturaProductosConstruccion = JOptionPane.showInputDialog("La factura contiene productos de construccion(si/no): ");

            //setters
            facturaRealizada.setNombre(nombre);
            facturaRealizada.setID(IDCliente);
            facturaRealizada.setCodigo(codigo);
            facturaRealizada.setMonto(monto);
            facturaRealizada.setNumeroMes(numeroMes);
            facturaRealizada.setFacturaProductosAutomotrices(facturaProductosAutomotrices);
            facturaRealizada.setFacturaProductosConstruccion(facturaProductosConstruccion);
            facturaRealizada.setFacturaProductosElectricos(facturaProductosElectricos);

            //puntosyBonoExtra
            facturaRealizada.CalcBono();
            facturaRealizada.BonoExtra();

            //terminacion
            String seguir = JOptionPane.showInputDialog("Desea ingresar otro? (si/no)");

            if (seguir.equalsIgnoreCase("no")) {
                //mostrar datos
                JOptionPane.showMessageDialog(null, "El Agente Vendedor " + agente.getNombre() + " codigo: " + agente.getCodigo()
                        + " en el mes de Junio."
                        + "\nVendio un total de " + facturaRealizada.getMonto() + " en facturas."
                        + "\nObtuvo un total en comisiones de ..."
                        + "\nPuntos obtenidos por el vendedor: " + facturaRealizada.getPuntos()
                        + "\nEl agente vendedor " + agente.getVehiculo() + " cuenta con vehiculo propio"
                        + "\nSucursal: " + agente.getSucursalPerteneciente());
                //bonoextra
                if (facturaRealizada.getNumeroMes() == 1 || facturaRealizada.getMonto() > 300000) {
                    JOptionPane.showMessageDialog(null, "Felicidades lograste llegar al bono extra!");
                }

                break;
            }
        }

    }

}
