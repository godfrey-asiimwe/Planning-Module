package com.Planning.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.Planning.server.PlanningActionHandler;
import com.Planning.shared.Planning;
import com.gwtplatform.dispatch.server.actionvalidator.ActionValidator;
import com.gwtplatform.dispatch.server.spring.HandlerModule;
import com.gwtplatform.dispatch.server.spring.actionvalidator.DefaultActionValidator;
import com.gwtplatform.dispatch.server.spring.configuration.DefaultModule;
import com.planetsystems.ui.utils.utils_ui.server.UtilActionHandler;
import com.planetsystems.ui.utils.utils_ui.shared.Util;

@Configuration
@Import(DefaultModule.class)
public class ServerModule extends HandlerModule {
	// Required
	public ServerModule() {

	}

	// Required
	@Bean
	public ActionValidator getDefaultActionValidator() {
		return new DefaultActionValidator();
	}

	@Override
	protected void configureHandlers() {

		bindHandler(Planning.class, PlanningActionHandler.class);

		bindHandler(Util.class, UtilActionHandler.class);
	}

	@Bean
	public PlanningActionHandler getPrequalificationActionHandler() {
		return new PlanningActionHandler();
	}
	
	/* utils integration */
	@Bean
	public UtilActionHandler getUtilActionHandler() {
		return new UtilActionHandler();
	}


}
