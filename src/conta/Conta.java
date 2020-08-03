/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Cris
 */
public class Conta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        // TODO code application logic here
        
        String Nombre = JOptionPane.showInputDialog("Por favor ingrese sus apellidos y nombres: ");             
        
        
        String Cargo = JOptionPane.showInputDialog("Por favor ingrese su cargo: ");             

        
        String sueldos = JOptionPane.showInputDialog("Por favor ingrese su sueldo: ");             
        
        double sueldo = Double.parseDouble(sueldos);
        
        
        String famis = JOptionPane.showInputDialog("Por favor ingrese : \n 1: si recibe asignacion familiar \n 2: no recibe asignacion familiar");             
        int fami = Integer.parseInt(famis);
        
        if (fami == 1) {
            double af = 93;
            double sum = (sueldo + af);
                       
            String aos = JOptionPane.showInputDialog("Por favor ingrese : \n 1: si eres AFP \n 2: si eres ONP");             
            int ao = Integer.parseInt(aos);
            
            if (ao == 1) {
                
                String ihs = JOptionPane.showInputDialog("Por favor ingrese : \n 1: si eres INTEGRA \n 2: si eres HABITAD");                  
                int ih = Integer.parseInt(ihs);
                
                if (ih == 1) {
                
                    double apo = (sum * 0.10);
                    double co = (sum * 0.0155);
                    double pdm = (sum * 0.0135);
                    
                    double sumapf = (apo + co + pdm);    
                    
                    double sumatotal = (sum - sumapf);   
                    
                    double salud = (sum * 0.09);
                    
                    JOptionPane.showMessageDialog(null, "NOMBRE: " + Nombre + "\n CARGO: " + Cargo + "\n SUELDO: " 
                            + sueldo + "\n ASIGNACION FAMILIAR: si " +  "\n TOTAL REMUNERACION BRUTA: " + sum + "\n APF: integra" + "\n APORTE OBLIGATORIO: " 
                            + apo + "\n COMISIÓN % SOBRE R.A.: " + co + "\n  PRIMA DE SEGURO: " + pdm + "\n TOTAL DESCUENTO: " + sumapf + 
                            "\n REMUNERACIÓN NETA:" + sumatotal + "\n SALUD: " + salud);
                    
                } else if (ih == 2){
                    
                    double apo = (sum * 0.10);
                    double co = (sum * 0.0147);
                    double pdm = (sum * 0.0135);
                    
                    double sumapf = (apo + co + pdm);    
                    
                    double sumatotal = (sum - sumapf);   
                    
                    double salud = (sum * 0.09);
                    
                    JOptionPane.showMessageDialog(null, "NOMBRE: " + Nombre + "\n CARGO: " + Cargo + "\n SUELDO: " 
                            + sueldo + "\n ASIGNACION FAMILIAR: si " +  "\n TOTAL REMUNERACION BRUTA: " + sum + "\n APF: habitad" + "\n APORTE OBLIGATORIO: " 
                            + apo + "\n COMISIÓN % SOBRE R.A.: " + co + "\n  PRIMA DE SEGURO: " + pdm + "\n TOTAL DESCUENTO: " + sumapf + 
                            "\n REMUNERACIÓN NETA: " + sumatotal + "\n SALUD: " + salud);
                    

                }
                
                
                
            } else if (ao == 2){
                            
                double onp = (sum * 0.13);
                    
                double sumatotal = (sum - onp);
                
                double salud = (sum * 0.09);
                
                JOptionPane.showMessageDialog(null, "NOMBRE: " + Nombre + "\n CARGO: " + Cargo + "\n SUELDO: " 
                            + sueldo + "\n ASIGNACION FAMILIAR: si " +  "\n TOTAL REMUNERACION BRUTA: " + sum + "\n ONP: " + onp +"\n TOTAL DESCUENTO: " + onp + 
                            "\n REMUNERACIÓN NETA: " + sumatotal + "\n SALUD: " + salud);
            }
            
        } else if (fami == 2) {
            
            String aos = JOptionPane.showInputDialog("Por favor ingrese : \n 1: si eres AFP \n 2: si eres ONP");             
            int ao = Integer.parseInt(aos);
            
            if (ao == 1) {
                
                String ihs = JOptionPane.showInputDialog("Por favor ingrese : \n 1: si eres INTEGRA \n 2: si eres HABITAD");                  
                int ih = Integer.parseInt(ihs);
                
                if (ih == 1) {
                
                    double apo = (sueldo * 0.10);
                    double co = (sueldo * 0.0155);
                    double pdm = (sueldo * 0.0135);
                    
                    double sumapf = (apo + co + pdm);    
                    
                    double sumatotal = (sueldo - sumapf);   
                    
                    double salud = (sueldo * 0.09);
                    
                    JOptionPane.showMessageDialog(null, "NOMBRE: " + Nombre + "\n CARGO: " + Cargo + "\n SUELDO: " 
                            + sueldo + "\n ASIGNACION FAMILIAR: no " +  "\n TOTAL REMUNERACION BRUTA: " + sueldo + "\n APF: habitad" + "\n APORTE OBLIGATORIO: " 
                            + apo + "\n COMISIÓN % SOBRE R.A.: " + co + "\n  PRIMA DE SEGURO: " + pdm + "\n TOTAL DESCUENTO: " + sumapf + 
                            "\n REMUNERACIÓN NETA: " + sumatotal + "\n SALUD: " + salud);
                    
                } else if (ih == 2){
                    
                    double apo = (sueldo * 0.10);
                    double co = (sueldo * 0.0147);
                    double pdm = (sueldo * 0.0135);
                    
                    double sumapf = (apo + co + pdm);    
                    
                    double sumatotal = (sueldo - sumapf);   
                    
                    double salud = (sueldo * 0.09);
                    
                    JOptionPane.showMessageDialog(null, "NOMBRE: " + Nombre + "\n CARGO: " + Cargo + "\n SUELDO: " 
                            + sueldo + "\n ASIGNACION FAMILIAR: no " +  "\n TOTAL REMUNERACION BRUTA: " + sueldo + "\n APF: habitad" + "\n APORTE OBLIGATORIO: " 
                            + apo + "\n COMISIÓN % SOBRE R.A.: " + co + "\n  PRIMA DE SEGURO: " + pdm + "\n TOTAL DESCUENTO: " + sumapf + 
                            "\n REMUNERACIÓN NETA: " + sumatotal + "\n SALUD: " + salud );
                    

                }
                
                
                
            } else if (ao == 2){
                            
                double onp = (sueldo * 0.13);
                    
                double sumatotal = (sueldo - onp);
                
                double salud = (sueldo * 0.09);
                
                JOptionPane.showMessageDialog(null, "NOMBRE: " + Nombre + "\n CARGO: " + Cargo + "\n SUELDO: " 
                            + sueldo + "\n ASIGNACION FAMILIAR: no " +  "\n TOTAL REMUNERACION BRUTA: " + sueldo + "\n ONP: " + onp +"\n TOTAL DESCUENTO: " + onp + 
                            "\n REMUNERACIÓN NETA: " + sumatotal + "\n SALUD: " + salud);
            }
        }
        
        
        
    }
    
}
