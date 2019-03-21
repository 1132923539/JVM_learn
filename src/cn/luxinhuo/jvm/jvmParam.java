package cn.luxinhuo.jvm;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.Properties;

//测试jvm的参数
public class jvmParam {

    /**
     * 打印出JVM垃圾收集器的种类
     * @param args
     */
    public static void main1(String args[]) {
        List<GarbageCollectorMXBean> l = ManagementFactory.getGarbageCollectorMXBeans();
        for(GarbageCollectorMXBean b : l) {
            System.out.println(b.getName());
        }
    }

    /**
     * 用于获取-D 设置的系统属性
     * @param args
     */
    public static void main(String[] args) {
        String str = System.getProperty("str");
        String aa = System.getProperty("aa");

        System.out.println(str);
        System.out.println(aa);
    }



}

