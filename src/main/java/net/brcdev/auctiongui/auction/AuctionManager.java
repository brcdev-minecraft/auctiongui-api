package net.brcdev.auctiongui.auction;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public interface AuctionManager {

  boolean areAuctionsLoaded();

  ArrayList<Auction> getAllAuctions();

  Auction getAuction(int id);

  List<Auction> getAuctions(AuctionState... status);

  List<Auction> getAuctionsStartedBy(OfflinePlayer player, AuctionState... status);

  List<Auction> getRunningAuctionsInProgress();

  List<Auction> getOwnAuctions(OfflinePlayer player);

  List<Auction> getUnclaimedItems(OfflinePlayer player);

  List<Auction> getWonItems(OfflinePlayer player);

  List<Auction> getAuctionsTakingPartIn(OfflinePlayer player);

  void startAuction(Player player, AuctionStartingParams params);

  void startAuction(final Player player, int quantity, double price, double increment, long duration);

  void endAuction(Auction auction, boolean broadcast);

  void bid(Player player, final Auction auction, double bid, boolean openResultGui);

  void cancelAuctionByOwner(Player player, final Auction auction);

  void cancelAuctionByAdmin(Player player, final Auction auction);

  void claimUnclaimed(Player player, final Auction auction);

  void claimWon(Player player, Auction auction);

  void removeAuction(Auction auction);
}
