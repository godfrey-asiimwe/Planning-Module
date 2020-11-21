package com.Planning.client;

import com.Planning.client.gin.ClientGinjector;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.DelayedBindRegistry;

public class Planning implements EntryPoint {

	private final ClientGinjector ginjector = GWT.create(ClientGinjector.class);

	public void onModuleLoad() {
		DelayedBindRegistry.bind(ginjector);

		ginjector.getPlaceManager().revealCurrentPlace();
	}
	
}
