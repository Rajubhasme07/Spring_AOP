package Controll;

import java.lang.reflect.Method;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforAdv implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		
		
		
		 System.out.println("Hello Befor Logic"); 
		
		
	}

	
}
