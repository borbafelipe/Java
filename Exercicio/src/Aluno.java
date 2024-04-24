public class Aluno {

    // status
    private String nome;
    private String matricula;
    private String[] disciplinas;
    private double CRE;

    // constructor
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = nome;
    }
    // behaviour

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    private void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    private void setCre(double result) {
        this.CRE = result;
    }

    private String getNome() {
        return nome;
    }

    private String getMatricula() {
        return matricula;
    }

    private String[] getDisciplinas() {
        return disciplinas;
    }

    private double getCRE() {
        return CRE;
    }

    private double CalcularCRE() {
        if (disciplinas == null || disciplinas.length == 0) {
            return 0.0;
        }
        double somaNotas;
        double numDisciplinas;
  
    }
    
}
