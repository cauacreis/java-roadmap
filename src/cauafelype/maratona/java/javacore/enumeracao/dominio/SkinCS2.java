package cauafelype.maratona.java.javacore.enumeracao.dominio;

public class SkinCS2 {
    private double precoBase;
    private String nome;
    protected Raridade raridades;

    public SkinCS2(double precoBase, String nome, Raridade raridades) {
        this.precoBase = precoBase;
        this.nome = nome;
        this.raridades = raridades;
    }

    public double calcularPrecoSkin(){
        double precoRaridade;
        precoRaridade = precoBase*this.raridades.getMultiplicadorDePreco();
        System.out.println("Preco base: "+precoBase);
        System.out.println("Preco baseado na raridade: " + precoRaridade);
        return precoRaridade;
    }

    @Override
    public String toString() {
        return "SkinCS2 {" +
                "nome='" + nome + '\'' +
                ", raridade=" + raridades +
                ", precoBase=" + precoBase +
                ", precoDeMercado=" + calcularPrecoSkin() +
                '}';
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Raridade getRaridades() {
        return raridades;
    }

    public void setRaridades(Raridade raridades) {
        this.raridades = raridades;
    }
}
