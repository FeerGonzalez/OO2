package eje1y2;

public class ConsolaObserver implements Observer {

	@Override
	public void actualizar(String valor) {
		double temp = Double.parseDouble(valor);
		haceCalor(temp);
		haceFrio(temp);

	}

	private void haceCalor(double temp) {
		if (temp > 17) {
			System.out.println("Hace calor, se encenderá el aire acondicionado");
		}
	}

	private void haceFrio(double temp) {
		if (temp < 12) {
			System.out.println("Hace frio, se encendera la caldera");
		}
	}

}
