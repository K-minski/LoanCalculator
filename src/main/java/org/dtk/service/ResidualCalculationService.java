package org.dtk.service;

import org.dtk.model.InputData;
import org.dtk.model.MortgageResidual;
import org.dtk.model.Rate;
import org.dtk.model.RateAmounts;

public interface ResidualCalculationService {

    MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData);

    MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate);
}
