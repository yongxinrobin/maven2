package testMain;

/**
 * ���С����˵������, ������һ����ķ���ʱ, ����ִ�д�����, 
 * �����ǹ��췽�����, �ٽ����Ƿ�����
 * @author wubinbin
 */
public class Test1 {
    public Test1() {
    	System.out.println("���췽�� ************   ");
	}
    public void show(){
    	System.out.println("�������� ############# ");
    }
    // �����
    {   
        System.out.println("���� �� %%%%%%%%%%%%%%%% ");
    }
    public static void main(String[] args) {
    	System.out.println("main ���� $$$$$$$$$$ ");
		Test1 test = new Test1();
		test.show();
	}
    // static block ������˳��� main static method ��, ��ִ�����������
    static{
    	System.out.println(" ��̬ ����� static block---------- ");
    }
    
/**
 * 
����������£�
��̬ ����� static block---------- 
main ���� $$$$$$$$$$ 
���� �� %%%%%%%%%%%%%%%% 
���췽�� ************   
�������� ############# 
*/
    
}
