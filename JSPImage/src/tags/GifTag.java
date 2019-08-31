package tags;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class GifTag extends SimpleTagSupport{
//	StringWriter sw = new StringWriter();   //if it has a body
	private String src;
	private String label;
	private int box = 0;
	private int height = 0;
	private int width = 0;
	
	public void setSrc(String src) {
		this.src = src;
	}
	
	public void setBox(int box) {
		this.box = box;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	public void doTag() throws JspException, IOException {
//		getJspBody().invoke(sw);
		JspWriter out = getJspContext().getOut();
		out.println("<table frame='border' style='float: left;'> ");
		
		if (label != null) {
			out.println("<tr><th>" + label + "</th></tr>");
		}
		
		out.println("<tr><td>");
		out.println("<img src='"+ src + "' ");
		
		
		if (height > 0) {
			out.println("height='" + height + "' ");
		}
		
		if (box > 0) {
			out.println("border='" + box + "' ");
		}
		
		if (width > 0) {
			out.println("width='" + width + "' ");
		}
		out.println(">");
		out.println("</td></tr></table>");
		
	}
}
