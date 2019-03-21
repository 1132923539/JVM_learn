package cn.luxinhuo.jvm;

import java.util.HashMap;
import java.util.HashSet;

public class XXParam {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("gc开始");
        int a =0;
        HashSet<Object> objs = new HashSet<>();
        while (a<Integer.MAX_VALUE){
            Thread.sleep(1);
            objs.add(new String("dsfw"+a*Math.random()*1000));
            a++;
        }
        System.gc();
        System.out.println("gc结束");
    }
}
