package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
driveDirect(500,500);
sleep(1000);
driveDirect(0,0);
driveDirect(400,500);
sleep(6000);		
driveDirect(500,250);
sleep(1000);
driveDirect(500,500);
sleep(3000);
driveDirect(250,500);
sleep(3000);
driveDirect(125,500);
sleep(2000);
driveDirect(250,500);
sleep(2000);
driveDirect(500,500);
	}

	public void loop() {
	
	}
}
