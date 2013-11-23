import javax.swing.JOptionPane;

public class CheckExecute extends Execute {
	public void execute(String s)
    {
		
		if(s.equals("查询数据"))
			   
				JOptionPane.showMessageDialog(null,"查询数据");	
				
				else
    	super.execute(s);
    }
}
