package org.dtk.service;

import org.dtk.model.InputData;
import org.dtk.model.Rate;

import java.util.List;

public interface RateCalculationService {

    List<Rate> calculate(final InputData inputData);
}
