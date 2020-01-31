package com.atguigu.java;

import com.atguigu.bean.Customers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @auther thk
 * @date 2020/1/30 - 21:38
 *
 * 1. IDEA中代碼模塊所處的位置：setting - editor -Live Templates / Postfix Comleption
 * 2. 常用的模板
 */
public class TemplatesTest {
    //模板六：prsf可生成private static final
    private static final Customers CUST=new Customers();

    //變形：psf
    private static final int NUM=1;
    //變形:psfi
    public static final int NUM2=2;
    //變形:psfs
    public static final String HELLO="hello";


    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout/sysout
        System.out.println("hello");
        //變形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        int num1=10;
        System.out.println("num1 = " + num1);

        //模板三：fori
        String[] arr=new String[]{"tom","jerry","lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //變形
        for (String s : arr) {
            System.out.println(s);
        }
        //變形
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }

        //模板四：list.for
        ArrayList list=new ArrayList();
        for (int i = 0; i < 3; i++) {
            list.add(i);
        }
        for (Object o : list) {
            System.out.println("o = " + o);
        }

        //變形：list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i = " + i);
        }

        //變形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("i = " + i);
        }
    }
    public void method(){
        System.out.println("TemplatesTest.method");
        //模板五：ifn
        ArrayList list=new ArrayList();
        for (int i = 0; i < 3; i++) {
            list.add(i);
        }

        if (list == null) {
            System.out.println("錯啦");
        }
        //變形：
        if (list != null) {
            System.out.println("對的");
        }
        //變形：xxx.null /list.null
        if (list == null) {
            System.out.println("錯了");
        }

    }
}
