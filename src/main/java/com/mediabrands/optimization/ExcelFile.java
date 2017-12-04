package com.mediabrands.optimization;

import com.mediabrands.optimization.dto.Plan;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelFile {

    public List<Plan> readExcelFile(File file) throws IOException {

        List<Plan> listPlans = new ArrayList<>();
        FileInputStream inputStream = new FileInputStream(file);

        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet firstSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = firstSheet.iterator();

        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            Plan plan = new Plan();

            while (cellIterator.hasNext()) {
                Cell nextCell = cellIterator.next();
                int columnIndex = nextCell.getColumnIndex();

                switch (columnIndex) {
                    case 0:
                        plan.setRegion(nextCell.getStringCellValue());
                        break;
                    case 1:
                        plan.setCountry(nextCell.getStringCellValue());
                        break;
                    case 2:
                        plan.setSalesCategory(nextCell.getStringCellValue());
                        break;
                    case 3:
                        plan.setMediaCategory(nextCell.getStringCellValue());
                        break;
                }

            }
            listPlans.add(plan);
        }

        workbook.close();
        inputStream.close();

        return listPlans;
    }

}
