package org.dtk.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class InputData {
    private static final BigDecimal PERCENT = BigDecimal.valueOf(100);

    private LocalDate repaymentStartDate = LocalDate.of(2020,1,5);

    private BigDecimal wiborPercent = new BigDecimal("1.73");

    private BigDecimal amount = new BigDecimal("300000");
    private BigDecimal monthDuration = BigDecimal.valueOf(180); // Imply 15 years for now.

    private RateType rateType = RateType.CONSTANT;

    private BigDecimal bankMarginPercent = new BigDecimal("1.9");

    public LocalDate getRepaymentStartDate() {
        return repaymentStartDate;
    }

    public BigDecimal getWiborPercent() {
        return wiborPercent;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getMonthDuration() {
        return monthDuration;
    }

    public RateType getRateType() {
        return rateType;
    }

    public BigDecimal getBankMarginPercent() {
        return bankMarginPercent;
    }

    public BigDecimal getInterestPercent(){
        return wiborPercent.add(bankMarginPercent).divide(PERCENT, 10, RoundingMode.HALF_UP);
    }

    public BigDecimal getInterestDisplay(){
        return wiborPercent.add(bankMarginPercent).setScale(2,RoundingMode.HALF_UP);
    }

    // "withers" used instead of setters
    public InputData withRepaymentStartDate(LocalDate repaymentStartDate) {
        this.repaymentStartDate = repaymentStartDate;
        return this;
    }

    public InputData withWiborPercent(BigDecimal wiborPercent) {
        this.wiborPercent = wiborPercent;
        return this;
    }

    public InputData withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public InputData withMonthDuration(BigDecimal monthDuration) {
        this.monthDuration = monthDuration;
        return this;
    }

    public InputData withRateType(RateType rateType) {
        this.rateType = rateType;
        return this;
    }

    public InputData withBankMargin(BigDecimal bankMarginPercent) {
        this.bankMarginPercent = bankMarginPercent;
        return this;
    }
}
