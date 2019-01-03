package test;

import com.sun.jna.ptr.IntByReference;

/**
 * @描述:
 * @作者: REN
 * @时间: 2018/12/25 16:55
 */
public class DllTest {

    public static void main(String args[]) {
        System.out.println("两个数相加的和为："+ TestLibrary.INSTANCE.add(5,6));
        TestLibrary.INSTANCE.addArray(new IntByReference(5),new IntByReference(6),new IntByReference(7),5);
        System.out.println("两个字符连接为："+ TestLibrary.INSTANCE.stringFun("aaa","bbb"));
    }
}
