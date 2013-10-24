/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

/**
 *
 * @author Mxabi
 */
public class Matriz {
    public int dim, tipo;
    public String id, cad;
    
    /*
     * 0 = tipo declaracion
     * 1 = obtener datos
     * esto es para que cuando se acceden a los datos no se utilizq la opcion [1..2] 
     * solo seria la [2,3]
     */

    /*
     * 0 = tipo declaracion
     * 1 = obtener datos
     * esto es para que cuando se acceden a los datos no se utilizq la opcion [1..2]
     * solo seria la [2,3]
     */
    public Matriz(int dim, int tipo, String id, String cad) {
        this.dim = dim;
        this.tipo = tipo;
        this.id = id;
        this.cad = cad;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }

    
    
    
    

   
    
}
