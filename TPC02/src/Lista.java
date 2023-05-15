public class Lista {
    private No inicio;
    private No fim;

    public Lista(){
        this.inicio = null;
        this.fim = null;
    }

    private boolean vazia(){
       return (this.inicio==null || this.fim==null);
    }

    public void inserir(Alunos info){
        No novo= new No(info);
        if(vazia()){
            this.inicio=novo;
            this.fim=novo;
        }else{
            novo.setProx(inicio);
            this.inicio=novo;
        }
    }
    public void listar(){
        if(vazia()){
            System.out.println("Lista esta Vazia");
        }else{
            No atual = this.inicio;
            while (atual!=null){
                System.out.println(atual.getInfo());

                atual = atual.getProx();
            }
        }
    }
}
