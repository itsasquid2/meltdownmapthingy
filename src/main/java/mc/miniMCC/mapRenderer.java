package mc.miniMCC;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.map.*;
import org.jetbrains.annotations.NotNull;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import static java.lang.Math.floor;
import static java.lang.Math.round;

public class mapRenderer extends MapRenderer {
    private Boolean imagePut = false;

    @Override
    public void render(@NotNull MapView mapView, @NotNull MapCanvas mapCanvas, @NotNull Player player) {
        if (!imagePut){
            try {
                BufferedImage image = ImageIO.read(new URL("https://i.ibb.co/8NWJMMW/pixil-frame-0-2.png"));
                mapCanvas.drawImage(0, 0, image);
            } catch (IOException e) {
                player.getInventory().clear();
                player.sendMessage(ChatColor.RED + "The image couldn't be loaded. This is likely due to a 403 error.");
                return;
            }
            imagePut = true;
        }

        MapCursorCollection mapCursorCollection = new MapCursorCollection();
        if (player.getLocation().getYaw() >= 0) {
            mapCursorCollection.addCursor((int) ((player.getX()+998)*0.546), (int) ((player.getZ()+998)*0.546), (byte) round(((player.getLocation().getYaw()) / 22.5)), (byte) 0);
        }else if (round(((player.getLocation().getYaw()+360) / 22.5)) != 16){
            mapCursorCollection.addCursor((int) ((player.getX()+998)*0.546), (int) ((player.getZ()+998)*0.546), (byte) round(((player.getLocation().getYaw()+360) / 22.5)), (byte) 0);
        }else{
            mapCursorCollection.addCursor((int) ((player.getX()+998)*0.546), (int) ((player.getZ()+998)*0.546), (byte) 0, (byte) 0);
        }
        mapCanvas.setCursors(mapCursorCollection);
    }
}
