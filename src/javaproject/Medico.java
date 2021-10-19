package javaproject;

public class Medico extends Cadastro{
	
	protected static final int TAMANHO_CRM=7;

	public Medico(String nome, String sobrenome, String documento, String dataNascimento, String email, String telefone,
			int regiao, int espec) {
		
		super(nome, sobrenome, documento, dataNascimento, email, telefone, regiao, espec);
	}

	@Override
	public void setDocumento(String documento) 
	{
		if (documento.length() != TAMANHO_CRM)
		{
			System.err.print("Documento Inválido!!!");
		} 
		
	}
	
	
	

}
