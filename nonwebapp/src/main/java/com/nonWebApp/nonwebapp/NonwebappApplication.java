package com.nonWebApp.nonwebapp;

import com.nonWebApp.nonwebapp.impl.BelsoEgesuMotor;
import com.nonWebApp.nonwebapp.impl.WheelImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class NonwebappApplication implements CommandLineRunner {
	/*
	TODO:
	HF: letsztelni az autót
	 */
	public static void main(String[] args) {
		SpringApplication.run(NonwebappApplication.class, args);
	}

	private static Wheel[] getKerekek(){
		Wheel[] kerekek = new Wheel[4];
		for (int i = 0; i<4; i++){
			kerekek[i] = new WheelImpl(205, 15, 65);
		}
		return kerekek;
	}

	@Override
	public void run(String... args) throws Exception {
		Motor motor = new BelsoEgesuMotor(100, 1600);
		Car autoAstra = new Car(getKerekek(), motor, "Opel Astra");
		System.out.println(autoAstra);
	}
}
