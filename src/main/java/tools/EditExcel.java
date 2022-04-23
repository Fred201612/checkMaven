package tools;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


public class EditExcel {

    public static String outputFile="C:\\Users\\HP\\Desktop\\checkMaven\\example.xls";

    public static void main(String args[]) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();

        HSSFSheet sheet = workbook.createSheet();

        HSSFRow row = sheet.createRow((short)0);

        HSSFCell cell = row.createCell((short)0);

        cell.setCellValue("value");

        FileOutputStream fileOut = new FileOutputStream(outputFile);

        workbook.write(fileOut);
        fileOut.flush();

        fileOut.close();
        System.out.println("create excel file successfully");
    }

    public void writeexcel(List<Info> all_client_info) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();

        HSSFSheet sheet = workbook.createSheet();

        HSSFRow row = sheet.createRow((short)0);

        HSSFCell cell0 = row.createCell((short)0);
        cell0.setCellValue("姓名");

        HSSFCell cell1 = row.createCell((short)1);
        cell1.setCellValue("住所");

        HSSFCell cell2 = row.createCell((short)2);
        cell2.setCellValue("证件号码");

        HSSFCell cell3 = row.createCell((short)3);
        cell3.setCellValue("联系电话");

        HSSFCell cell4 = row.createCell((short)4);
        cell4.setCellValue("付款方式");

        FileOutputStream fileOut = new FileOutputStream(outputFile);

        workbook.write(fileOut);
        fileOut.flush();

        fileOut.close();
    }
}
