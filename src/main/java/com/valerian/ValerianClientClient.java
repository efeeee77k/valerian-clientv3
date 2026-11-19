src/main/java/com/valerian/ValerianClientClient.java
  package com.valerian;

import net.fabricmc.api.ClientModInitializer;

public class ValerianClientClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ValerianClient.LOGGER.info("Valerian Client (client side) initialized!");
	}
}
