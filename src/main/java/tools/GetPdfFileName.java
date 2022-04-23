package tools;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GetPdfFileName {

    public static void main(String[] args) {
        getFileName();
    }

    public static List<String> getFileName() {
        List<String> PdfFileName = new ArrayList<String>();
        String path = "C:\\Users\\HP\\Desktop\\合同\\合同\\三批次"; // 路径
        File f = new File(path);//获取路径  F:\测试目录

        File fa[] = f.listFiles();//用数组接收  F:\笔记总结\C#, F:\笔记总结\if语句.txt
        for (int i = 0; i < fa.length; i++) {//循环遍历
            File fs = fa[i];//获取数组中的第i个
            if (fs.isDirectory()) {
                System.out.println(fs.getName() + " [目录]");//如果是目录就输出
            } else {
                PdfFileName.add(fs.getName());
//                System.out.println(fs.getName());//否则直接输出
            }
        }
        return PdfFileName;
    }
}
