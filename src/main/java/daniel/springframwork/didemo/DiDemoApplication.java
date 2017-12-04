package daniel.springframwork.didemo;

import daniel.springframwork.didemo.controllers.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		HomeController controller = (HomeController) ctx.getBean("homeController");
		controller.hello();
	}
}
