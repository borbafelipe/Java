
public class Disciplina {

    // status
    private String codigo;
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    private Estado status;

    public Disciplina(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        this.status = null;
    }

    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    private void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    private void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    private void setStatus(Estado estado) {
        this.status = status;
    }

    private String getCodigo() {
        return codigo;
    }

    private String getNome() {
        return nome;
    }

    private double getNota1() {
        return nota1;
    }

    private double getNota2() {
        return nota2;
    }

    private double getNota3() {
        return nota3;
    }

    private Estado getStatus() {
        return status;
    }

    private Estado calcularMedia(double nota1, double nota2, double nota3) {
        double media = this.media;
        media = nota1 + nota2 + nota3;
        if (media < 7) {
            setStatus(status.APROVADO);
        } else {
            setStatus(status.REPROVADO);
        }
        System.out.println("a media é : " + media);

        return status;

    }
}
