package cauafelype.maratona.java.javacore.heranca.dominio;

public class Carro {
    private String modelo;
    private String placa;
    private int ano;
    private String tipo;
    private String concenssionaria;

    public Carro(String modelo, String placa, int ano, String tipo) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.tipo = tipo;
    }

    public Carro() {
    }

    public void imprime() {
        System.out.println("Este é o modelo do carro: "+this.modelo);
        System.out.println("Esta é a placa do carro: "+this.placa);
        System.out.println("Este é o ano do carro: "+this.ano);
        System.out.println("Este é o tipo do carro: "+this.tipo);
        if (this.concenssionaria != null) {
            System.out.println("Esta é a concenssionaria do carro: "+this.concenssionaria);
        } else {
            System.out.println("Este carro não possui em nenhuma concessionária registrada!");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConcenssionaria() {
        return concenssionaria;
    }

    public void setConcenssionaria(String concenssionaria) {
        this.concenssionaria = concenssionaria;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
