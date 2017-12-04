package com.mediabrands.optimization;

import com.mediabrands.optimization.dto.MessageError;
import org.apache.poi.ss.usermodel.Cell;

import java.io.File;

public interface FileValidator{

    MessageError validateFileSize(File file);

    MessageError validateFileExtension(String filePath);

    MessageError validateFileHeader(Cell firstRowFile);

}
