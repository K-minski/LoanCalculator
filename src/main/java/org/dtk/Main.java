package org.dtk;

import org.dtk.model.InputData;
import org.dtk.model.Rate;
import org.dtk.service.*;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputData inputData = new InputData()
                .withAmount(new BigDecimal("200000"))
                .withMonthDuration(BigDecimal.valueOf(160));

        PrintingService printingService = new PrintingServiceImpl();
        RateCalculationService rateCalculationService = new RateCalculationServiceImpl();

        MortgageCalculationService mortgageCalculationService = new MortgageCalculationServiceImpl(
                printingService,
                rateCalculationService
        );


        mortgageCalculationService.calculate(inputData);
    }
}