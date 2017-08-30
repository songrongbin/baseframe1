package com.bins.guava.event.eventfacade;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by songrongbin on 2017/8/2.
 */
public class AsyncExecutor {
    private Executor executor;

    public AsyncExecutor() {
        executor = Executors.newFixedThreadPool(10);
    }

}
