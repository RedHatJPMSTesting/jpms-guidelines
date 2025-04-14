package jpms.service;

import org.jboss.jpms.module1.service.IService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ServiceLoader;

public class ServiceLoaderTest {
    @Test
    public void testDefaultIService() {

        ServiceLoader<IService> serviceLoader = ServiceLoader.load(IService.class);
        Assertions.assertEquals(2, serviceLoader.stream().count());
        serviceLoader.findFirst().ifPresent(IService::doWork);
    }
}
