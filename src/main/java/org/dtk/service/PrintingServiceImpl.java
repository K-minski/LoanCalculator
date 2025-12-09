package org.dtk.service;

import org.dtk.model.InputData;

public class PrintingServiceImpl implements PrintingService {

    @Override
    public void printInputDataInfo(InputData inputData) {

        StringBuilder message = new StringBuilder(NEW_LINE);
        message.append(MORTGAGE_AMOUNT).append(inputData.getAmount()).append(CURRENCY).append(NEW_LINE);
        message.append(MORTGAGE_PERIOD).append(inputData.getMonthDuration()).append(MONTHS).append(NEW_LINE);
        message.append(INTEREST).append(inputData.getInterestValue()).append(PERCENT).append(NEW_LINE);

        logMessage(message);
    }

    private void logMessage(StringBuilder sb) {
        System.out.println(sb);
    }
}
