package model;

/**
 *
 * @author Gabriel Alessandro
 * @since 15/04/2018 - 23:14
 * @version 1.0 beta Finka
 */
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private int qtdPresencas;
    private int numTotalAulas;

    public Aluno() {
    }

    /**
     * 
     * @param nome recebe o nome do aluno
     * @param nota1 recebe a nota 1 do aluno
     * @param nota2 recebe a nota 2 do aluno
     * @param qtdPresencas recebe a quantidade de presenças do aluno
     * @param numTotalAulas recebe o número total de aulas dadas ao aluno
     */
    public Aluno(String nome, double nota1, double nota2, int qtdPresencas, int numTotalAulas) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.qtdPresencas = qtdPresencas;
        this.numTotalAulas = numTotalAulas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public int getQtdPresencas() {
        return qtdPresencas;
    }

    public void setQtdPresencas(int qtdPresencas) {
        this.qtdPresencas = qtdPresencas;
    }

    public int getNumTotalAulas() {
        return numTotalAulas;
    }

    public void setNumTotalAulas(int numTotalAulas) {
        this.numTotalAulas = numTotalAulas;
    }
    
    
    
    /**
     * 
     * @return calcula a média aritmética do aluno
     */
    public double calcularMediaAritimetica(){
        return (nota1 + nota2) / 2;
    }//fecha calcularMediaAritimetica
    
    /**
     * 
     * @return calcula a frequência do aluno
     */
    public double calcularFrequencia(){
        return (qtdPresencas * 100) / numTotalAulas;
    }//fecha calcularFrequencia
    
    
    /**
     * 
     * @return verifica se o aluno foi aprovado ou não
     */
    public String verificarAprovacao(){
        if(calcularMediaAritimetica() > 5 && calcularFrequencia() >= 75){
            return "Aluno Aprovado";
        }
        return "Aluno Reprovado";
    }

    @Override
    public String toString() {
        return "Nome: " + nome 
               +"\nNota1: " + nota1
               +"\nNota2: " + nota2 
               +"\nQuantidade de Presenças: " + qtdPresencas 
               +"\nNúmero total de aulas: " + numTotalAulas
               +"\nMédia Aritmética: " + calcularMediaAritimetica()
               +"\nFrequência: " + calcularFrequencia() + "%"
               +"\nResultado: " + verificarAprovacao();
    }
    
    
    
    
}
