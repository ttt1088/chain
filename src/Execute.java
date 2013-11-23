/*
 * 创建日期 2009-9-17
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */

/**
 * @author xxzxxz
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public class Execute {
    Execute next;
    public void setNext(Execute next)
    {
    	this.next=next;
    }
    public void execute(String s)
    {
    	if(next!=null)
    	next.execute(s);
    	else System.out .println("no");
    }
}
