package com.ghosthacks96.Mcmmo_GUI_Redeem.papi;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.ghosthacks96.Mcmmo_GUI_redeem.MainFile;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;







public class GUIRedeemMcMMOExpansion
  extends PlaceholderExpansion
{
  public boolean canRegister() { 
	  return (Bukkit.getPluginManager().getPlugin(getPlugin()) != null); 
	 }	



  
  public String getAuthor() { return "GhostHacks96"; }



  
  public String getIdentifier() { return "gui_redeem_mcmmo"; }



  
  public String getPlugin() { return "GUIRedeemMcMMO"; }



  
  public String getVersion() { return "1.0"; }
  
  MainFile plugin;
  public boolean register(){
	  
      // Make sure "SomePlugin" is on the server
      if(!canRegister()){
          return false;
      }

      /*
       * "SomePlugin" does not have static methods to access its api so we must 
       * create a variable to obtain access to it.
       */
      plugin = (MainFile) Bukkit.getPluginManager().getPlugin(getPlugin());

      // if for some reason we can not get our variable, we should return false.
      if(plugin == null){
          return false;
      }

      /*
       * Since we override the register method, we need to call the super method to actually
       * register this hook
       */
      return super.register();
  }


  
  public String onRequest(Player p, String identifier) {
	  int credits = plugin.getConfig().getInt("Storage." + p.getUniqueId() + ".Credits");
		if(credits ==0) {
			return "0";
		}
		return (new StringBuilder(String.valueOf(credits))).toString();
  }

}
