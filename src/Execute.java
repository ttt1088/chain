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
