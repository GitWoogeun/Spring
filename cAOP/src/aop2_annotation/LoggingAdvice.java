package aop2_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component //메모리 할당
@Aspect    //관점지향 프로그래밍 (관점표시)
public class LoggingAdvice {
		
	@Around("execution(public * aop2_annotation.*.*Hello(..))")   //aop2_annotation안에 모든 클래스 안에 Hello로 끝나는 모든 메소드(인자값 무시) 찾는다.
	public Object around(ProceedingJoinPoint point) throws Throwable{
		String methodName = point.getSignature().getName();
		System.out.println("<사전작업>############# : " + methodName);
		Object obj = point.proceed();
		System.out.println("<사후작업>@@@@@@@@@@@@@ : " + methodName);
		return obj;
	}
}
