package br.ulbra.classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Jeferson Assunto: Será implementado nesta classe o "banco de Dados" -
 * ArrayList
 */
public class BdAnimais {

    public List<Animal> bdAnimal;

    public BdAnimais() {
        bdAnimal = new ArrayList<Animal>();
    }

    public void adicionar(Animal p) {
        bdAnimal.add(p);
        JOptionPane.showMessageDialog(null, p.getNome() + ", foi salvo com Sucesso!");
    }
    public void excluir(int i){
        if(JOptionPane.showConfirmDialog(null,"Tem certeza que deseja excluir o(a) "
          +bdAnimal.get(i).getNome()
                +"?","Exclusão",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "O(A) "+bdAnimal.get(i).getNome()
                    +" foi excluido(a) com sucesso!");
            bdAnimal.remove(i);
        }else{
            JOptionPane.showMessageDialog(null, "Exclusão cancelada!!");
        }
    }
    public void alterar(int i, Animal p){
        bdAnimal.set(i, p);
        JOptionPane.showMessageDialog(null ,"Registro modificado com Sucesso!!");
    }
    public String Ordenar(){
          Collections.sort(bdAnimal);
          JOptionPane.showMessageDialog(null, "Ordenado com sucesso");
          String resultado = "nome(s)\n";
        if (!bdAnimal.isEmpty()) {
            for (int i = 0; i < bdAnimal.size(); i++) {
               // resultado = resultado + bdAgenda.get(i).getNome()+" "+bdAgenda.get(i).getSobre() + "\n";
                resultado = resultado + bdAnimal.get(i).toString() + "\n";
            }
        } else {
            JOptionPane.showMessageDialog(null, "Agenda Vazia!");
        }
        return resultado;
    
    }
    public String mostrar() {
      
        String resultado = "nome(s)\n";
        if (!bdAnimal.isEmpty()) {
            for (int i = 0; i < bdAnimal.size(); i++) {
               // resultado = resultado + bdAgenda.get(i).getNome()+" "+bdAgenda.get(i).getSobre() + "\n";
                resultado = resultado +(i+1)+" - "+bdAnimal.get(i).toString() + "\n";
            }
        } else {
            JOptionPane.showMessageDialog(null, "Agenda Vazia!");
        }
        return resultado;
    }
    public int encotrar(Animal p){
        int aux=-1;
        for (int i=0; i<bdAnimal.size();i++){
            if(bdAnimal.get(i).getNome().equals(p.getNome())){
                aux = i;
            }
        }
            return aux;
        }
    public Animal getAnimal(int i){
        return bdAnimal.get(i);
    }
}
