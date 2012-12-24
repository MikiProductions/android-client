package com.pokebros.android.pokemononline.player;

import com.pokebros.android.pokemononline.Bais;
import com.pokebros.android.pokemononline.Baos;
import com.pokebros.android.pokemononline.SerializeBytes;

// Short version of a player, only nick and info
public class BasicPlayerInfo implements SerializeBytes {
	public String nick = "", info = "";
	
	public BasicPlayerInfo(Bais msg) {
		nick = msg.readString();
		info = msg.readString();
	}
	
	public void serializeBytes(Baos b) {
		b.putString(nick);
		b.putString(info);
	}
}