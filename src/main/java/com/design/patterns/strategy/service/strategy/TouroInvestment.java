package com.design.patterns.strategy.service.strategy;

import com.design.patterns.strategy.enums.EOperation;
import com.design.patterns.strategy.service.BrokerStrategy;

import java.util.logging.Logger;

public class TouroInvestment implements BrokerStrategy {
    private final Logger logger = Logger.getLogger(TouroInvestment.class.getName());

    @Override
    public void sendCommand(EOperation operation, int amount) {
        logger.info("Sending command to Touro: " + operation + " " + amount);
    }
}
