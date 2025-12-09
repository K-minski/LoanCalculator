package org.dtk;

import org.dtk.model.InputData;
import org.dtk.service.PrintingService;
import org.dtk.service.PrintingServiceImpl;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        PrintingService printingService = new PrintingServiceImpl();

        InputData inputData = new InputData();

        printingService.printInputDataInfo(inputData);

        InputData inputData1 = new InputData()
                .withAmount(new BigDecimal("200000"))
                .withMonthDuration(BigDecimal.valueOf(160));

        printingService.printInputDataInfo(inputData1);
    }
}