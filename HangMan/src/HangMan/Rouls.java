package HangMan;

import java.util.ArrayList;

public class Rouls {
	private int lifesLeft = 8;
	public boolean lostLife(ArrayList<Integer> ar) {
		// TODO Auto-generated method stub
		if(ar.size()==0){
			lifesLeft--;
			return true;
		}
		return false;
	}
	public boolean LifesLeft() {
		// TODO Auto-generated method stub
		if(lifesLeft ==0)
		return false;
		return true;
	}
	public int howManeyLifesLeft() {
		// TODO Auto-generated method stub
		return lifesLeft;
	}

}
