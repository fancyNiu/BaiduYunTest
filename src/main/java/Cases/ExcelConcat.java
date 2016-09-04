package Cases;

import com.alibaba.fastjson.JSONObject;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/4.
 */
public class ExcelConcat {

    public static void excelConcat(File input){

        File[] fileList = input.listFiles();
        for(File file : fileList){
            if(file.isFile() && file.getName().startsWith("part")){
                File output = new File(file.getParent()+File.separator+"total.txt");
                if(!output.exists()){
                    try {
                        output.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
//                if(!file.getName().endsWith(".xls")){
//                    file.renameTo(new File(file.getParent()+File.separator+file.getName()+".xls"));
//
//                }


                List<String> list = readExcel(file);
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(output,true));

                    for(int i=0;i<list.size();i++){
                        bw.write(list.get(i));
                        bw.newLine();
                    }
                    bw.flush();
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
            if(file.isDirectory()){
                excelConcat(file);
            }
        }
    }


    public static List<String> readExcel(File input) {
        //创建一个list 用来存储读取的内容
        List list = new ArrayList();
        Cell cell = null;


        //创建输入流

        //获取Excel文件对象
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(input));
            String line = "";
            while ((line = br.readLine()) != null) {
                list.add(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        excelConcat(new File("F:\\工作\\数据分析\\test002\\Rule"));
    }

}
