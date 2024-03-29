package fr.newzaz.armacore.chat;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AnnonceChat implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {


        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (cmd.getName().equalsIgnoreCase("an")) {
                if(player.hasPermission("essentials.broadcast")) {
                    if (args.length == 0) {
                        player.sendMessage("§4[§cArmaCommand§4] §cUsage : /an <message>");
                    }

                    if (args.length >= 1) {

                        StringBuilder bc = new StringBuilder();
                        for (String part : args) {
                            bc.append(part + " ");
                        }


                        Bukkit.broadcastMessage("§c[Annonce] §9" + bc.toString());

                    }
                }
            }
        }

        return true;

    }
}
