package net.brcdev.auctiongui.auction;

import org.bukkit.inventory.ItemStack;

public interface AuctionStartingParams {

  ItemStack getItemStack();

  void setItemStack(ItemStack itemStack);

  int getQuantity();

  void setQuantity(int quantity);

  int getPrice();

  void setPrice(int price);

  int getIncrement();

  void setIncrement(int increment);

  int getDuration();

  void setDuration(int duration);
}
