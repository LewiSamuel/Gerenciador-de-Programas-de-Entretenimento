import java.util.*;

class Documentario extends ProgramaEntretenimento{
    
    // Atributos privados
    private String narrador;
    Scanner input = new Scanner(System.in);
    

    public void setnarrador(String narrador){
        this.narrador = narrador;
    }

    public String getnarrador(){
        return this.narrador;
    }

    public void globalSet(int i){
        System.out.println("------------------------");
        System.out.println("( Documentario "+(i+1)+" ) # Insira o Nome");
        super.setnome(input.nextLine());
        System.out.println("( Documentario "+(i+1)+" ) # Insira a Categoria");
        super.setcategoria(input.nextLine());
        System.out.println("( Documentario "+(i+1)+" ) # Insira os Personagens Principais");
        super.setpersonagensPrincipais(input.nextLine());
        System.out.println("( Documentario "+(i+1)+" ) # Insira a Faixa Etaria");
        super.setfaixaEtaria(Integer.parseInt(input.nextLine()));
        System.out.println("( Documentario "+(i+1)+" ) # Insira a Classificacao");
        super.setclassificacao(input.nextLine());
        System.out.println("( Documentario "+(i+1)+" ) # Insira a nota da Classificacao");
        super.setnotaClassificacao(Double.parseDouble(input.nextLine()));
        System.out.println("( Documentario "+(i+1)+" ) # Insira o duracao");
        super.setduracao(input.nextLine());
        
        System.out.println("( Documentario "+(i+1)+" ) # Insira a Narrador");
        this.setnarrador(input.nextLine());
    }

    // Métodos
    @Override
    public String toString(){
        return super.toString()+"Narrador: "+narrador+" \n";
    }

}