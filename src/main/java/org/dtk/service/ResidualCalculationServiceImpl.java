package org.dtk.service;

import org.dtk.model.InputData;
import org.dtk.model.MortgageResidual;
import org.dtk.model.Rate;
import org.dtk.model.RateAmounts;

import java.math.BigDecimal;

public class ResidualCalculationServiceImpl implements ResidualCalculationService {

    @Override
    public MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData) {
        BigDecimal residualAmount = inputData.getAmount().subtract(rateAmounts.getCapitalAmount());
        BigDecimal residualDuration = inputData.getMonthDuration().subtract(BigDecimal.ONE);


        return new MortgageResidual(residualAmount, residualDuration);
    }

    @Override
    public MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate) {
        MortgageResidual residual = previousRate.getMortgageResidual();

        BigDecimal residualAmount = residual.getAmount().subtract(rateAmounts.getCapitalAmount());
        BigDecimal residualDuration = residual.getDuration().subtract(BigDecimal.ONE);

        return new MortgageResidual(residualAmount, residualDuration);
    }
}
