module org.jboss.jpms.test_module1 {

    requires org.jboss.jpms.module1;
    requires transitive org.junit.jupiter.engine;
    requires transitive org.junit.jupiter.api;
    uses org.jboss.jpms.module1.service.IService;

    provides org.jboss.jpms.module1.service.IService with jpms.service.impl.TestIServiceImpl;

    opens jpms.service to org.junit.platform.commons;
}