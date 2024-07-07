package labrynth.game;

import org.lwjgl.opengl.Display;

import labrynth.renderEngine.DisplayManager;
import labrynth.renderEngine.LibManager;
import labrynth.renderEngine.Loader;
import labrynth.renderEngine.RawModel;
import labrynth.renderEngine.Renderer;

public class MainGameLoop {
    public static void main(String[] args) {
        LibManager.setLibPath();
        DisplayManager.createDisplay();

        Loader loader = new Loader();
        Renderer renderer = new Renderer();

        float[] vertices = {
                -0.5f, 0.5f, 0f,
                -0.5f, -0.5f, 0f,
                0.5f, -0.5f, 0f,
                0.5f, -0.5f, 0f,
                0.5f, 0.5f, 0f,
                -0.5f, 0.5f, 0f
        };

        RawModel model = loader.loadToVAO(vertices);

        while (!Display.isCloseRequested()) {
            renderer.prepare();
            renderer.render(model);
            DisplayManager.updateDisplay();
        }

        loader.cleanUp();
        DisplayManager.closeDisplay();
    }
}
