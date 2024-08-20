public class Produto {


    private String nome;
    private String preco;
    private int quantidade;
    private int estoque;
    private boolean disponibilidade;


    public Produto (String nome, String preco, int quantidade, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.estoque = estoque;
    }

  public int verificar_estoque(){
       return estoque;
  }

  public String ver_preco(){
        return preco;
  }

  public void disponibilidade(){

    }

}
