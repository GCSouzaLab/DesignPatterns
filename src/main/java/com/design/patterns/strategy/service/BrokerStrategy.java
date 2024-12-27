package com.design.patterns.strategy.service;

import com.design.patterns.strategy.enums.EOperation;

public interface BrokerStrategy {
    void sendCommand(EOperation operation, int amount);
}
