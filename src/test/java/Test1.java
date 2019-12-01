import org.junit.Test;

import java.util.Scanner;

public class Test1 {

    private Factor factor;

    // 测试1
    @Test
    public void test1(){
        fun1("");
    }




    //t1 判断输入的内容是否为空
    public void fun1(String thing){
        if (thing.equals("") ){
            System.out.println("输入的内容为空");
        }else{
            System.out.println("输入的内容不为空");
        }
    }


}
