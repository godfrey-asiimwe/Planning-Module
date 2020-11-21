package com.Planning.client.presenters;

import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;
import com.smartgwt.client.widgets.menu.MenuItem;
import com.smartgwt.client.widgets.menu.events.MenuItemClickEvent;

public class MainPagePresenter extends Presenter<MainPagePresenter.MyView, MainPagePresenter.MyProxy> {
	
	@Inject
	private PlaceManager placeManager;
	
	
	@ContentSlot
	public static Type<RevealContentHandler<?>> TYPE_SetContextAreaContent = new Type<RevealContentHandler<?>>();

	public interface MyView extends View {
		MenuItem getplanningPeriodItem();
		MenuItem getProcurementPlanItem();
	}

	@ProxyCodeSplit
	public interface MyProxy extends Proxy<MainPagePresenter> {
	}

	@Inject
	public MainPagePresenter(final EventBus eventBus, final MyView view, final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
	}

	@Override
	protected void onBind() {
		super.onBind();
		ApplicationControlResponse();
	}

	private void ApplicationControlResponse() {
		
		getView().getProcurementPlanItem().addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {

			public void onClick(MenuItemClickEvent event) {
				PlaceRequest request = new PlaceRequest(event.getItem().getTitle());
				placeManager.revealPlace(request);
			}

		});
		
		getView().getplanningPeriodItem().addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {

			public void onClick(MenuItemClickEvent event) {
				PlaceRequest request = new PlaceRequest(event.getItem().getTitle());
				placeManager.revealPlace(request);
			}

		});
	}

}
