package net.brcdev.auctiongui.event;

import net.brcdev.auctiongui.auction.Auction;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public abstract class AuctionPreStartEvent extends Event implements Cancellable {

  private static final HandlerList handlers = new HandlerList();

  public static HandlerList getHandlerList() {
    return handlers;
  }

  @Override
  public HandlerList getHandlers() {
    return handlers;
  }

  @Override
  public abstract boolean isCancelled();

  @Override
  public abstract void setCancelled(boolean cancel);

  public abstract Auction getAuction();

  public abstract Player getPlayer();
}
