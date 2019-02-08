package HangMan;

import java.util.ArrayList;

public class Game {
	public void start(Words words, Player player, Interface inFace, Rouls rouls) {
		// TODO Auto-generated method stub
		player.setUser(inFace.CreateUser());
		while (inFace.doYouWantStart()==1){
			words.getRandomWord();
			String playerKnows = player.getSizeOfWord(words.getSizeOfWord());
			String guess;
			while(!playerKnows.equals(words.getWord())&& rouls.LifesLeft()){
			do {
				guess = inFace.showPlayerWhatHeKnows(playerKnows);
			} while (guess.length() != 1);
			char c =guess.charAt(0);
			ArrayList <Integer> ar = words.checkLetter(c);
			player.UppdateWord(c, ar);
			playerKnows = player.getWord();
			if(rouls.lostLife(ar)&& rouls.howManeyLifesLeft()>0){
				inFace.wrongGues(rouls.howManeyLifesLeft());
			}
		}
			if (rouls.LifesLeft()){
				inFace.wonGame();;
			}else{
				inFace.lostGame();;
			}
			
		}
	}
}
