package com.ranbo.vplaza.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    private final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("@annotation(com.ranbo.vplaza.annotation.ExecTimeLog)")
    public void logPointCut() {
    }

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            logger.debug("start around");
            final long start = System.currentTimeMillis();
            final Object procced = joinPoint.proceed();
            logger.debug("end around");
            final long executionTime = System.currentTimeMillis() - start;
            logger.info(joinPoint.getSignature() + " executed in " + executionTime + "ms");
            return procced;
        } catch (Exception e) {
            logger.error("There is a error.", e);
            return joinPoint.proceed();
        }
    }
}
