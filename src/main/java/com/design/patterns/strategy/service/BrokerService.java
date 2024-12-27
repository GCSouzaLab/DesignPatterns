package com.design.patterns.strategy.service;

import com.design.patterns.strategy.enums.EOperation;
import com.design.patterns.strategy.service.strategy.Clear;
import com.design.patterns.strategy.service.strategy.Rico;
import com.design.patterns.strategy.service.strategy.TouroInvestment;

import java.util.Map;

public class BrokerService {

    private final Map<String, BrokerStrategy> brokers = Map.of(
        Rico.class.getName(), new Rico(),
        Clear.class.getName(), new Clear(),
        TouroInvestment.class.getName(), new TouroInvestment()
    );

    public void sendCommand(String broker, EOperation operation, int amount) {
        brokers.get(broker).sendCommand(operation, amount);
    }
}