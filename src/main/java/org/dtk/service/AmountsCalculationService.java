package org.dtk.service;

import org.dtk.model.InputData;
import org.dtk.model.Rate;
import org.dtk.model.RateAmounts;

public interface AmountsCalculationService {
    RateAmounts calculate(InputData inputData);

    RateAmounts calculate(InputData inputData, Rate previousRate);
}
