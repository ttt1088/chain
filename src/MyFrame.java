import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	JMenuBar b=new JMenuBar();
	JMenu sys=new JMenu("系统");
	JMenu h=new JMenu("帮助");
	
	JMenuItem help_welcome=new JMenuItem("欢迎");
	Execute  action;
	public MyFrame()
	{
		 this.setJMenuBar(b);
		 b.add(sys);b.add(h);
		JMenuItem help_welcome=new JMenuItem("欢迎");
		 h.add(help_welcome);
		 help_welcome.addActionListener(this);
		 action=new HelpExecute();
		  init();
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible( true);
	}
	public void init()
	{
		 try {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream
				(System.getProperty("user.dir")+"\\src\\config.txt")));
        String data = null;
        Class c ;
       
        JMenuItem menuItem;

			while((data = br.readLine())!=null)
			  {  
		
			
				menuItem=new JMenuItem(data);
				sys.add(menuItem);
				menuItem.addActionListener(this);
				data = br.readLine();
			
				c = Class.forName(data);
				Execute execute =(Execute) c.newInstance();
				
				if(action==null)
				{
					action=execute;
				}
					execute.next=action;
					action=execute;

				
			  
			  }
		} catch (Exception e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		
		
		
	}

	/* （非 Javadoc）
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent arg0) {
		// TODO 自动生成方法存根
	
		action.execute(arg0.getActionCommand());		
	}

}
