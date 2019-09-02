package net.brcdev.auctiongui;

import net.brcdev.auctiongui.core.BConfig;
import net.brcdev.auctiongui.database.DataManager;
import net.brcdev.auctiongui.player.PlayerManager;

public interface AuctionGuiPlugin {
  BConfig getConfigLang();

  BConfig getConfigMain();

  BConfig getConfigMenu();

  BConfig getConfigCategories();

  DataManager getDataManager();

  PlayerManager getPlayerManager();
}
