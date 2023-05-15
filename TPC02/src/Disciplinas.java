public class Disciplinas {
    private String titulo;
    private String nomeDocente;
    Lista alunos= new Lista();

    public Disciplinas(String titulo, String nomeDocente, Lista alunos) {
        this.titulo = titulo;
        this.nomeDocente = nomeDocente;
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeDocente() {
        return nomeDocente;
    }

    public void setNomeDocente(String nomeDocente) {
        this.nomeDocente = nomeDocente;
    }

    public Lista getAlunos() {
        return alunos;
    }

    public void setAlunos(Lista alunos) {
        this.alunos = alunos;
    }

    public void alunoMelhorNota(){
        int melhor=0;

        
    }


}
