package labrynth.game;

import org.lwjgl.opengl.Display;

import labrynth.renderEngine.DisplayManager;
import labrynth.renderEngine.LibManager;

public class MainGameLoop {
    public static void main(String[] args) {
        LibManager.setLibPath();
        DisplayManager.createDisplay();

        while (!Display.isCloseRequested()) {
            DisplayManager.updateDisplay();
        }

        DisplayManager.closeDisplay();
    }
}
