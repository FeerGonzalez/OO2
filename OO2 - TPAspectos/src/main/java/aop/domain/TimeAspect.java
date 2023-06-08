package main.java.aop.domain;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeAspect {

	@Around("@annotation(Time)")
	public Object measureTime(ProceedingJoinPoint point) throws Throwable {

		long comienzo = System.currentTimeMillis();

		var result = point.proceed();

		long finalizacion = System.currentTimeMillis();
		long tiempoTranscurrido = finalizacion - comienzo;

		System.out.println("Tiempo transcurrido: " + tiempoTranscurrido + "ms");

		return result;
	}

}
