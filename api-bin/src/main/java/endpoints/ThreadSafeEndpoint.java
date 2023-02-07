package endpoints;

public class ThreadSafeEndpoint {

    private static ThreadLocal<String> endpoint = ThreadLocal.withInitial(() -> null);

    public static String getEndpoint() {
        return endpoint.get();
    }

    public static void setEndpoint(String apiEndpoint) {
        endpoint.set(apiEndpoint);
    }
}
