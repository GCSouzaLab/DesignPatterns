package com.design.patterns.Strategy.service;

import com.design.patterns.Strategy.enums.EOperation;

public interface BrokerStrategy {
    void sendCommand(EOperation operation, int amount);
}
