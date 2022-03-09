package 
com.curso.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersona {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");

		// Obtener bean miDireccion
	    Direccion direccion = context.getBean("miDireccion", Direccion.class);
	    
	    direccion.setNumeroCasa(100);	    
	    System.out.println(direccion.toString());
	    
	    
		Persona persona = context.getBean("miPersona", Persona.class);
		persona.verInformacion();
		context.close();
		
	}
}
