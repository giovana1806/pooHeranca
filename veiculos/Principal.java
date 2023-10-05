package veiculos;

public class Principal {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo("Chevrolet", "Camaro", 2013, "Amarelo");
		System.out.println("VEICULO:");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Ano: " + veiculo.getAno());
		System.out.println("Cor: " + veiculo.getCor());
		
		Automovel automovel = new Automovel("Chevrolet", "Camaro", 2013, "Amarelo", 4, "motor");
		System.out.println("AUTOMOVEL:");
		System.out.println("Marca: " + automovel.getMarca());
		System.out.println("Modelo: " + automovel.getModelo());
		System.out.println("Ano: " + automovel.getAno());
		System.out.println("Cor: " + automovel.getCor());
		System.out.println("Motor: " + automovel.getMotor());
		System.out.println("Marca: " + automovel.getNumeroPortas());
		
		Moto moto = new Moto("Yamaha", "Fazer", 2015, "Branca", 250);
		System.out.println("MOTO:");
		System.out.println("Marca: " + moto.getMarca());
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Ano: " + moto.getAno());
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Cilindradas: " + moto.getCilindradas());
	}

}
