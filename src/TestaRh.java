
public class TestaRh{

	public static void main(String args[]){

        Empregado lucas = new Funcionario("1515", "Lucas", Empregado.GERENTE);
        Empregado bruno = new Funcionario("1313", "Bruno", Empregado.VENDEDOR);
        Empregado joao = new Funcionario("1212", "Joao", Empregado.BALCONISTA);
        
        ControlePessoal rh = new RecursosHumanos();

        rh.contratar(lucas);
        rh.contratar(bruno);
        rh.contratar(joao);
        
        Folha folhaPgto = new FolhaPagamento(rh);
        
        folhaPgto.adicionarSalarioInicialFuncionarios(1000.00);
        
        rh.imprimirListaFuncionarios();
        
        folhaPgto.aplicarAumentoEmpregados(15.00);
        
        rh.imprimirListaFuncionarios();
        
        rh.demitir(joao);
        
        rh.imprimirListaFuncionarios();
	}
}
