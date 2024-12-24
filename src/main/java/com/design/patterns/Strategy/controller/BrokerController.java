package com.design.patterns.Strategy.controller;

import com.design.patterns.Strategy.enums.EOperation;
import com.design.patterns.Strategy.service.BrokerService;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;


public class BrokerController {

    private final BrokerService service = new BrokerService();

    @POST
    @Path("/broker/{broker}")
    public void sendCommand(@PathParam("broker") String broker,
                            @QueryParam("operation") EOperation operation,
                            @QueryParam("amount") int amount)
    {
        service.sendCommand(broker, operation, amount);
    }
}
