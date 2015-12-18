package com.jfinal.iiteadmin.common;

import java.util.Properties;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.iiteadmin.calendar.CalendarController;
import com.jfinal.iiteadmin.forms.FormsController;
import com.jfinal.iiteadmin.gallery.GalleryController;
import com.jfinal.iiteadmin.index.IndexController;
import com.jfinal.iiteadmin.morepage.MorePageController;
import com.jfinal.iiteadmin.otherpage.OtherPageController;
import com.jfinal.iiteadmin.tables.TablesController;
import com.jfinal.iiteadmin.uielement.UIElementController;
import com.jfinal.iiteadmin.widgets.WidgetsController;

public class JFinalAceAdminConfig extends JFinalConfig {
	
	public Properties loadProp(String pro, String dev) {
		try {return loadPropertyFile(pro);}
		catch (Exception e)
			{return loadPropertyFile(dev);}
	}
	
	public void configConstant(Constants me) {
		// 如果生产环境配置文件存在，则优先加载该配置，否则加载开发环境配置文件
		loadProp("a_little_config_pro.txt", "a_little_config.txt");
		me.setDevMode(getPropertyToBoolean("devMode", false));
	}
	
	public void configRoute(Routes me) {
		
		me.add("/admin/forms",FormsController.class);
		me.add("/admin/gallery",GalleryController.class);
		me.add("/admin", IndexController.class, "/admin/index");
		me.add("/admin/morepage", MorePageController.class, "/admin/more_pages");	
		me.add("/admin/otherpage",OtherPageController.class,"/admin/other_pages");
		me.add("/admin/tables",TablesController.class);
		me.add("/admin/ui",UIElementController.class, "/admin/ui_elements");
		me.add("/admin/widgets", WidgetsController.class);
		me.add("/admin/calendar", CalendarController.class);
	}
	
	public void configPlugin(Plugins me) {
		// C3p0Plugin c3p0Plugin = new C3p0Plugin(getProperty("jdbcUrl"), getProperty("user"), getProperty("password").trim());
		// me.add(c3p0Plugin);
	}
	
	public void configInterceptor(Interceptors me) {
		
	}
	
	public void configHandler(Handlers me) {
		me.add(new ContextPathHandler("contextPath"));//设置上下文路径  防止样式丢失
	}
	
	public static void main(String[] args) {
		JFinal.start("webapp", 8081, "/", 5);
	}
}
