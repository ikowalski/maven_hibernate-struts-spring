package manager;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component("aspectJAdvice")
public class AspectJAdvice {

	public void doBefore(JoinPoint joinPoint) {
		System.out.println("-----doBefore.invoke-----");
		System.out.println(" 此处意在执行核心业务逻辑前，做一些安全性的判断等等");
		System.out.println(" 可通过joinPoint来获取所需要的内容");
		System.out.println("-----End of doBefore()------");
	}

	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("-----doAround.invoke-----");
		System.out.println(" 此处可以做类似于Before的事情");

		// 调用核心逻辑
		Object retVal = pjp.proceed();
		System.out.println(" 此处可以做类似于After的事情");
		System.out.println("-----End of doAround()------");
		return retVal;
	}

	public void doAfter(JoinPoint joinPoint) {
		System.out.println("-----doAfter.invoke-----");
		System.out.println(" 此处意在执行核心业务逻辑之后，做一些日志记录操作等等");
		System.out.println(" 可通过joinPoint来获取所需要的内容");
		System.out.println("-----End of doAfter()------");
	}

	public void doReturn(JoinPoint joinPoint, String retVal) {
		System.out.println("-----doReturn().invoke-----");
		System.out.println("Return Value: " + retVal);
		System.out.println(" 此处可以对返回值做进一步处理");
		System.out.println(" 可通过joinPoint来获取所需要的内容");
		System.out.println("-----End of doReturn()------");
	}

	public void doThrowing(JoinPoint joinPoint, Exception ex) {
		System.out.println("-----doThrowing().invoke-----");
		System.out.println(" 错误信息：" + ex.getMessage());
		System.out.println(" 此处意在执行核心业务逻辑出错时，捕获异常，并可做一些日志记录操作等等");
		System.out.println(" 可通过joinPoint来获取所需要的内容");
		System.out.println("-----End of doThrowing()------");
	}
}