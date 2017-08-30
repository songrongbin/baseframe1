package com.bins.guava.event.eventfacade;

import com.google.common.eventbus.EventBus;

/**
 * Created by songrongbin on 2017/4/25.
 */
public class DvdEventBus extends EventBus {

    public DvdEventBus(String identifier) {
        super(identifier);
    }

}
