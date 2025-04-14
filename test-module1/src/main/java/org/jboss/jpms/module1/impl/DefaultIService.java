package org.jboss.jpms.module1.impl;

import org.jboss.jpms.module1.service.IService;

public class DefaultIService implements IService {
    @Override
    public void doWork() {
        System.out.println("DefaultIService.doWork");
    }
}
