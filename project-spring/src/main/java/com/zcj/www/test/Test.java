package com.zcj.www.test;

import com.zcj.www.config.App;
import com.zcj.www.service.IndexService;
import com.zcj.www.service.IndexServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(App.class);
		IndexServiceImpl bean = (IndexServiceImpl) annotationConfigApplicationContext.getBean(IndexService.class);
		String word = bean.get("hello world");
		System.out.println(word + "--" +bean);
	}

}
