import java.util.*;
import java.io.Serializable;
import java.awt.*;

class Tabuleiro implements Serializable{
	int boardMaxX;
	int boardMaxY;
	ArrayList<Cavalo> cavalos = new ArrayList<Cavalo>();
	
	public void setBoard(int x, int y){
		boardMaxX = x;
		boardMaxY = y;
	}

	public void addCavalo(Cavalo cavalo)
	{
		cavalos.add(cavalo);
	}

}