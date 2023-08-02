package dk.sdu.mmmi.cbse.main;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//running maven fixed all import issues and Module config Issues....

public class Main {
	
	public static void main(String[] args) {


		//adding the Annottationconfig from spring, to control the game.
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ModuleConfig.class);

		for (String beanName : ctx.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}

		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle("Asteroids-Mikkel-Exam");
		config.setWindowSizeLimits(650,550,650,550);

		//using the annotationconfig ctx to start the new game
		new Lwjgl3Application(ctx.getBean(Game.class), config);
	}
	
}
