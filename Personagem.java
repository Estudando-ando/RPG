public abstract class Personagem {

  private String nome;
  private int vida;
  private int nivel;
  private int exp;

  //construtor
  public Personagem(String nome, int vida){
    this.nome = nome;
    this.vida = vida;
    this.nivel = 1;
    this.exp = 0;
  }


  public String getNome() {
    return this.nome;
  }

  public int getVida() {
    return vida;
  }

  public void setVida(int vida) {
    this.vida = vida;
  }

  public int getNivel() {
    return nivel;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }

  public int getExp() {
    return exp;
  }

  public void setExp(int exp) {
    this.exp = exp;
  }

  @Override
  public String toString() {
    return "Personagem [nome=" + nome + ", vida=" + vida + ", nivel=" + nivel + ", exp=" + exp + "]";
  }
}
