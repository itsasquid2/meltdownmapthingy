package mc.miniMCC;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.MapMeta;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;
import org.jetbrains.annotations.NotNull;

public class GetMeltdownMap implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        MapView mapView = Bukkit.createMap(Bukkit.getWorld("meltdown"));
        ItemStack itemStack = new ItemStack(Material.FILLED_MAP);
        MapMeta mapMeta = (MapMeta) itemStack.getItemMeta();
        mapMeta.setMapView(mapView);
        itemStack.setItemMeta(mapMeta);
        mapView.setScale(MapView.Scale.CLOSEST);
        for (MapRenderer mapRenderer : mapView.getRenderers()){
            mapView.removeRenderer(mapRenderer);
        }
        mapView.addRenderer(new mapRenderer());
        Player player = (Player) commandSender;
        player.getInventory().addItem(itemStack);
        return false;
    }
}
