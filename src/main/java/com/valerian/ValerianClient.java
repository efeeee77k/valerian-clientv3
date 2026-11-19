src/main/java/com/valerian/ValerianClient.java
  package com.valerian;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValerianClient implements ModInitializer {
	public static final String MOD_ID = "valerian";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Valerian Client initialized!");
	}
}
