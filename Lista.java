/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lista;

/**
 *
 * @author bruno
 */
public interface Lista {
    public boolean insere(double valor);
    public boolean insere(double valor, int pos);
    
    public boolean remove();
    public boolean remove(int pos);
    
    public double get();
    public double get(int pos);
    
    public String print();
    
    public boolean listaVazia();
    
    public int tamanhoLista();
    
}
