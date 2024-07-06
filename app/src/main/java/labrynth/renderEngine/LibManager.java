package labrynth.renderEngine;

import java.io.File;

import org.lwjgl.LWJGLUtil;

public class LibManager {
    public static void setLibPath() {
        File libPath;

        switch (LWJGLUtil.getPlatform()) {
            case LWJGLUtil.PLATFORM_WINDOWS:
                libPath = new File("./native/windows/");
                break;
            case LWJGLUtil.PLATFORM_LINUX:
                libPath = new File("./native/linux/");
                break;
            case LWJGLUtil.PLATFORM_MACOSX:
                libPath = new File("./native/macosx/");
                break;
            default:
                libPath = new File("");
                break;
        }

        System.setProperty("org.lwjgl.librarypath", libPath.getAbsolutePath());
    }
}
