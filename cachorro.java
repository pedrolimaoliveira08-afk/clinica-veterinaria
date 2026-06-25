public class cachorro extends animal {
    private String pelagem ;
    private int patas;

    public cachorro(String nome, String Especie, int Idade, String pelagem,int patas){
        super(Nome, Especie, Idade);
        this.Pelagem = Pelagem;
        this.Patas = Patas;
    }

    @Override
    public void exibirinformacoens(){
        System.out.println("====CACHORRO====")
        System.out.println("nome:"+nome)
        System.out.println("especie:"+especie);
        System.out.println("idade:"+idade);
        System.out.println("tipo de pelagem:"+pelagem);
        System.out.println("quantidade de patas:"+patas);
    }

}