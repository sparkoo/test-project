package cz.sparko.testproject;

public class GetClazz {

    public static void main(String[] args) {
        SosService a = new SomeServiceImpl();
        ccc(SomeOtherService.class, a);
    }

    private static <T extends SosService> void ccc(Class<T> clazz, SosService a) {
        System.out.println(a.getClass());
        System.out.println(clazz.isAssignableFrom(a.getClass()));
    }

    private interface SosService {
    }

    private interface SomeOtherService extends SosService {
    }

    private interface SomeService extends SosService {
    }

    private static class SomeServiceImpl implements SomeService {
    }
}