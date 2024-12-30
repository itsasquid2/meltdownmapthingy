package mc.miniMCC;

import com.destroystokyo.paper.event.server.ServerTickStartEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.MapInitializeEvent;
import org.bukkit.inventory.meta.MapMeta;
import org.bukkit.map.MapCursor;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;

/*
public class meltdownmap implements Listener {
    @EventHandler
    public void onMapInitialize(MapInitializeEvent event){
        MapView mapView = event.getMap();
        mapView.setScale(MapView.Scale.CLOSEST);
        for (MapRenderer mapRenderer : mapView.getRenderers()){
            mapView.removeRenderer(mapRenderer);
        }
        mapView.addRenderer(new mapRenderer());

    }
}
*/