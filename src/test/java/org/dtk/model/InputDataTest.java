package org.dtk.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class InputDataTest {

    @ParameterizedTest
    @CsvSource({
            "'2023-05-10', '2.73', '200000', 160, '1.9'",
            "'2019-08-11', '2.53', '1500000', 160, '2.9'"
    })
    void testInputDataModelWither(String testDate, String testWibor, String testAmount, int testMonthDuration, String testMargin) {
        InputData input = new InputData()
                .withAmount(new BigDecimal(testAmount))
                .withBankMargin(new BigDecimal(testMargin))
                .withWiborPercent(new BigDecimal(testWibor))
                .withMonthDuration(BigDecimal.valueOf(testMonthDuration))
                .withRepaymentStartDate(LocalDate.parse(testDate));

        assertEquals(new BigDecimal(testAmount), input.getAmount());
        assertEquals(new BigDecimal(testMargin), input.getBankMarginPercent());
        assertEquals(new BigDecimal(testWibor), input.getWiborPercent());
        assertEquals(BigDecimal.valueOf(testMonthDuration), input.getMonthDuration());
        assertEquals(LocalDate.parse(testDate), input.getRepaymentStartDate());
    }

    @ParameterizedTest
    @EnumSource(RateType.class)
    void testRateTypeWither(RateType type) {
        InputData input = new InputData();
        InputData returned = input.withRateType(type);

        assertSame(input, returned);
        assertEquals(type, input.getRateType());
    }

}