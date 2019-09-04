package net.brcdev.auctiongui.auction;

import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;

public interface Auction {

  int getId();

  void setId(int id);

  UUID getOwnerUuid();

  void setOwnerUuid(UUID ownerUuid);

  AuctionState getState();

  void setState(AuctionState state);

  long getStartTimestamp();

  void setStartTimestamp(long startTimestamp);

  long getEndTimestamp();

  void setEndTimestamp(long endTimestamp);

  ItemStack getItemStack();

  void setItemStack(ItemStack itemStack);

  double getStartingPrice();

  void setStartingPrice(double startingPrice);

  double getCurrentPrice();

  void setCurrentPrice(double currentPrice);

  double getIncrement();

  void setIncrement(double increment);

  ArrayList<Bid> getBids();

  void setBids(ArrayList<Bid> bids);

  Bid getHighestBid();

  boolean hasBids();

  UUID getBuyerUuid();

  void setBuyerUuid(UUID buyerUuid);

  OfflinePlayer getOwner();

  String getOwnerName();

  OfflinePlayer getBuyer();

  String getBuyerName();

  boolean hasBuyer();

  String getHighestBidBidderName();

  Set<OfflinePlayer> getBidders();

  String formatPlaceholders(String str);

  void save();

  void sendMessage(AuctionNotificationScope messageScope, String msg);
}
