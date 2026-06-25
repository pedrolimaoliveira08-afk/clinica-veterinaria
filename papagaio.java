public class papagaio extends animal {
    private String bico;
    private String pena;
    private String asa;

    public papagaio(String nome, String Especie, int Idade,String bico,String pena, String asa){
        super(Nome,ESpecie,Idade);
        this.bico= bico;
        this.pena= pena;
        this.asa= asa;
}
    @Override
    public void exibirinformacoens(){
        System.out.println(x:"====PAPAGAIO====");
        System.out.println("Nome:"+Nome);
        System.out.println("ESpecie:"+Especie);
        System.out.println("Idade "+Idade);
        System.out.println("bico:"+Bico);
        System.out.println("pena:"Pena);
        System.out.println("asa:"Asa);
    }