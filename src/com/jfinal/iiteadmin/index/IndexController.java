package com.jfinal.iiteadmin.index;

import com.jfinal.core.Controller;

public class IndexController extends Controller {
	/**
	 * 首页视图页面
	 */
	public void index() {
		
		render("index.html");
	}
}
