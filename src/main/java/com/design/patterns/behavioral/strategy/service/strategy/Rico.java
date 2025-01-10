package com.design.patterns.behavioral.strategy.service.strategy;

import com.design.patterns.behavioral.strategy.enums.EOperation;
import com.design.patterns.behavioral.strategy.service.BrokerStrategy;

import java.util.logging.Logger;

public class Rico implements BrokerStrategy {
    private final Logger logger = Logger.getLogger(Rico.class.getName());

    @Override
    public void sendCommand(EOperation operation, int amount) {
        logger.info("Sending message to Rico: " + operation + " " + amount);
    }
}
