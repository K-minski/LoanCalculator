package org.dtk.service;

import org.dtk.model.InputData;
import org.dtk.model.TimePoint;

import java.math.BigDecimal;

public interface TimePointService {
    TimePoint determinate(BigDecimal rateNumber, InputData inputData);
}
