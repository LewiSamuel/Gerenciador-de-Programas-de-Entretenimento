import java.util.*;

class Filme extends ProgramaEntretenimento{

    // Atributos privados
    private String produtora;
    private String patrocinadores;
    Scanner input = new Scanner(System.in);
	
    // GETTERS
    public String getprodutora(){
        return this.produtora;
    }
    public String getpatrocinadores(){
        return this.patrocinadores;
    }

    // SETTERS
    public void setprodutora(String produtora){
        this.produtora = produtora;
    }
    public void setpatrocinadores(String patrocinadores){
        this.patrocinadores = patrocinadores;
    }

    public void globalSet(int i){
        System.out.println("------------------------");
        System.out.println("( Filme "+(i+1)+" ) # Insira o Nome");
        super.setnome(input.nextLine());
        System.out.println("( Filme "+(i+1)+" ) # Insira a Categoria");
        super.setcategoria(input.nextLine());
        System.out.println("( Filme "+(i+1)+" ) # Insira os Personagens Principais");
        super.setpersonagensPrincipais(input.nextLine());
        System.out.println("( Filme "+(i+1)+" ) # Insira a Faixa Etaria");
        super.setfaixaEtaria(Integer.parseInt(input.nextLine()));
        System.out.println("( Filme "+(i+1)+" ) # Insira a Classificacao");
        super.setclassificacao(input.nextLine());
        System.out.println("( Filme "+(i+1)+" ) # Insira a nota da Classificacao");
        super.setnotaClassificacao(Double.parseDouble(input.nextLine()));
        System.out.println("( Filme "+(i+1)+" ) # Insira o duracao");
        super.setduracao(input.nextLine());
        
        System.out.println("( Filme "+(i+1)+" ) # Insira a Produtora");
        this.setprodutora(input.nextLine());
        System.out.println("( Filme "+(i+1)+" ) # Insira os Patrocinadores");
        this.setpatrocinadores(input.nextLine());
    }

    @Override
    public String toString(){
        String aux = super.toString();
        aux = aux + "Produtora: "+produtora+" \n";
        aux = aux + "Patrocinadores: "+patrocinadores+" \n";
        return aux;
    }

}