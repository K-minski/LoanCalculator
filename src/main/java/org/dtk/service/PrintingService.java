package org.dtk.service;

import org.dtk.model.InputData;

public interface PrintingService {

    String INTEREST_SUM = "SUMA ODSETEK: ";
    String RATE_NUMBER = "NR: ";
    String YEAR = "ROK: ";
    String MONTHS = " MIESIAC: ";
    String RATE = "RATA: ";
    String INTEREST = "ODSETKI: ";
    String CAPITAL = "KAPITAL: ";
    String LEFT = "POZOSTALO: ";
    String MORTGAGE_AMOUNT = "KWOTA KREDYTU: ";
    String MORTGAGE_PERIOD = "OKRES KREDYTOWANIA: ";

    String CURRENCY = " ZŁ ";
    String NEW_LINE ="\n";
    String PERCENT = "%";

    void printInputDataInfo(final InputData inputData);
}
