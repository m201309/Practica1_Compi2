/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mxabi
 */
public class TSimbolos {
    public int ambiente, tipo, no_dim;
    public ArrayList <Dims> ldims;
    
    Map<String, TSimbolos> tabla;

    public TSimbolos() {
        this.tabla = new HashMap<String, TSimbolos>();
    }

    /*
     * 0 = ambiente global
     * 1 = ambiente local
     */
    public TSimbolos(int ambiente, int tipo, int no_dim) {
        this.ambiente = ambiente;
        this.tipo = tipo;
        this.no_dim = no_dim;
        this.ldims = new ArrayList<Dims>();        
    }
    
    public void nueva_dimension( String id, int inf, int sup){
        Dims nueva = new Dims(inf, sup);
        
        this.tabla.get(id).ldims.add(nueva);
    }
    
    public boolean agregar_val(String id, TSimbolos tab){
        
        Boolean res = this.tabla.containsKey(id);
        
        if (!res)
            this.tabla.put(id, tab);
        
        return !res;
    }
    
    public boolean referencia (String id, int val){
        TSimbolos tab = this.tabla.get(id);
        
        int total = tab.no_dim;
        
        if (total == val)
            return true;               
        else 
            return false;
        
    }
    
    public int getInf(String id, int dim){
        TSimbolos tab = this.tabla.get(id);
        
        //dim-1, ya que en el arrayList comienza en la posicion 0
        Dims dm = tab.ldims.get(dim-1);
        
        return dm.getInf();
        
    }
    
    public int getSup(String id, int dim){
        TSimbolos tab = this.tabla.get(id);
        Dims dm = tab.ldims.get(dim-1);
        
        return dm.getSup();
        
    }
    
    public boolean limite_valido (String id, int dim, int val){
        
        if (val >= getInf(id, dim) && val<= getSup(id, dim))
            return true;
        else 
            return false;
        
    }
    
    public int tamaño_dim (String id, int dim){
        return getSup(id, dim) - getInf(id, dim) + 1;
    }
    
    
    public void set_NoDim(String id, int dims){
        
        TSimbolos tab = this.tabla.get(id);
        tab.no_dim = dims;
    }
    
    public int tamaño_matriz (String id){
        TSimbolos tab = this.tabla.get(id);
        int tmn = 1;
        
        for (int i=1; i<=tab.no_dim; i++){
            tmn = tmn * tamaño_dim(id, i);
        }
        return tmn;
    }
    
    public int get_NoDim(String id){
        TSimbolos tab = this.tabla.get(id);
        return tab.no_dim;
    }
    
    
    
}
