package main;

import eje1.AdapterMotor;
import eje1.Comun;
import eje1.Economico;
import eje1.Electrico;
import eje1.Motor;

public class Main1 {

	public static void main(String[] args) {
		Motor motorComun = new Comun();
		Motor motorEconomico = new Economico();
		Motor motorElectrico = new AdapterMotor(new Electrico());

		System.out.println("Motor Comun:");
		motorComun.arrancar();
		motorComun.acelerar();
		motorComun.apagar();
		
		System.out.println("\nMotor Economico:");
		motorEconomico.arrancar();
		motorEconomico.acelerar();
		motorEconomico.apagar();
		
		System.out.println("\nMotor Electrico:");
		motorElectrico.arrancar();
		motorElectrico.acelerar();
		motorElectrico.apagar();
	}

}
