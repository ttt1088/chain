import javax.swing.JOptionPane;

/*
 * �������� 2009-9-17
 *
 * TODO Ҫ���Ĵ����ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */

/**
 * @author xxzxxz
 *
 * TODO Ҫ���Ĵ����ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
public class OperationExecute extends Execute {
	public void execute(String s)
    {
		
		if(s.equals("����"))
	   
		JOptionPane.showMessageDialog(null,"��ѡ���˲����˵�");	
		
		else
		super.execute(s);
    }
}
