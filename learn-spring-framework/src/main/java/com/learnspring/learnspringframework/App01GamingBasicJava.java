package com.learnspring.learnspringframework;

import com.learnspring.learnspringframework.game.GameRunner;
import com.learnspring.learnspringframework.game.MarioGame;
import com.learnspring.learnspringframework.game.PacmanGame;
import com.learnspring.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
				
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
