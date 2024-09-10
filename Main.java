public class Main {

  public static void main(String[] args) {
    Guerreiro personagem = new Guerreiro("Gustavo", 80);

    System.out.println(personagem);

    Mago mago = new Mago("Denner",60);

    System.out.println(mago);

    Arqueiro arqueiro = new Arqueiro("João Gabriel",70);
    
    System.out.println(arqueiro);
  }


  /*
   * criar branch 
   *  git checkout -b nome-branch
   * 
   *  especificar o que vai ser enviado ao git
   *  git add <especificar-arquivo> / git add . 
   * 
   *  adicionar mensagem de commit
   *  git commit -m "Mensagem"
   * 
   *  enviar ao github
   *  git push origin nome-branch
   */

}
