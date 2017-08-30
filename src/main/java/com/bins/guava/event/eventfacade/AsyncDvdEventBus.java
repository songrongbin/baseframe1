package com.bins.guava.event.eventfacade;

import com.google.common.eventbus.AsyncEventBus;

import java.util.concurrent.Executor;

/**
 * Created by songrongbin on 2017/8/2.
 */
public class AsyncDvdEventBus extends AsyncEventBus {

    public AsyncDvdEventBus(Executor executor) {
        super("asyncDvd", executor);
    }

}
