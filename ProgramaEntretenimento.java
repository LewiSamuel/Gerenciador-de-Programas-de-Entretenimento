class ProgramaEntretenimento{
	

	// ATRIBUTOS PRIVADOS
	public String nome;
	private String categoria;
	private String personagensPrincipais;
	private int  faixaEtaria;
	private String classificacao;
	private double notaClassificacao;
	private String duracao;



	// GETTERS
	public String getnome(){
		return this.nome;
	}
	public String getcategoria(){
		return this.categoria;
	}
	public String getpersonagensPrincipais(){
		return this.personagensPrincipais;
	}
	public int getfaixaEtaria(){
		return this.faixaEtaria;
	}
	public String getclassificacao(){
		return this.classificacao;
	}
	public Double getnotaClassificacao(){
		return this.notaClassificacao;
	}
	public String getduracao(){
		return this.duracao;
	}




	// SETTERS
	public void setnome(String nome){
		this.nome = nome;
	}
	public void setcategoria(String categoria){
		this.categoria = categoria;
	}
	public void setpersonagensPrincipais(String personagensPrincipais){
		this.personagensPrincipais = personagensPrincipais;
	}
	public void setfaixaEtaria(int faixaEtaria){
		this.faixaEtaria = faixaEtaria;
	}
	public void setclassificacao(String classificacao){
		this.classificacao = classificacao;
	}
	public void setnotaClassificacao(double notaClassificacao){
		this.notaClassificacao = notaClassificacao;
	}
	public void setduracao(String duracao){
		this.duracao = duracao;
	}


	// METODOS

	// classificarPrograma(): retorna Ruim, caso a nota de classificação do
	// programa for menor ou igual a 4, Bom caso for maior que 4 e menor que 8 e
	// Otimo se for maior ou igual a 8;
	public String classificarPrograma(){
		if(this.notaClassificacao <= 4){
			return "Ruim";
		}else if(this.notaClassificacao < 8){
			return "Bom";
		}else{
			return "Otimo";
		}
	}



	// toString()
	public String toString(){
		String aux = "------------------------------------ \n";
		aux = aux + "Nome: "+this.nome+" \n";
		aux = aux + "Categoria: "+this.categoria+" \n";
		aux = aux + "Personagens Principais: "+this.personagensPrincipais+" \n";
		aux = aux + "Faixa Etaria: "+this.faixaEtaria+" \n";
		aux = aux + "Classificacao: "+this.classificacao+" \n";
		aux = aux + "Nota Classificacao: "+this.notaClassificacao+" \n";
		aux = aux + "Duracao: "+this.duracao+" \n";
		return aux;
	}


}