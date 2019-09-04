package net.brcdev.auctiongui.auction;

import org.bukkit.OfflinePlayer;

import java.util.UUID;

public interface Bid {

  UUID getBidderUuid();

  void setBidderUuid(UUID bidderUuid);

  String getBidderName();

  void setBidderName(String bidderName);

  double getAmount();

  void setAmount(double amount);

  long getTimestamp();

  void setTimestamp(long timestamp);

  OfflinePlayer getBidder();
}
