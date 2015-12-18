package com.jfinal.iiteadmin.calendar;

import com.jfinal.core.Controller;

/**
 *日历Controller 所有关于日历相关处理的Action都在这里 
 *
 */
public class CalendarController extends Controller{

	/**
	 * 日历主界面
	 */
	public void index(){
		
		render("calendar.html");
	}
}
