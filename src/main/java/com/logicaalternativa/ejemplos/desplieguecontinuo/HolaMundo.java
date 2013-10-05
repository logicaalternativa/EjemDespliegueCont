package com.logicaalternativa.ejemplos.desplieguecontinuo;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "holaMundo", eager = true)
public class HolaMundo {
	
	public String getBienvenida(){ 
		
		return "Hola Mundo!";
		
	}

}
