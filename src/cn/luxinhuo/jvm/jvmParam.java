package cn.luxinhuo.jvm;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

//测试jvm的参数
public class jvmParam {

    /**
     * 打印出JVM垃圾收集器的种类
     * @param args
     */
    public static void main(String args[]) {
        List<GarbageCollectorMXBean> l = ManagementFactory.getGarbageCollectorMXBeans();
        for(GarbageCollectorMXBean b : l) {
            System.out.println(b.getName());
        }
    }
}
