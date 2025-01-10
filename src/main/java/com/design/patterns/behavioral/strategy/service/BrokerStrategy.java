package com.design.patterns.behavioral.strategy.service;

import com.design.patterns.behavioral.strategy.enums.EOperation;

public interface BrokerStrategy {
    void sendCommand(EOperation operation, int amount);
}
