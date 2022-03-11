package com.curso.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ProfesionPoliciaImpl  implements Profesion, InitializingBean, DisposableBean{

	
	public ProfesionPoliciaImpl() {}
	  public void tipo() {
		System.out.println("Profesion: Policia");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		 System.out.println("Inicialización mediante  InitializingBean");
		
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		 System.out.println("Bean destruido DisposableBean");
		
	}
	
}
