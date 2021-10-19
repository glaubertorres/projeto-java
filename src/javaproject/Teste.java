package javaproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		//collection medico
		Medico med = new Medico(null, null, null, null, null, null, 0, 0);
				
		//collection paciente
		Paciente pac = new Paciente(null, null, null, null, null, null, 0, 0);
		List<Paciente> pacList = new ArrayList<>();
		
		
		//variaveis
		String nome, sobrenome, documento, dataNascimento, email, telefone;
		int regiao, espec, ep = 1, op, newSearch = 0;

	System.out.println("\nInsira seus dados para realizar o cadastro e iniciar o programa!!");
	do 
	{
	//cadastro	
	System.out.println("\nNome: ");
	nome = scan.next();
	System.out.println("\nSobrenome: ");
	sobrenome = scan.next();
	System.out.println("\nData de nascimento (dd/mm/aaaa): ");
	dataNascimento = scan.next();
	System.out.println("\nEmail: ");
	email = scan.next();
	System.out.println("\nTelefone: ");
	telefone = scan.next();
	
	//valida documento(cpf ou crm)
	System.out.println("\nDocumento (CPF ou CRM): ");
	documento = scan.next();
		
		if(documento.length() == Medico.TAMANHO_CRM)
		{
			med.setNome(nome);
			med.setSobrenome(sobrenome);
			med.setDataNascimento(dataNascimento);
			med.setEmail(email);
			med.setTelefone(telefone);
			med.setDocumento(documento);
			System.out.println("\nBem vinde "+nome);
			System.out.println("\nA UNES é um sistema que conecta profissionais da saúde dedicades e\n"
					+ "preparades para oferecer atendimento médico gratuito e de qualidade \n"
					+ "para pessoas da comunidade LGBTQIA+");
			System.out.println("\nFicamos muito contentes com seu interesse em cadastrar-se em nosso sistema!!!");
			System.out.println("\nEscolha sua especialidade de atuação: ");
			
			med.menuEspecialidade();
			ep = scan.nextInt();
				while(ep < 1 || ep > 4)
				{
					System.err.println("\nOPÇÃO INVÁLIDA!!");
					System.out.println("Por favor, escolha novamente!");
					med.menuEspecialidade();
					System.out.println("\nEscolha a especialidade que deseja consultar: ");
					ep = scan.nextInt();
					med.setEspec(ep);
				}
				
				switch(ep)
				{
				//Escolha de Região
				case 1:
					med.menuRegiao();
					op = scan.nextInt();
					med.setRegiao(op);
					break;
				case 2:
					med.menuRegiao();
					op = scan.nextInt();
					med.setRegiao(op);
					break;
				case 3:
					med.menuRegiao();
					op = scan.nextInt();
					med.setRegiao(op);
					break;
				case 4:
					med.menuRegiao();
					op = scan.nextInt();
					med.setRegiao(op);
					break;
				}
						
				System.out.println("\nDeseja finalizar?");
				System.out.println("1- Sim\t\t\t2- Não");
				newSearch = scan.nextInt();
				
				//System.out.println(MedicList.getDataNascimento()+MedicList.getNome()+MedicList.getSobrenome()+MedicList.getRegiao());
		}
		List<Medico> medList = new ArrayList<>();
		medList.add(med);//LEMBRAR DE ADICIONAR NA COLEÇÃO APÓS O TERMINO DO CADASTRO
		Medico MedicList = (Medico) medList.get(0);
		
		if(documento.length() == Paciente.TAMANHO_CPF)
		{
			pac.setNome(nome);
			pac.setSobrenome(sobrenome);
			pac.setDataNascimento(dataNascimento);
			pac.setEmail(email);
			pac.setTelefone(telefone);
			pac.setDocumento(documento);
			System.out.println("\nBem vinde "+nome);
			System.out.println("\nA UNES é um sistema que conecta profissionais da saúde dedicades e\n"
					+ "preparades para oferecer atendimento médico gratuito e de qualidade \n"
					+ "para pessoas da comunidade LGBTQIA+");
			
			pac.menuEspecialidade();
			System.out.println("\nEscolha a especialidade que deseja consultar!");
			espec = scan.nextInt();
			pac.setEspec(espec);
			
			
			switch(ep)
			{
			//Escolha de Região
			case 1:
				pac.menuRegiao();
				op = scan.nextInt();
				pac.setRegiao(op);
				break;
			case 2:
				pac.menuRegiao();
				op = scan.nextInt();
				pac.setRegiao(op);
				break;
			case 3:
				pac.menuRegiao();
				op = scan.nextInt();
				pac.setRegiao(op);
				break;
			case 4:
				pac.menuRegiao();
				op = scan.nextInt();
				pac.setRegiao(op);
				break;
			}
			
			
			
		
			
			pacList.add(pac);
			Paciente PacientList = (Paciente) pacList.get(0);

			if(espec == MedicList.getEspec() && PacientList.getRegiao() == MedicList.getRegiao())
			{
				
				System.out.println("alguma coisalllllll");
			}
					
					
					
					
					
					
					
					
					
			
			System.out.println("\nDeseja consultar novamente?");
			System.out.println("1- Sim\t\t\t2- Não");
			newSearch = scan.nextInt();
		}
	
	}while(newSearch!=2);
	}
}
	
	

	


