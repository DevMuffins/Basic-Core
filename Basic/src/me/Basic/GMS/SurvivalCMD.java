package me.Basic.GMS;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SurvivalCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&dGamemode has been updated! &8(&aSurvival Mode&8)"));
        }
        else {
            sender.sendMessage("Console cannot execute this command!");
        }
        return true;
    }
}