package me.crus3r.cadiacore2;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import me.crus3r.cadiacore2.commands.FlyCommand;
import me.crus3r.cadiacore2.commands.GamemodeCommand;
import me.crus3r.cadiacore2.commands.HealCommand;

public class CadiaCore2 extends JavaPlugin{

	public final Logger logger = Logger.getLogger("Minecraft");
	public static CadiaCore2 plugin;
	
	@Override
	public void onEnable() {
			
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "--------------------oOo--------------------\n\nCadiaCore2 Loaded.\n\n--------------------oOo--------------------");
		this.getCommand("heal").setExecutor((CommandExecutor)new HealCommand());
		this.getCommand("fly").setExecutor((CommandExecutor)new FlyCommand());
		gamemodeCmd();
	}
	
	@Override
	public void onDisable() {
		
		PluginDescriptionFile pdfFile = this.getDescription();
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "--------------------oOo--------------------\n\nCadiaCore2 Disabled..\n\n--------------------oOo--------------------");
		
	}
	
	public void gamemodeCmd() {
		
		this.getCommand("gamemode 1").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gmc").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gamemode creative").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gm 1").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gm c").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gamemode 0").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gms").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gamemode survival").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gm 0").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gm s").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gamemode 2").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gma").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gamemode adventure").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gm 2").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gm a").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gamemode 3").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gmsp").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gamemode spectator").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gm 3").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gm sp").setExecutor((CommandExecutor)new GamemodeCommand());
		
		
	}
	
}
