package com.bins.guava.event;

import com.bins.guava.event.eventfacade.DvdEventBus;

/**
 * Created by songrongbin on 2017/4/25.
 */
public class SupplierApplyEventTest {

    public static void main(String args[]) {
        DvdEventBus eventBus = new DvdEventBus("dvd");

        SupplierApplyEventListener listener = new SupplierApplyEventListener();
        eventBus.register(listener);

        SubmitSupplierApplyEvent submitSupplierApplyEvent = new SubmitSupplierApplyEvent();
        submitSupplierApplyEvent.setId(123);
        eventBus.post(submitSupplierApplyEvent);

        System.out.println("LastMessage:");


        AsyncEventListener asyncListener = new AsyncEventListener();
        System.out.println("AsyncEvent start......");
        AsyncEvent asyncEvent = new AsyncEvent();
        asyncEvent.setId(123);
        asyncListener.getAsyncDvdEventBus().post(asyncEvent);
        // 可以通过手动注入的方式实现 exclude自动扫描结果

        try {
            Thread.sleep(1001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("AsyncEvent end ......");
    }

}
