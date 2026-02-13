package cauafelype.maratona.java.javacore.introducaoclasse.dominio;

public class AlunoAcademiaClasse {
    private String nome;
    private int idade;
    private double peso;
    private double alturaEmMetros;
    private int frequenciaAtividade;
    private String sexo;
    private int objetivo;
    private double imc;
    private double taxaMetabolicaTMB;
    private double gastoTotal;
    private double caloriasObjetivo;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setAlturaEmMetros(double alturaEmMetros){
        this.alturaEmMetros = alturaEmMetros;
    }
    public void setFrequenciaAtividade(int frequenciaAtividade){
        this.frequenciaAtividade = frequenciaAtividade;
    }
    public void setObjetivo(int objetivo){
        this.objetivo = objetivo;
    }
    public void setImc(double imc){
        this.imc = imc;
    }
    public void setTaxaMetabolicaTMB(double taxaMetabolicaTMB){
        this.taxaMetabolicaTMB = taxaMetabolicaTMB;
    }
    public void setGastoTotal(double gastoTotal){
        this.gastoTotal = gastoTotal;
    }
    public void setCaloriasObjetivo(double caloriasObjetivo){
        this.caloriasObjetivo = caloriasObjetivo;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getSexo(){
        return this.sexo;
    }
    public int getFrequenciaAtividade(){
        return this.frequenciaAtividade;
    }
    public double getPeso(){
        return this.peso;
    }
    public double getAlturaEmMetros(){
        return this.alturaEmMetros;
    }
    public double getGastoTotal(){
        return this.gastoTotal;
    }
    public double getTaxaMetabolicaTMB(){
        return this.taxaMetabolicaTMB;
    }
    public double getCaloriasObjetivo(){
        return this.caloriasObjetivo;
    }
    public double getImc(){
        return this.imc;
    }
    public int getObjetivo(){
        return this.objetivo;
    }
}

