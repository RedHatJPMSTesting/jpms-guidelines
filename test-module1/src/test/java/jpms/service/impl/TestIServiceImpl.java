package jpms.service.impl;

import org.jboss.jpms.module1.service.IService;

public class TestIServiceImpl implements IService {
    @Override
    public void doWork() {
        System.out.println("TestIServiceImpl.doWork");
    }
}
