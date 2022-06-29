import java.util.Arrays;
import java.util.List;

public class FolhaPagamento implements Folha{

	private ControlePessoal ControlePessoal;
	
	public FolhaPagamento(ControlePessoal ControlePessoal) {
		this.ControlePessoal = ControlePessoal;
	}
	
	public void adicionarSalarioInicialFuncionarios(double salarioBase) {
		Empregado[] empregados = ControlePessoal.getListaEmpregados();
		 List<Empregado> listaEmpregados = Arrays.asList(empregados);
		 
		 listaEmpregados.forEach(e -> {
			 if(e.getTipoEmpregado() == 1 ) {
				 e.setSalario(salarioBase * 1.25);
			 } else if (e.getTipoEmpregado() == 2) {
				 e.setSalario(salarioBase * 1.45);
			 } else if (e.getTipoEmpregado() == 3) {
				 e.setSalario(salarioBase * 1.35);
			 }
		 });
	}
	
	public void aplicarAumentoEmpregados(double percentual) {
		Empregado[] empregados = ControlePessoal.getListaEmpregados();
		 List<Empregado> listaEmpregados = Arrays.asList(empregados);
		 listaEmpregados.forEach(e -> {
			 double sal =  e.getSalario();
			 e.setSalario(sal + sal * (percentual/100));
		 } );
	}
}
