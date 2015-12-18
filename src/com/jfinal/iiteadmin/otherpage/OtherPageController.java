package com.jfinal.iiteadmin.otherpage;

import com.jfinal.core.Controller;

public class OtherPageController extends Controller{

	public void faq(){
		
		render("faq.html");
	}
	
	/**
	 * JfinalAction的简单用法，默认查找route中和Action同名的页面，这里是个示例demo
	 * 跳转至页面error404.html
	 */
	public void error404(){
		
	}
	
	/**
	 * JfinalAction的简单用法，默认查找route中和Action同名的页面，这里是个示例demo
	 * 跳转至页面error500.html
	 */
	public void error500(){
		
	}
	
	/**
	 * JfinalAction的简单用法，默认查找route中和Action同名的页面，这里是个示例demo
	 * 跳转至页面grid.html
	 */
	public void grid(){
		
	}
	
	/**
	 * JfinalAction的简单用法，默认查找route中和Action同名的页面，这里是个示例demo
	 * 跳转至页面blank.html
	 */
	public void blank(){
		
	}
}
