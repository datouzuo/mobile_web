package xin.mengzuo.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyException {
	
	@ResponseBody
    @ExceptionHandler(value = Exception.class)
	 public TtmsResult exceptionHandler(Exception ex){ 
		 
		return TtmsResult.build(400, "");


		 }
	 
	
}
