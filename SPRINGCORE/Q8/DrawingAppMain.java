package springpractice;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingAppMain {

	public static void main(String[] args) {
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
			context.registerShutdownHook();
					Triangle tri = context.getBean("tri",Triangle.class); 
					tri.draw();
					Circle cir = context.getBean("cir",Circle.class);
					cir.getQuadrilatreal();
					
					
			}

}
