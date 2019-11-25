import java.util.*;

class Teste{


    // MOSTRAR MENU PRINCIPAL
    static int mostrarMenu(){
        int aux = -2;
        Scanner input = new Scanner(System.in);

        System.out.println("****************************************");
        System.out.println("***                                  ***");
        System.out.println("***          NETFLIX CONSOLE         ***");
        System.out.println("***                                  ***");
        System.out.println("*****************************************");
        System.out.println();
        System.out.println("Escolha uma opcao abaixo:");
        System.out.println("1 - Listar todas as Series");
        System.out.println("2 - Buscar Programa de entretenimento");
        System.out.println("3 - Cadastrar Serie");
        System.out.println("4 - Cadastrar Filme");
        System.out.println("5 - Cadastrar Documentario");
        System.out.println("0 - Sair");

        // VALIDAR OPCAO DADA
        do{
            aux = Integer.parseInt(input.nextLine());
            if(aux < -1 || aux > 5){
                System.out.println("Opcao invalida! Digite novamente:");
            }else{
                return aux;
            }
        }while(aux < -1 || aux > 5);
        return 0;
    }
 
     // MOSTRAR HEADER SECUNDARIO
    static void showHeader(String Title){
        System.out.println("=|==========================");
        System.out.println("=|");
        System.out.println("=|   "+Title);
        System.out.println("=|");
        System.out.println("=|==========================");
    }


    // * FUNCAO PARA LISTAR TODOS OS REGISTROS
    // * QUANDO O CAMPO "PESQUISA" NAO FOR NULO VAI FILTRAR
    // TODOS OS REGISTROS PELO O TERMO DIGITADO NA PESQUISA
    static void ListAll(Serie[] SeriesArray, Filme[] FilmesArray, Documentario[] DocumentariosArray, String Pesquisa){
        System.out.println("-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-");
        System.out.println("");
        System.out.println(" LISTAGEM DE SERIES ");
        System.out.println("");
        for(int i=0; i<SeriesArray.length; i++){
            if(SeriesArray[i] != null)
            if(Pesquisa.equals(SeriesArray[i].getnome()) || Pesquisa.equals(""))
                System.out.println(SeriesArray[i].toString());
        }

        System.out.println("-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-");
        System.out.println("");
        System.out.println(" LISTAGEM DE FILMES ");
        System.out.println("");
        for(int i=0; i<FilmesArray.length; i++){
            if(FilmesArray[i] != null)
            if(Pesquisa.equals(FilmesArray[i].getnome()) || Pesquisa.equals(""))
            System.out.println(FilmesArray[i].toString());
        }

        System.out.println("-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-");
        System.out.println("");
        System.out.println(" LISTAGEM DE DOCUMENTARIOS ");
        System.out.println("");
        for(int i=0; i<DocumentariosArray.length; i++){
            if(DocumentariosArray[i] != null)
            if(Pesquisa.equals(DocumentariosArray[i].getnome()) || Pesquisa.equals(""))
            System.out.println(DocumentariosArray[i].toString());
        }
    }

 


    public static void main(String[] args){
        // Construa uma classe chamada Teste, para testar o programa desenvolvido. Peça ao
        // usuário para informar os dados de pelo menos 2 filmes, 2 séries e 2 documentários. A
        // entrada dos dados deve ser feita utilizando o JOptionPane ou a classe Scanner.


        Serie[] SeriesArray = new Serie[50];
        Filme[] FilmesArray = new Filme[50];
        Documentario[] DocumentariosArray = new Documentario[50];
        Scanner input = new Scanner(System.in);
        String PesquisaString = null;
        int ControlVar = -2;
        int proximoIndice = 0;


    
        // Ler 2 Series
        showHeader("CADASTRE 2 SERIES");
        for(int i=0; i<2; i++){
            SeriesArray[i] = new Serie();
            SeriesArray[i].globalSet(i);
        }
        
        // Ler 2 Filmes
        showHeader("CADASTRE 2 Filmes");
        for(int i=0; i<2; i++){
            FilmesArray[i] = new Filme();
            FilmesArray[i].globalSet(i);
        }

        // Ler 2 Documentarios
        showHeader("CADASTRE 2 Documentarios");
        for(int i=0; i<2; i++){
            DocumentariosArray[i] = new Documentario();
            DocumentariosArray[i].globalSet(i);
        }


        // -----------------------------
        //
        // ESCOPO DE EXECUCAO DO PROGRAMA
        //
        // -----------------------------
        while(ControlVar != 0){
            ControlVar = mostrarMenu();
            
            if(ControlVar == 1){
                // 1 - Listar todas os Programas
                ListAll(SeriesArray, FilmesArray, DocumentariosArray, "");


            }else if(ControlVar == 2){
                // 2 - Buscar Programa de entretenimento
                showHeader("Digite sua pesquisa");
                PesquisaString = input.nextLine();
                ListAll(SeriesArray, FilmesArray, DocumentariosArray, PesquisaString);


            }else if(ControlVar == 3){
                 // 3 - Cadastrar Serie
                proximoIndice = 1;
                for(int i=0; i<SeriesArray.length; i++){
                    if(SeriesArray[i] != null)
                    proximoIndice++;
                }
                showHeader("CADASTRE a Serie");
                SeriesArray[proximoIndice] = new Serie();
                SeriesArray[proximoIndice].globalSet(proximoIndice);

                
            }else if(ControlVar == 4){
                // 4 - Cadastrar Filme
                proximoIndice = 1;
                for(int i=0; i<FilmesArray.length; i++){
                    if(FilmesArray[i] != null)
                    proximoIndice++;
                }
                showHeader("CADASTRE o Filme");
                FilmesArray[proximoIndice] = new Filme();
                FilmesArray[proximoIndice].globalSet(proximoIndice);


            }else if(ControlVar == 5){
                // 5 - Cadastrar Documentario
                proximoIndice = 1;
                for(int i=0; i<DocumentariosArray.length; i++){
                    if(DocumentariosArray[i] != null)
                    proximoIndice++;
                }
                showHeader("CADASTRE o Documentario");
                DocumentariosArray[proximoIndice] = new Documentario();
                DocumentariosArray[proximoIndice].globalSet(proximoIndice);


            }
        }
    }
}