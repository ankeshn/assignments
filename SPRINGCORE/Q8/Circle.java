package springpractice;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Circle implements ApplicationContextAware,BeanNameAware {   
	Quadrilatreal quadrilatreal;
private ApplicationContext context = null;
	
	public void setQuadrilatreal(Quadrilatreal quadrilatreal) {
		this.quadrilatreal = quadrilatreal;
	}
											// by using getter and setter
public void getQuadrilatreal() {
	if(quadrilatreal == null) 
		System.out.println("Unable to draw");
		else 
			quadrilatreal.start();
}

@Override
public void setApplicationContext(ApplicationContext context) throws BeansException {
	System.out.println("Application context aware line");
	
}
@Override
public void setBeanName(String beanName) {
	System.out.println("The bean name is :" +beanName);
	
}

}