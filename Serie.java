import java.util.*;

class Serie extends ProgramaEntretenimento{
    
    // Atributos privados:
    private int numtemporadas;
    private int qntTemporada;
    private int qntEpisodioPorTemporada;
    Scanner input = new Scanner(System.in);

    public void setnumtemporadas(int numtemporadas){
        this.numtemporadas = numtemporadas;
    }
    public void setqntTemporada(int qntTemporada){
        this.qntTemporada = qntTemporada;
    }
    public void setqntEpisodioPorTemporada(int qntEpisodioPorTemporada){
        this.qntEpisodioPorTemporada = qntEpisodioPorTemporada;
    }

    public int getnumtemporadas(){
        return this.numtemporadas;
    }
    public int getqntTemporada(){
        return this.qntTemporada;
    }
    public int getqntEpisodioPorTemporada(){
        return this.qntEpisodioPorTemporada;
    }

    public void globalSet(int i){
        System.out.println("------------------------");
        System.out.println("( Serie "+(i+1)+" ) # Insira o Nome");
        super.setnome(input.nextLine());
        System.out.println("( Serie "+(i+1)+" ) # Insira a Categoria");
        super.setcategoria(input.nextLine());
        System.out.println("( Serie "+(i+1)+" ) # Insira os Personagens Principais");
        super.setpersonagensPrincipais(input.nextLine());
        System.out.println("( Serie "+(i+1)+" ) # Insira a Faixa Etaria");
        super.setfaixaEtaria(Integer.parseInt(input.nextLine()));
        System.out.println("( Serie "+(i+1)+" ) # Insira a Classificacao");
        super.setclassificacao(input.nextLine());
        System.out.println("( Serie "+(i+1)+" ) # Insira a nota da Classificacao");
        super.setnotaClassificacao(Double.parseDouble(input.nextLine()));
        System.out.println("( Serie "+(i+1)+" ) # Insira o duracao");
        super.setduracao(input.nextLine());
        System.out.println("( Serie "+(i+1)+" ) # Insira o numero de temporadas");
        this.setnumtemporadas(Integer.parseInt(input.nextLine()));
        System.out.println("( Serie "+(i+1)+" ) # Insira o quantidade de Temporadas");
        this.setqntTemporada(Integer.parseInt(input.nextLine()));
        System.out.println("( Serie "+(i+1)+" ) # Insira o quantidade de Episodio Por Temporada");
        this.setqntEpisodioPorTemporada(Integer.parseInt(input.nextLine()));
    }
    
    // Métodos
    @Override
    public String toString(){
        String aux = super.toString();
        aux = aux + "Num Temporadas: "+numtemporadas+" \n";
        aux = aux + "Qnt Temporada: "+qntTemporada+" \n";
        aux = aux + "Qnt Episodio Por Temporada: "+qntEpisodioPorTemporada+" \n";
        return aux;
    }

    // calculaTotalEpisodios(): retorna a quantidade total de episódios da serie.
    public int calculaTotalEpisodios(){
        return qntTemporada*qntEpisodioPorTemporada;
    }

}