/**
 * File: CS106A_99BottlesOfBeer.java
 * ----------------------------
 * This Java program sings the song "99 bottles of beer on the wall"
 * after asking the user how many bottles of beer they'd like to 
 * start with.
 */

import acm.program.*;

public class CS106A_KnickKnackPaddyWhack extends ConsoleProgram
{	
	private static final int STARTING_NUMBER = 1;
	
	public void run()
	{ 
		introduceApp();
		singSong();
	}
	
	
	private void introduceApp()
	{
		println("This Java program sings 'This old man'.");
		println("");
	}
	
	
	private void singSong()
	{
		String rhymer;
		for (int i = STARTING_NUMBER; i <= 10; i++) {
			switch (i) {
			case 1: rhymer = "thumb"; break;
			case 2: rhymer = "shoe"; break;
			case 3: rhymer = "knee"; break;
			case 4: rhymer = "door"; break;
			case 5: rhymer = "hive"; break;
			case 6: rhymer = "sticks"; break;
			case 7: rhymer = "heaven"; break;
			case 8: rhymer = "plate"; break;
			case 9: rhymer = "spine"; break;
			case 10: rhymer = "shin"; break;
			default: rhymer = "(gasp)"; break;
			}
			
			println("This old man, he played " + i + ".");
			println("He played knick-knack on my " + rhymer + ".");
			println("Knick-knack, paddy-whack,");
			println("Give a dog a bone.");
			println("This old man came running home.");
			println("");
		}
	}
}