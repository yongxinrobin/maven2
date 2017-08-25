package testMain;

/**
 * 这个小程序说明流程, 执行一个类的方法时, 
 1.先是执行代码块的, 
 2.接着是构造方法里的, 
 3.再接着是方法的
 * @author wubinbin
 */
public class Test1 {
    public Test1() {
    	System.out.println("构造方法 ************   ");
	}
    public void show(){
    	System.out.println("声明方法 ############# ");
    }
    // 代码块
    {   
        System.out.println("代码 块 %%%%%%%%%%%%%%%% ");
    }
    public static void main(String[] args) {
    	System.out.println("main 方法 $$$$$$$$$$ ");
		Test1 test = new Test1();
		test.show();
	}
    // static block 的优先顺序比 main static method 高, 先执行这个代码块的
    static{
    	System.out.println(" 静态 代码块 static block---------- ");
    }
    
/**
 *   ## 静态代码块的优先级比main 方法的高 ###
 
输出流程如下：
静态 代码块 static block---------- 
main 方法 $$$$$$$$$$ 
代码 块 %%%%%%%%%%%%%%%% 
构造方法 ************   
声明方法 ############# 

*/
    
}
