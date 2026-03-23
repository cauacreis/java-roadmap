package cauafelype.maratona.java.javacore.associacao.dominio;

public class ProfessorS {
        private String nome;
        private String especialidade;
        private SeminarioS[] seminario;



        public ProfessorS(String nome, String especialidade) {
            this.nome = nome;
            this.especialidade = especialidade;
        }
        public ProfessorS() {
        }

        public void imprime() {
            System.out.println("Nome: " + nome);
            System.out.println("Especialidade: " + especialidade);
            if(seminario!=null){
                for(int i = 0 ; i < seminario.length ; i++){
                    System.out.println("Seminario("+(i+1)+")"+this.seminario[i].getTitulo());
                }
            }
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public SeminarioS[] getSeminario() {
        return seminario;
    }

    public void setSeminario(SeminarioS[] seminario) {
        this.seminario = seminario;
    }
}
