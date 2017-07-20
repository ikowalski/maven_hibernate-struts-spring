package Interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TimerInterceptor extends AbstractInterceptor{
public String intercept(ActionInvocation invocation) throws Exception {
	 //1.执行action之前
	long start = System.currentTimeMillis();
	//2.执行下一个拦截器，如果已经是最后一个拦截器，则执行目标Aciton
	String result = invocation.invoke();
	//3.执行Action之后
	long end = System.currentTimeMillis();
	System.out.println("执行Action花费时间："+(end-start+"ms"));
	return result;
}
}