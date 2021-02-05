package com.ranbo.vplaza.util;

import com.ranbo.vplaza.annotation.Log;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
public class LogAspect {
    private final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("@annotation(Log)")
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

            return joinPoint.proceed();
        }
    }
}
