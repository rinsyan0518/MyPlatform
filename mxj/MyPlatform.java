import com.cycling74.max.*;

public class MyPlatform extends MaxObject {
    private static final String OS_NAME = System.getProperty("os.name").toLowerCase();

    public static boolean isLinux() {
        return OS_NAME.startsWith("linux");
    }

    public static boolean isMac() {
        return OS_NAME.startsWith("mac");
    }

    public static boolean isWindows() {
        return OS_NAME.startsWith("windows");
    }

    public static boolean isSunOS() {
        return OS_NAME.startsWith("sunos");
    }

    public MyPlatform() {
        declareIO(1, 2);
    }

    public void bang() {
        if (isWindows()) {
            outlet(0, "bang");
        } else if (isMac()) {
            outlet(1, "bang");
        } else {
            outlet(2, "bang");
        }
    }
}
