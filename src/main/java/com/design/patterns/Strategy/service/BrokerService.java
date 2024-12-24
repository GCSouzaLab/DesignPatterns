package com.design.patterns.Strategy.service;

import com.design.patterns.Strategy.enums.EOperation;
import com.design.patterns.Strategy.service.strategy.Clear;
import com.design.patterns.Strategy.service.strategy.Rico;
import com.design.patterns.Strategy.service.strategy.TouroInvestment;

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
