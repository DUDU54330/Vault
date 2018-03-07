package net.milkbowl.vault;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class TransactionSucsesssEvent extends Event {

	OfflinePlayer p;

	private static final HandlerList handlers = new HandlerList();

	public TransactionSucsesssEvent(OfflinePlayer player) {
		this.p = player;
	}

	public OfflinePlayer getOfflinePlayer() {
		return p;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

}
