package basePatterns.creational.singleton;

/**
 * Created by hofa on 30.01.2018.
 */
public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("A");
        ProgramLogger.getProgramLogger().addLogInfo("B");
        ProgramLogger.getProgramLogger().addLogInfo("C");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
