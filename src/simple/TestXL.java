package simple;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestXL {

	static ArrayList a = new ArrayList();
	
	public static void main(String[] args) throws Exception{
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Akshay\\Documents\\BankSheet.xlsx");
		XSSFWorkbook b = new XSSFWorkbook(file);
		Sheet s = b.getSheet("Sheet1");
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			Row rowitr = (Row)itr.next();
			Iterator cellitr = rowitr.cellIterator();
			while(cellitr.hasNext()){
				Cell celldata = (Cell)cellitr.next();
				switch(celldata.getCellType()){
				case Cell.CELL_TYPE_STRING:
					a.add(celldata.getStringCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					a.add(celldata.getNumericCellValue());
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					a.add(celldata.getBooleanCellValue());
					break;
				}
			}
		}
	}
		
		public static String tc1(){
		for(int i=0;i<a.size();i++){
			if(a.get(i).equals("Search")){
				String Search = (String)a.get(i);
//				String Data = (String)a.get(i+1);
//				String Objectname = (String)a.get(i+2);
//				String Runmode = (String)a.get(i+3);
				System.out.println(Search);
//				System.out.println(Data);
//				System.out.println(Objectname);
//				System.out.println(Runmode);
			}
			}
		return null;
		}
		
		public static void tc2(){
			
			for(int i=0;i<a.size();i++){
			if(a.get(i).equals("Search")){
				String Search = (String)a.get(i);
//				String Data = (String)a.get(i+1);
//				String Objectname = (String)a.get(i+2);
//				String Runmode = (String)a.get(i+3);
				System.out.println(Search);
//				System.out.println(Data);
//				System.out.println(Objectname);
//				System.out.println(Runmode);
			}
			}
		}
//			if(a.get(i).equals("input")){
//				String Keyword = (String)a.get(i);
//				String Data = (String)a.get(i+1);
//				String Objectname = (String)a.get(i+2);
//				String Runmode = (String)a.get(i+3);
//				System.out.println(Keyword);
//				System.out.println(Data);
//				System.out.println(Objectname);
//				System.out.println(Runmode);
//			}
		}
