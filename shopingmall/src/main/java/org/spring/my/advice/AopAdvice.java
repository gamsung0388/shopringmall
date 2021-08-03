package org.spring.my.advice;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//aop구현
@Component //spring이 자동객체 생성
@Aspect
public class AopAdvice {
	//..을 실행 하기전에 찍어줌
	//언제 + 누구에게 + 무엇을
	//표현식 : 반환형 / 클래스명 /메소드명/매개변수
	@Before("execution(* org.spring.my.controller.*.*(..))")//pointcut
	public void beforestartLogService(JoinPoint jp) {
		System.out.println("---------------매개변수--------------------");
		System.out.println(jp.getSignature().toLongString());
		System.out.println("매개변수:"+ Arrays.toString(jp.getArgs()));
		System.out.println("-------------------------------------------");
	}
	//정상수행한 후 리턴값
	@AfterReturning(pointcut = "execution(* org.spring.my.service.*.*(..))",returning = "rObj")
	public void afterstartLogService(JoinPoint jp,Object rObj) {
		if(rObj != null) {
			System.out.println("-----------------리턴값------------------");
			System.out.println(jp.getSignature().toLongString());
			System.out.println("리턴값"+rObj.toString());
			System.out.println("-----------------------------------------");
		}
	}
//	//예외가 발생
//	@AfterThrowing(pointcut = "execution(* org.spring.my.dao.*.*(..))",throwing = "eObj")
//	public void excetptionLog(JoinPoint jp, Exception eObj) {
//		System.out.println("----------------예외발생-------------------");
//		System.out.println(jp.getSignature().toLongString());
//		System.out.println("예외발생:"+eObj.toString());
//		System.out.println("-------------------------------------------");
//	}
	
//	//모듈의 소유시간 체크
//	@Around("execution(* org.spring.my.service.FileServiceImpl.*(..))")
//	public Object timeLog(ProceedingJoinPoint pjp) throws Throwable {
//		System.out.println("------------------소요시간-----------------");
//		System.out.println(pjp.getSignature().toLongString());
//		//시작시간
//		long startTime = System.currentTimeMillis();
//		Object result = pjp.proceed(); //실제실행해야할 메소드 실행
//		
//		//끝시간
//		long endTime = System.currentTimeMillis();
//		
//		System.out.println("시간:" + (endTime - startTime));
//		
//		System.out.println("-------------------------------------------");
//		return result;
//	}
	
	
	
}
