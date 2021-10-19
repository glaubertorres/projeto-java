package javaproject;

public abstract class Cadastro {
			
	//atributos
	private String nome;
	private String sobrenome;
	private String documento;
	private String dataNascimento;
	private String email;
	private String telefone;
	private int regiao;
	private int espec;
	
	//construtor
	public Cadastro (String nome,String sobrenome, String documento, String dataNascimento, 
			String email, String telefone, int regiao, int espec)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.documento = documento;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.telefone = telefone;
		this.regiao = regiao;
		this.espec = espec;
	}
	
	//método abstrato
	abstract public void setDocumento(String documento); /*{
	if(documento == null || documento.isEmpty())
	{
		throw new RuntimeException("Preencha todos os campos!!!");
	}
	if (documento.length() < TAMANHO_CPF && documento.length() > TAMANHO_CRM)
	{
		throw new RuntimeException("Documento Inválido!!!");
	}
	
	this.documento = documento;
}*/
	
	//getter e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.isEmpty())
		{
			System.err.print("Preencha todos os campos!!!");
		}
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		if(sobrenome == null || sobrenome.isEmpty())
		{
			System.err.print("Preencha todos os campos!!!");
		}
		this.sobrenome = sobrenome;
	}

	public String getDocumento() {
		return documento;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email == null || email.isEmpty())
		{
			throw new RuntimeException("Preencha todos os campos!!!");
		}
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if(telefone == null || telefone.isEmpty())
		{
			throw new RuntimeException("Preencha todos os campos!!!");
		}
		this.telefone = telefone;
	}

	public int getRegiao() {
		return regiao;
	}

	public void setRegiao(int regiao) {
		this.regiao = regiao;
	}

	public int getEspec() {
		return espec;
	}

	public void setEspec(int espec) {
		this.espec = espec;
	}
	
	public void menuEspecialidade()
	{
		System.out.println("\n\n\t\tMenu de Especialidades");
		System.out.println("\n1- Clínico Geral");
		System.out.println("\n2- Ginecologista");
		System.out.println("\n3- Urologista");
		System.out.println("\n4- Cardiologista");
	}

	public void menuRegiao()
	{
		System.out.println("\n====        MENU DE REGIÕES       ====");
		System.out.println("\nEscolha a região onde mora: ");
		System.out.println("\n1- Centro");
		System.out.println("\n2- Zona Norte");
		System.out.println("\n3- Zona Sul");
		System.out.println("\n4- Zona Leste");
		System.out.println("\n5- Zona Oeste");
		System.out.println("\n6- Região Metropolitana");
	}
}
