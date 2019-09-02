package net.brcdev.auctiongui;

public class AuctionGuiPlusApi {

  private static AuctionGuiPlugin auctionGuiPlugin;

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
