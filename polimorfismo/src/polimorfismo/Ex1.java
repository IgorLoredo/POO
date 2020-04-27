package polimorfismo;

/*
 * Crie uma agenda de contatos. Nessa agenda, contatos podem ser adicionados, removidos, ou pesquisados por nome ou por CPF/CNPJ.
 *  Deve ser poss�vel, tamb�m, visualizar todos os contatos da agenda.Dois tipos de contatos podem fazer parte da agenda: pessoa f�sica e 
 *  pessoa jur�dica. A pessao f�sica tem os seguintes atributos: CPF, nome, endere�o, data de nascimento, email, estado civil, 
 *  outros quevoc� achar necess�rios.
 *  A pessoa jur�dica possui: CNPJ, nome, endere�o, email, inscri��o estadual, raz�o social, outros que voc� achar necess�rios.
 * */

public class Ex1 {
	public String Nome;
	public String Endereco;
	public String Email;
	
}


public class Pessoa extends Ex1{
	public int Cpf;
	public int DataNascimento;
	public String EstadoCivil;
	
}


public class Empresa extends Ex1{
	public int Cnpj;
	public int InscricaoEstadual;
	public int RazaoSocial;
		
}

