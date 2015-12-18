package com.jfinal.iiteadmin.forms;
import com.jfinal.core.Controller;
public class FormsController extends Controller {

	public void form_elements(){
		
		render("form_elements.html");
	}
	
	public void form_elements2(){
		
		render("form_elements2.html");
	}
	
	public void wizard_validation(){
		
		render("wizard_validation.html");
	}
	
	public void wysiwyg_markdown(){
		
//		render("wysiwyg_markdown.html");
	}
	
	public void dropzone_file_upload(){
		
		render("dropzone_file_upload.html");
	}
}
