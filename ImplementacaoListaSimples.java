package implementacaolistasimples;
import listadupla.*;
import listasimples.*;
import lista.*;


public class ImplementacaoListaSimples {

    public static void main(String[] args) {
       
        Lista ls = new ListaDupla();
        //ls.inserePrimeiroNo(15);
        //ls.insereFinalLista(12);
        //ls.insereInicioLista(60);
        //ls.insereInicioLista(61);
        //ls.insereInicioLista(62);
        //ls.insereInicioLista(63);
        //ls.insereInicioLista(64);
        
        //ls.insereMeioLista(100, 2);
        //ls.insereMeioLista(300, 2);
        
        
        ls.insere(15);
        ls.insere(12);
        ls.insere(60, 0);
        ls.insere(30, ls.tamanhoLista());
        ls.insere(99, 1);
        
        System.out.println(ls.tamanhoLista());
        System.out.println(ls.print());
        
        //ls.removeMeioLista(1);
        //ls.removeFinalElemento();
        //System.out.println(ls.print());
        
        
        
    }
    
}
