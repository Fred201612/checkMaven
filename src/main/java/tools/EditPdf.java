package tools;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EditPdf {

    public static void main(String[] args) throws IOException {

        List<String> PdfFileName = GetPdfFileName.getFileName();

        List<Info> all_client_info = new ArrayList<Info>();

        for (int a=0; a < PdfFileName.size(); a++){
            PdfReader pdfReader = null;
            try {
                pdfReader = new PdfReader("C:\\Users\\HP\\Desktop\\合同\\合同\\三批次\\" + PdfFileName.get(a));
                System.out.println("checking " + PdfFileName.get(a));
            } catch (IOException e) {
                e.printStackTrace();
            }

            String content = new String();

            int pages = pdfReader.getNumberOfPages();

            for (int i=1; i <= pages; i++) {
                String pageContent = null;
                try {
                    pageContent = PdfTextExtractor.getTextFromPage(pdfReader, i);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                content += pageContent;

            }
            String all_info = content.split("委托代理人：  联系电话： ")[1].split("甲、乙双方在平等、自愿")[0];
            if (all_info.length() > 1000){
                System.out.println(PdfFileName.get(a));
            }
            String method = content.split("方式支付房款")[1].split("客户：自签订《认购协议》")[0];
            if (method.length() > 1000){
                System.out.println(PdfFileName.get(a));
            }
            String ro_number = content.split("康涵路  路  188弄  弄《  浦荟铭庭  》")[1].split("（以下简称该房屋）")[0];
            if (ro_number.length() > 1000){
                System.out.println(PdfFileName.get(a));
            }

            String[] strs = all_info.split("乙方");
            for (int j=1; j < strs.length; j++){
                Info client_info = new Info();
                client_info.setName(strs[j].substring(6,strs[j].indexOf("国籍")).trim());
                client_info.setLocation(strs[j].substring(strs[j].indexOf("住所(址)：")+6,strs[j].indexOf("邮编")).trim());
                client_info.setId(strs[j].substring(strs[j].lastIndexOf("号码：")+3,strs[j].indexOf("联系电话：")).trim());
                client_info.setTel_number(strs[j].substring(strs[j].indexOf("联系电话：")+5,strs[j].indexOf("委托/法定代理人")).trim());
                client_info.setPay_method(method.trim());
                client_info.setRoom_number(ro_number.trim());
                all_client_info.add(client_info);
            }


            pdfReader.close();
        }



        writeexcel(all_client_info);

    }

    private static void writeexcel(List<Info> all_client_info) throws IOException {
        String outputFile="C:\\Users\\HP\\Desktop\\合同\\合同\\三批次\\example.xls";

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

        HSSFCell cell5 = row.createCell((short)5);
        cell5.setCellValue("房号");


        for (int i=0; i < all_client_info.size(); i++){
            HSSFRow data_row = sheet.createRow((short)i+1);

            HSSFCell data_cell0 = data_row.createCell((short)0);
            data_cell0.setCellValue(all_client_info.get(i).getName());

            HSSFCell data_cell1 = data_row.createCell((short)1);
            data_cell1.setCellValue(all_client_info.get(i).getLocation());

            HSSFCell data_cell2 = data_row.createCell((short)2);
            data_cell2.setCellValue(all_client_info.get(i).getId());

            HSSFCell data_cell3 = data_row.createCell((short)3);
            data_cell3.setCellValue(all_client_info.get(i).getTel_number());

            HSSFCell data_cell4 = data_row.createCell((short)4);
            data_cell4.setCellValue(all_client_info.get(i).getPay_method());

            HSSFCell data_cell5 = data_row.createCell((short)5);
            data_cell5.setCellValue(all_client_info.get(i).getRoom_number());
        }


        FileOutputStream fileOut = new FileOutputStream(outputFile);

        workbook.write(fileOut);
        fileOut.flush();

        fileOut.close();
    }



}
