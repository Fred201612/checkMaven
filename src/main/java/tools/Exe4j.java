package tools;

import java.util.Properties;

/**
 * @Description:
 * @Project: exe
 * @Title: Exe4j.java
 * @Date: 2020-08-31 17:07
 **/
public class Exe4j {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        String osName = properties.getProperty("os.name");
        System.out.println (osName);

        try {
            if (osName.indexOf("Linux") != -1) {
                Runtime.getRuntime().exec("step:htmlview");
            } else if (osName.indexOf("Windows") != -1){
                Runtime.getRuntime().exec("explorer http://www.baidu.com");
            } else {
                throw new RuntimeException("Unknown OS.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}