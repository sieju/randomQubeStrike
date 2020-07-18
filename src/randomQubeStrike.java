import org.w3c.dom.ls.LSOutput;

import java.util.Random;

import static java.lang.System.*;

public class randomQubeStrike {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Random r = new Random();
		int rand = r.nextInt(7);
		
		out.println("Program losuje...");
		Thread.sleep(3000);
		if (rand == 1) {
			out.print(" -------\n" +
					"|       |\n" +
					"|   o   |\n" +
					"|       |\n" +
					" -------");
		} else if (rand == 2) {
			out.print(" --------\n" +
					"|        |\n" +
					"|  o  o  |\n" +
					"|        |\n" +
					" --------");
		} else if (rand == 3) {
			out.print(" -------\n" +
					"| o     |\n" +
					"|   o   |\n" +
					"|     o |\n" +
					" -------");
		} else if (rand == 4) {
			out.print(" -------\n" +
					"|  o o  |\n" +
					"|       |\n" +
					"|  o o  |\n" +
					" -------");
		} else if (rand == 5) {
			out.print(" -------\n" +
					"| o   o |\n" +
					"|   o   |\n" +
					"| o   o |\n" +
					" -------");
		} else if (rand == 6) {
			out.print(" -------\n" +
					"|  o o  |\n" +
					"|  o o  |\n" +
					"|  o o  |\n" +
					" -------");
		}
		out.println("\n");
		out.format("Wylosowana liczba oczek: %d", rand);
	}
}
