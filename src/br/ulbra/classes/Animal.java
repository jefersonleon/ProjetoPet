package br.ulbra.classes;

/**
 *
 * @author Jeferson
 */
public class Animal  implements Comparable<Animal>{
    private String nome;
    private String raca;
    private String sexo;
    private int ano;
    private String cor;
    private String tipo;

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", raca=" + raca + ", sexo=" + sexo + ", ano=" + ano + ", cor=" + cor + ", tipo=" + tipo + '}';
    }

    @Override
    public int compareTo(Animal p) {
         return this.getNome().compareTo(p.getNome());
    }
    
    
    
}
