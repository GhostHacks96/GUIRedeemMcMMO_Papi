package com.ghosthacks96.Mcmmo_GUI_Redeem.papi;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import me.clip.placeholderapi.PlaceholderAPIPlugin;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.ghosthacks96.Mcmmo_GUI_redeem.MainFile;
import com.ghosthacks96.Mcmmo_GUI_redeem.papi;







public class GUIRedeemMcMMOExpansion
  extends PlaceholderExpansion
{
  public boolean canRegister() { return (Bukkit.getPluginManager().getPlugin(getPlugin()) != null); }



  
  public String getAuthor() { return "GhostHacks96"; }



  
  public String getIdentifier() { return "gui_redeem_mcmmo"; }



  
  public String getPlugin() { return "GUIRedeemMcMMO"; }



  
  public String getVersion() { return "1.0"; }


  
  public String onPlaceholderRequest(Player p, String identifier) {
	  papi holder = MainFile.holders;
		return holder.onPlaceholderRequest(p, identifier);
  }

}
