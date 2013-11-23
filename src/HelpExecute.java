import javax.swing.JOptionPane;

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
public class HelpExecute extends Execute {
	public void execute(String s)
    {
		
		if(s.equals("欢迎"))
			   
				JOptionPane.showMessageDialog(null,"欢迎使用本系统，版本1.0");	
				
				else
    	super.execute(s);
    }
}
