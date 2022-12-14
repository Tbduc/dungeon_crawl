package com.codecool.dungeoncrawl;

import com.codecool.dungeoncrawl.logic.Drawable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import java.util.HashMap;
import java.util.Map;


public class Tiles {
    public static int TILE_WIDTH = 32;

    private static Image tileset = new Image("/tiles.png", 543 * 2, 543 * 2, true, false);
    private static Map<String, Tile> tileMap = new HashMap<>();
    public static class Tile {
        public final int x, y, w, h;
        Tile(int i, int j) {
            x = i * (TILE_WIDTH + 2);
            y = j * (TILE_WIDTH + 2);
            w = TILE_WIDTH;
            h = TILE_WIDTH;
        }
    }

    static {
        tileMap.put("empty", new Tile(0, 0));
        tileMap.put("wall", new Tile(10, 17));
        tileMap.put("floor", new Tile(2, 0));
        tileMap.put("player", new Tile(30, 0));
        tileMap.put("skeleton", new Tile(29, 6));
        tileMap.put("lich", new Tile(29, 1));
        tileMap.put("openDoor", new Tile(9, 16));
        tileMap.put("key", new Tile(16, 23));
        tileMap.put("weapon", new Tile(1, 30));
        tileMap.put("axe", new Tile(10, 30));
        tileMap.put("food", new Tile(17, 28));
        tileMap.put("water", new Tile(8, 4));
        tileMap.put("bridge", new Tile(3, 3));
        tileMap.put("octopus", new Tile(25, 8));
        tileMap.put("door", new Tile(10, 9));
        tileMap.put("spider", new Tile(30, 5));
        tileMap.put("skull", new Tile(0, 15));
        tileMap.put("stairs", new Tile(2, 6));
        tileMap.put("crown", new Tile(11, 24));
        tileMap.put("darkLord", new Tile(24, 7));
        tileMap.put("phantom", new Tile(26, 6));
        tileMap.put("poison", new Tile(15, 29));
        tileMap.put("shield", new Tile(2, 23));
        tileMap.put("ladder", new Tile(21,1));
        tileMap.put("portal", new Tile(31,12));
    }

    public static void drawTile(GraphicsContext context, Drawable d, int x, int y) {
        Tile tile = tileMap.get(d.getTileName());
        context.drawImage(tileset, tile.x, tile.y, tile.w, tile.h,
                x * TILE_WIDTH, y * TILE_WIDTH, TILE_WIDTH, TILE_WIDTH);
    }
}
