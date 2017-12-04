package com.mediabrands.optimization;

import com.mediabrands.optimization.dto.MessageError;
import org.apache.poi.ss.usermodel.Cell;

import java.io.File;
import java.util.List;

public class ValidatePlansExcelFile implements FileValidator{
    @Override
    public MessageError validateFileSize(File file) {
        return null;
    }

    @Override
    public MessageError validateFileExtension(String filePath) {
        return null;
    }

    @Override
    public MessageError validateFileHeader(Cell firstRowFile) {
        return null;
    }

    @Override
    public List<MessageError> validate(List<?> listToValidate) {

        MessageError fileSi


    }
}
