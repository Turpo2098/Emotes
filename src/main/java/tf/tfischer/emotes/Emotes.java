package tf.tfischer.emotes;

import org.bukkit.plugin.java.JavaPlugin;
import tf.tfischer.emotes.commands.Disable;
import tf.tfischer.emotes.commands.InterfaceInteraction;
import tf.tfischer.emotes.commands.WaitingTime;
import tf.tfischer.emotes.interactions.*;

import java.util.List;

public final class Emotes extends JavaPlugin {
    private List<InterfaceInteraction> interactions = List.of(  new Bonk(),new Hug(), new Patting(), new Stare(), new Lick(),
                                                                new Cuddle(), new Yeet());
    @Override
    public void onEnable() {
        interactions.forEach(interaction -> getCommand(interaction.command()).setExecutor(interaction));

        getCommand("disableinteractions").setExecutor(new Disable());
        getCommand("waitingtime").setExecutor(new WaitingTime());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
