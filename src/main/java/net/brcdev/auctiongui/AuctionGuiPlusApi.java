package net.brcdev.auctiongui;

import net.brcdev.auctiongui.auction.AuctionManager;

public class AuctionGuiPlusApi {

  private static AuctionGuiPlugin auctionGuiPlugin;

  /**
   * Returns the instance of {@link AuctionManager} which can be used
   * to tamper with any of the auctions present on the server
   *
   * @return auction manager instance
   */
  public static AuctionManager getAuctionManager() {
    return auctionGuiPlugin.getAuctionManager();
  }

  /**
   * Returns the instance of AuctionGUI+'s main class
   *
   * @return AuctionGUI+ main class instance
   */
  public static AuctionGuiPlugin getPlugin() {
    return auctionGuiPlugin;
  }

  static void setPlugin(AuctionGuiPlugin instance) {
    auctionGuiPlugin = instance;
  }
}
