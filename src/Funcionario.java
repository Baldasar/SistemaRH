
public class Funcionario implements Empregado{

	private String codigo;
	private String nome;
	private double salario;
	private int tipoEmpregado;
	
	public Funcionario(String codigo, String nome, int tipoEmpregado) {
		this.codigo = codigo;
		this.nome = nome;
		this.tipoEmpregado = tipoEmpregado;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public int getTipoEmpregado() {
		return this.tipoEmpregado;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
