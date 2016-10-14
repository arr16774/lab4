
public class Soldado extends Militar{
	public double getSalario(){
		return super.getSalario()-10000;
	}
	
	public int getHoras(){
		return super.getHoras()*2;
	}
	
	public int getVacaciones(){
		return super.getDiasVacaciones()/2;
	}
	
	public String recibirOrden(){
		return "Ordene mi General";
	}
	public String toString(){
		return getSalario() +" "+ getHoras()+" "+ getVacaciones()+" "+ recibirOrden();
	}
}
