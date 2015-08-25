import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class TabuleiroTestDrive{

	public static void main(String[] args) {

		Random random = new Random();
		BufferedReader br = null;
		Tabuleiro tabuleiro = new Tabuleiro();
		Cavalo cavalo1 = new Cavalo();
		Cavalo cavalo2 = new Cavalo();
		Cavalo cavalo3 = new Cavalo();

		tabuleiro.setBoard(5,3);

		cavalo1.setXY(random.nextInt(9)+3,random.nextInt(9)+3);
		tabuleiro.addCavalo(cavalo1);

		cavalo2.setXY(random.nextInt(9)+3,random.nextInt(9)+3);
		tabuleiro.addCavalo(cavalo2);

		cavalo3.setXY(random.nextInt(9)+3,random.nextInt(9)+3);
		tabuleiro.addCavalo(cavalo3);
		try{
			FileOutputStream arquivoSerial = new FileOutputStream("serializado.dat");
			ObjectOutputStream objetoSerial = new ObjectOutputStream(arquivoSerial);
			objetoSerial.writeObject(tabuleiro);
			objetoSerial.writeObject(cavalo1);
			objetoSerial.writeObject(cavalo2);
			objetoSerial.writeObject(cavalo3);
			objetoSerial.flush();
			objetoSerial.close();
			arquivoSerial.flush();
			arquivoSerial.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		try{
			FileInputStream arqLer = new FileInputStream("serializado.dat");
			ObjectInputStream objLer = new ObjectInputStream(arqLer);
			System.out.println(objLer.readObject());
			objLer.close();
			arqLer.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader("info.txt"));
			while((sCurrentLine = br.readLine()) != null){
				System.out.println(sCurrentLine);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try{
				if(br != null)br.close();
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}
}