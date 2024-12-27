package com.design.patterns.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public class ChannelFactory {
    private static final Map<EChannel, Supplier<Channel>> CHANNELS_MAP = new HashMap<>();

    static {
        // Registering channels
        CHANNELS_MAP.put(EChannel.TCP, TCPChannel::new);
        CHANNELS_MAP.put(EChannel.UDP, UDPChannel::new);
    }

    public static Channel create(EChannel channel) {
        Supplier<Channel> supplier = CHANNELS_MAP.get(channel);
        if (Objects.nonNull(supplier)) {
            return supplier.get();
        }
        throw new IllegalArgumentException("Channel not found");
    }

    public static void registerNewChannel(EChannel channel, Supplier<Channel> supplier) {
        CHANNELS_MAP.put(channel, supplier);
    }
}
