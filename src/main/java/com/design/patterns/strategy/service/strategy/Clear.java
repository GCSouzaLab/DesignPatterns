package com.design.patterns.strategy.service.strategy;

import com.design.patterns.strategy.enums.EOperation;
import com.design.patterns.strategy.service.BrokerStrategy;

import java.util.logging.Logger;

public class Clear implements BrokerStrategy {
    private final Logger logger = Logger.getLogger(Clear.class.getName());

    @Override
    public void sendCommand(EOperation operation, int amount) {
        logger.info("Sending command to clear: " + operation + " " + amount);
    }
}
