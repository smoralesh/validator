package com.mediabrands.optimization;

import com.mediabrands.optimization.dto.MessageError;
import com.mediabrands.optimization.dto.Plan;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TestBeanValidator {

    BeanValidator beanValidator = new BeanValidator();


    @Test
    public void givenPlansValidateBean(){

        Plan mediaPlan = new Plan("North America", "US", "CATEGORY X", "CATEGORY X");
        Plan mediaPlan2 = new Plan("North America", "", "CATEGORY X", "CATEGORY X");
        Plan mediaPlan3 = new Plan("North America", "US", "CATEGORY X", null);
        Plan mediaPlan4 = new Plan("", "US", "CATEGORY X", "CATEGORY X");

        List<Plan> mediaPlans = new ArrayList<>();
        mediaPlans.add(mediaPlan);
        mediaPlans.add(mediaPlan2);
        mediaPlans.add(mediaPlan3);
        mediaPlans.add(mediaPlan4);

        List<MessageError> messageErrors = beanValidator.validate(mediaPlans);
        messageErrors.stream().forEach(System.out::println);

    }

    @Test
    public void givenExcelPathReturnMappedPlanObject(){

        ExcelFile excelFile = new ExcelFile();

        try {

            File file  = new File("/Users/smoralesh/workspace/validator/src/test/resources/plans.xlsx");

            List<Plan> plans = excelFile.readExcelFile(file);

            List<MessageError> fileValidationErrors = beanValidator.validate(plans);

            fileValidationErrors.stream().forEach(System.out::println);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
