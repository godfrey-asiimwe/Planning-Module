package com.Planning.client.gin;

import com.Planning.client.presenters.MainPagePresenter;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.google.gwt.inject.client.AsyncProvider;
import com.Planning.client.presenters.PlanningPeriodPresenter;
import com.Planning.client.presenters.ProcurementPlanPresenter;

@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {
	PlaceManager getPlaceManager();

	EventBus getEventBus();

	AsyncProvider<MainPagePresenter> getMainPagePresenter();

	AsyncProvider<PlanningPeriodPresenter> getPlanningPeriodPresenter();

	AsyncProvider<ProcurementPlanPresenter> getProcurementPlanPresenter();

}
