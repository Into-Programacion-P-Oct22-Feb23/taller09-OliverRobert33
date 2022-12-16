/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", 
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        String cadena = " ";
        
        
        for (int i = 0; i < 7; i++) {
            
            if ((promedios[i] >=0) && (promedios[i]<=5.9)){
                promediosCualitativos[i] = "Regular";
            } 
            if ((promedios[i] >=6) && (promedios[i]<=9.9)){
                promediosCualitativos[i] = "Buena";
            } 
            if ((promedios[i] >=9) && (promedios[i]<=10)){
                promediosCualitativos[i] = "Sobresaliente";
            } 
        }
        
        for (int i = 0; i < 7; i++) { 
             cadena = String.format("%s promedio: %.2f, promedio cualitativo %s",estudiantes[i]
                                            ,promedios[i]
                                            ,promediosCualitativos[i]);
             System.out.println(cadena);
        }
       
    }
}
