package com.learnspring.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.learnspringframework.game.GameRunner;
import com.learnspring.learnspringframework.game.GamingConsole;
import com.learnspring.learnspringframework.game.MarioGame;
import com.learnspring.learnspringframework.game.PacmanGame;
import com.learnspring.learnspringframework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
		
	}

}
