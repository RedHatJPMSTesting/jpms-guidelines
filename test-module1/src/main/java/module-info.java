module org.jboss.jpms.module1 {
    exports org.jboss.jpms.module1.service;

    provides org.jboss.jpms.module1.service.IService with org.jboss.jpms.module1.impl.DefaultIService;
}