package 
com.curso.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersona {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");

		Persona persona = context.getBean("miPersona", Persona.class);
		persona.verInformacion();
		context.close();
		
	}
}
