package com.Planning.client.gin;

import com.Planning.client.place.ClientPlaceManager;
import com.Planning.client.place.DefaultPlace;
import com.Planning.client.place.NameTokens;
import com.Planning.client.presenters.MainPagePresenter;
import com.Planning.client.presenters.MainPageView;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.Planning.client.presenters.PlanningPeriodPresenter;
import com.Planning.client.presenters.PlanningPeriodView;
import com.Planning.client.presenters.ProcurementPlanPresenter;
import com.Planning.client.presenters.ProcurementPlanView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		
		// TODO Auto-generated method stub
		install(new DefaultModule(ClientPlaceManager.class));
		
		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.planningperiod);

		bindPresenter(MainPagePresenter.class, MainPagePresenter.MyView.class, MainPageView.class, MainPagePresenter.MyProxy.class);

		

		bindPresenter(PlanningPeriodPresenter.class,
				PlanningPeriodPresenter.MyView.class, PlanningPeriodView.class,
				PlanningPeriodPresenter.MyProxy.class);

		bindPresenter(ProcurementPlanPresenter.class,
				ProcurementPlanPresenter.MyView.class,
				ProcurementPlanView.class,
				ProcurementPlanPresenter.MyProxy.class);
	}

}