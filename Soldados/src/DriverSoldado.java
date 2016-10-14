
public class DriverSoldado {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soldado soldado = new Soldado();
		Militar militar = new Militar();
		Coronel coronel = new Coronel();
		General general = new General();
		Teniente teniente = new Teniente();
		System.out.println(soldado);
		System.out.println(militar);
		coronel.ejecutaOrdenManiobra();
		System.out.println(coronel.getSalario());
		System.out.println(general);
		System.out.println(general.getDiasVacaciones());
		teniente.tomaOrdenCoronel("Trotar");
		
		
		
		
				

	}

}
