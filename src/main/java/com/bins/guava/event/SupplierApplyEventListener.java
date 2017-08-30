package com.bins.guava.event;

import com.bins.guava.event.eventfacade.EventListener;
import com.google.common.eventbus.Subscribe;

/**
 * Created by songrongbin on 2017/4/25.
 */
public class SupplierApplyEventListener implements EventListener {

    @Subscribe
    public void listen1(SubmitSupplierApplyEvent event) throws InterruptedException {
        Integer id = event.getId();
        // List
        Thread.sleep(1001);
        System.out.println("Message:"+id + " : 100100000");
    }

    @Subscribe
    public void listen2(SaveSupplierApplyEvent event) throws InterruptedException {
        Integer id = event.getId();
        Thread.sleep(1002);
        System.out.println("Message:"+id + " : 10021111");
    }

}
