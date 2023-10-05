package heranca;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Isabely", "(11) 99874-5612");
		System.out.println("Pessoa:");
		System.out.println("Nome:" + pessoa.getNome());
		System.out.println("Telefone:" + pessoa.getTelefone());
		
		PessoaFisica pessoaF = new PessoaFisica("Cainan", "(15) 99123-4567", "123.456.789-10", "123.4567.8978-7");
		System.out.println("Nome:" + pessoaF.getNome());
		System.out.println("Telefone:" + pessoaF.getTelefone());
		System.out.println("CPF:" + pessoaF.getCpf());
		System.out.println("RG:" + pessoaF.getRg());
		
		PessoaJuridica pessoaJ = new PessoaJuridica("Empresa XJ", "(11) 99456-9812", "123.456.789/9001-23");
		System.out.println("Pessoa Jusidica:");
		System.out.println("Nome: " + pessoaJ.getNome());
		System.out.println("Telefone: " + pessoaJ.getTelefone());
		System.out.println("CNPJ: " + pessoaJ.getCnpj());
		
	}

}
