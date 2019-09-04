package net.brcdev.auctiongui.event;

import net.brcdev.auctiongui.auction.Auction;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public abstract class AuctionEndEvent extends Event {

  private static final HandlerList handlers = new HandlerList();

  public static HandlerList getHandlerList() {
    return handlers;
  }

  @Override
  public HandlerList getHandlers() {
    return handlers;
  }

  public abstract Auction getAuction();
}
