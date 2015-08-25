import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
import java.util.Random;

class TabuleiroTestDrive{
	Frame frame = new JFrame("Prova");
	Tabuleiro tabuleiro;
	public static void main(String[] args) {

		Random random = new Random();

		tabuleiro = new Tabuleiro();

		Cavalo cavalo1 = new Cavalo();
		Cavalo cavalo2 = new Cavalo();
		Cavalo cavalo3 = new Cavalo();

		cavalo1.setXY(random.nextInt(9)+3,random.nextInt(9)+3);
		cavalo2.setXY(random.nextInt(9)+3,random.nextInt(9)+3);
		cavalo3.setXY(random.nextInt(9)+3,random.nextInt(9)+3);

	}
}