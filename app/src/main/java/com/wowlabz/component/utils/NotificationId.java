package com.wowlabz.component.utils;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by riteshdubey on 5/10/17.
 */

public class NotificationId {
    private final static AtomicInteger c = new AtomicInteger(0);

    public static int getID() {
        return c.incrementAndGet();
    }
}
