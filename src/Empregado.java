
public interface Empregado {

	public static final int BALCONISTA = 1;
	public static final int GERENTE = 2;
	public static final int VENDEDOR = 3;
	
	public String getCodigo();
	public String getNome();
	public double getSalario();
	public int getTipoEmpregado();
	public void setSalario(double salario);
}
