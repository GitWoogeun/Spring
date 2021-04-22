package aop4_annotation.order;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*
 * AOP 
 * 2. annotation  이용
 */

// @Aspect , @Order(), 각 메소드 별 어노테이션
@Component
@Aspect
public class LoggingAdvice{

	@Around("execution(public * aop4_annotation.*.*.update(..))")
	public Object around(ProceedingJoinPoint point) throws Throwable
	{
		String methodName = point.getSignature().getName();
		System.out.println("[사전작업] : " +  methodName);
		// before : 메소드 호출 전execution(boolean aop4_annotation.order.MemberService.update(String))
		Object obj = point.proceed();
		// afterReturning : 메소드 호출 된 후에 예외 발생이 없는 경우 execution(boolean aop4_annotation.order.MemberService.update(String))
		System.out.println("[사후작업] : " +  methodName);
		return obj;
	}
}
