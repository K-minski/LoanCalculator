package org.dtk.service;

import org.dtk.model.InputData;
import org.dtk.model.Rate;

import java.util.List;

public class MortgageCalculationServiceImpl implements MortgageCalculationService {

    private final PrintingService printingService;

    private final RateCalculationService rateCalculationService;

    public MortgageCalculationServiceImpl(
            PrintingService printingService,
            RateCalculationService rateCalculationService) {
        this.printingService = printingService;
        this.rateCalculationService = rateCalculationService;
    }


    @Override
    public void calculate(InputData inputData) {
        printingService.printInputDataInfo(inputData);

        List<Rate> rates = rateCalculationService.determinateRatesList(inputData);


    }
}
