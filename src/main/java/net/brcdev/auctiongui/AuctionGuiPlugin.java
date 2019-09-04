package net.brcdev.auctiongui;

import net.brcdev.auctiongui.auction.AuctionManager;
import net.brcdev.auctiongui.category.CategoryManager;
import net.brcdev.auctiongui.core.BConfig;
import net.brcdev.auctiongui.database.DataManager;
import net.brcdev.auctiongui.menu.MenuManager;
import net.brcdev.auctiongui.player.PlayerManager;

public interface AuctionGuiPlugin {
  BConfig getConfigLang();

  BConfig getConfigMain();

  BConfig getConfigMenu();

  BConfig getConfigCategories();

  AuctionManager getAuctionManager();

  CategoryManager getCategoryManager();

  DataManager getDataManager();

  MenuManager getMenuManager();

  PlayerManager getPlayerManager();
}
