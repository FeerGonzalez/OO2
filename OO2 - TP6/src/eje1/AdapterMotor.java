package eje1;

public class AdapterMotor extends Motor{
	private Electrico motor;
	
	public AdapterMotor(Electrico motor) {
		this.motor = motor;
	}
	
	public void arrancar() {
		this.motor.conectar();
		this.motor.activar();
	}
	
	public void acelerar() {
		this.motor.moverMasRapido();
	}
	
	public void apagar() {
		this.motor.detener();
		this.motor.desconectar();
	}
}
