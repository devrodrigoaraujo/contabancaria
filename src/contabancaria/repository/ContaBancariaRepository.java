package contabancaria.repository;

import contabancaria.model.contabancaria;

public interface ContaBancariaRepository {

	// CRUD da Conta
	public void procurarPorNumero(int numero);

	public void listarTodas();

	public void cadastrar(contabancaria conta);

	public void atualizar(contabancaria conta);

	public void deletar(int numero);

	// Métodos Bancários
	public void sacar(int numero, float valor);

	public void depositar(int numero, float valor);

	public void transferir(int numeroOrigem, int numeroDestino, float valor);

}
