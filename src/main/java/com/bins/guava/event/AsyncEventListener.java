package com.bins.guava.event;

import com.bins.guava.event.eventfacade.AsyncDvdEventBus;
import com.google.common.eventbus.Subscribe;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.Executors;

/**
 * Created by songrongbin on 2017/8/2.
 */
@Component
public class AsyncEventListener {

    private AsyncDvdEventBus asyncDvdEventBus;

    public AsyncEventListener () {
        asyncDvdEventBus = new AsyncDvdEventBus(Executors.newFixedThreadPool(10));
        asyncDvdEventBus.register(this);
    }

    @PostConstruct
    public void init() {

    }

    @Subscribe
    public void listen1(AsyncEvent event) throws InterruptedException {
        Integer id = event.getId();
        System.out.println("id:"+id + " : 1001 start");
        // List
        Thread.sleep(2001);
        System.out.println("Message:"+id + " : 1001");
    }

    public AsyncDvdEventBus getAsyncDvdEventBus() {
        return asyncDvdEventBus;
    }

    public void setAsyncDvdEventBus(AsyncDvdEventBus asyncDvdEventBus) {
        this.asyncDvdEventBus = asyncDvdEventBus;
    }
}
