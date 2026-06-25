 public class animal{
    protected String nome;
    protected String Especie;
    protected int Idade;

    public animal(String nome,String especie, int Idade){
        this.Nome = nome;
        this.Especie = especie;
        this.Idade =Idade;
    }

    public void exibirinformacoens(){
        System.out.println("Idade" + nome)
        System.out.println("especie: "+Especie);
        System.out.println("Idade: "+Idade);   
    }
      
}