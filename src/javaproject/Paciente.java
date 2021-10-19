package javaproject;

public class Paciente extends Cadastro {
	
	protected static final int TAMANHO_CPF=11;

	public Paciente(String nome, String sobrenome, String documento, String dataNascimento, String email,
			String telefone, int regiao, int espec) {
		
		super(nome, sobrenome, documento, dataNascimento, email, telefone, regiao, espec);
	}

	@Override
	public void setDocumento(String documento) 
	{
		
		if(documento.length()<TAMANHO_CPF && documento.length()>7)
		{
			System.out.println("Documento inválido, por favor, digite novamente...");
		}

	}
	
}
