package some.component;

public class VersionReporter {
    public String getVersion() {
        return getClass().getPackage().getImplementationVersion();
    }

    public static void main(String[] args) {
        System.out.println(new VersionReporter().getVersion());
    }
}
