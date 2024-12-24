package com.design.patterns.Strategy.service.strategy;

import com.design.patterns.Strategy.enums.EOperation;
import com.design.patterns.Strategy.service.BrokerStrategy;

import java.util.logging.Logger;

public class TouroInvestment implements BrokerStrategy {
    private final Logger logger = Logger.getLogger(TouroInvestment.class.getName());

    @Override
    public void sendCommand(EOperation operation, int amount) {
        logger.info("Sending command to Touro: " + operation + " " + amount);
    }
}
