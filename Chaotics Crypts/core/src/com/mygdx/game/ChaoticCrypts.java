package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class ChaoticCrypts extends Game {
	private static final int WORLD_HEIGHT = 500;
    private static final int WORLD_WIDTH = 500;

    private OrthographicCamera camera;

	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		int width = Gdx.graphics.getWidth();
        int height = Gdx.graphics.getHeight();

        System.out.println(height);
        System.out.println(width);

        camera = new OrthographicCamera(10, 10 * (height / width));

        camera.update();
		
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
		
		handleInput();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
	
	public void resize(int width, int height) {
        camera.viewportWidth = 30f;
		camera.viewportHeight = 30f * height/width;
		camera.update();
    }

    private void handleInput() {

    }

    @Override
    public void pause() {
        //Add pause screen
    }

    @Override
    public void resume() {
        //Remove pause screen
    }
}
