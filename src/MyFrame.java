import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	JMenuBar b=new JMenuBar();
	JMenu sys=new JMenu("ϵͳ");
	JMenu h=new JMenu("����");
	
	JMenuItem help_welcome=new JMenuItem("��ӭ");
	Execute  action;
	public MyFrame()
	{
		 this.setJMenuBar(b);
		 b.add(sys);b.add(h);
		JMenuItem help_welcome=new JMenuItem("��ӭ");
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
			// TODO �Զ����� catch ��
			e.printStackTrace();
		}
		
		
		
	}

	/* ���� Javadoc��
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent arg0) {
		// TODO �Զ����ɷ������
	
		action.execute(arg0.getActionCommand());		
	}

}
