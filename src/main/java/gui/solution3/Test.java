package gui.solution3;

public class Test {
    public static void main(String[] args) {
        new Client(createOsSpecificFactory());
    }

    public static GUIFactory createOsSpecificFactory() {
        int sys = readFromConfigFile();
        if (sys == 0) {
            return new WinFactory();
        } else {
            return new OSXFactory();
        }
    }

    private static int readFromConfigFile() {
        int i = 0;
        double random = Math.random();
        if (random > 0.5) {
            i = 1;
        }
        return i;
    }
}
