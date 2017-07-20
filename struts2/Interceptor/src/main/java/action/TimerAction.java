package action;

import com.opensymphony.xwork2.ActionSupport;
public class TimerAction extends ActionSupport{
  public String excute(){
	  //下面为耗时代码段
	  int sum = 0;
	  for(int i =0;i<10000;i++){
		  sum+=i;
	  }
	  return SUCCESS;
  }
}
