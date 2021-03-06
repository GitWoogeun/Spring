package aop1_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAdvice {
	
	//aop : before
	public void before(JoinPoint point) throws Throwable {
		String methodName = point.getSignature().getName();
		System.out.println("[************* 사전작업] : " + methodName);
	}
	
	//aop : after
	public void after(JoinPoint point) throws Throwable{
		String methodName = point.getSignature().getName();
		System.out.println("[사후작업 : !!!!!!!!!!!]" + methodName);
	}
	
	//aop : around
	public Object around(ProceedingJoinPoint point) throws Throwable{
		String methodName = point.getSignature().getName();
		System.out.println("<사전작업>############# : " + methodName);
		Object obj = point.proceed();
		System.out.println("<사후작업>@@@@@@@@@@@@@ : " + methodName);
		return obj;
	}
}
