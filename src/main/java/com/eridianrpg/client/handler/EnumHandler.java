package com.eridianrpg.client.handler;

import net.minecraft.util.IStringSerializable;

public class EnumHandler {
	
	public static enum SugarcaneType implements IStringSerializable {
		BALE("bale", 0),
		BLOCK("block", 1);

		private int ID;
		private String name;
		
		private SugarcaneType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
		
	}

}
