package com.mba.aspect;

import org.aspectj.lang.JoinPoint;

public class AuditAspect {
	public void audit(JoinPoint joinPoint) {
		String methodName = null;
		Object[] args = null;
		methodName = joinPoint.getSignature().getName();
		args = joinPoint.getArgs();
		System.out.println("John has accessed "+methodName +" with loanNo "+args[0]);
		
	}
}
