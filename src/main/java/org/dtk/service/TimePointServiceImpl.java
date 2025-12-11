package org.dtk.service;

import org.dtk.model.InputData;
import org.dtk.model.TimePoint;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TimePointServiceImpl implements TimePointService {

    private static final BigDecimal YEAR = BigDecimal.valueOf(12);

    @Override
    public TimePoint determinate(BigDecimal rateNumber, InputData inputData) {
        LocalDate date = determinateDate(rateNumber, inputData);

        BigDecimal year = determinateYear(rateNumber);
        BigDecimal month = determinateMonth(rateNumber);
        return new TimePoint(date, year, month);
    }

    private static LocalDate determinateDate(BigDecimal rateNumber, InputData inputData) {
        return inputData.getRepaymentStartDate().plusMonths(rateNumber.subtract(BigDecimal.ONE).intValue());
    }

    private BigDecimal determinateYear(final BigDecimal rateNumber) {
        return rateNumber.divide(YEAR, RoundingMode.UP).max(BigDecimal.ONE);
    }

    private BigDecimal determinateMonth(final BigDecimal rateNumber) {
        return BigDecimal.ZERO.equals(rateNumber.remainder(YEAR)) ? YEAR: rateNumber.remainder(YEAR);
    }
}
