package com.isamoilovs.mygdx.game.screens;

import com.badlogic.gdx.Screen;
import com.isamoilovs.mygdx.game.screens.ScreenManager;

public abstract class AbstractScreen implements Screen {
    @Override
    public void resize(int width, int height) {
        ScreenManager.getInstance().resize(width, height);
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }
}