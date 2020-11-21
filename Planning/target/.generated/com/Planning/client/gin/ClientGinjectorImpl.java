package com.Planning.client.gin;

import com.google.gwt.core.client.GWT;

public class ClientGinjectorImpl implements com.Planning.client.gin.ClientGinjector {
  public com.google.web.bindery.event.shared.EventBus getEventBus() {
    return get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$();
  }
  
  public com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.MainPagePresenter> getMainPagePresenter() {
    return get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$Planning$client$presenters$MainPagePresenter$$_annotation$$none$$();
  }
  
  public com.gwtplatform.mvp.client.proxy.PlaceManager getPlaceManager() {
    return get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$();
  }
  
  public com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.PlanningPeriodPresenter> getPlanningPeriodPresenter() {
    return get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$Planning$client$presenters$PlanningPeriodPresenter$$_annotation$$none$$();
  }
  
  public com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.ProcurementPlanPresenter> getProcurementPlanPresenter() {
    return get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$Planning$client$presenters$ProcurementPlanPresenter$$_annotation$$none$$();
  }
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.proxy.TokenFormatter declared at:
   *   com.gwtplatform.mvp.client.gin.DefaultModule.configure(DefaultModule.java:48)
   */
  private com.gwtplatform.mvp.client.proxy.TokenFormatter create_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$() {
    return get_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$();
  }
  
  private com.gwtplatform.mvp.client.proxy.TokenFormatter singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.DefaultModule.configure(DefaultModule.java:48)
   */
  private com.gwtplatform.mvp.client.proxy.TokenFormatter get_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$() {
    if (singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$ == null) {
      singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$ = create_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$();
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.shared.SecurityCookieAccessor declared at:
   *   com.gwtplatform.dispatch.client.gin.DispatchAsyncModule.configure(DispatchAsyncModule.java:180)
   */
  private com.gwtplatform.dispatch.shared.SecurityCookieAccessor create_Key$type$com$gwtplatform$dispatch$shared$SecurityCookieAccessor$_annotation$$none$$() {
    return get_Key$type$com$gwtplatform$dispatch$client$DefaultSecurityCookieAccessor$_annotation$$none$$();
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.shared.SecurityCookieAccessor declared at:
   *   com.gwtplatform.dispatch.client.gin.DispatchAsyncModule.configure(DispatchAsyncModule.java:180)
   */
  private com.gwtplatform.dispatch.shared.SecurityCookieAccessor get_Key$type$com$gwtplatform$dispatch$shared$SecurityCookieAccessor$_annotation$$none$$() {
    return create_Key$type$com$gwtplatform$dispatch$shared$SecurityCookieAccessor$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.Planning.client.presenters.MainPagePresenter$MyProxy declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
   */
  private void memberInject_Key$type$com$Planning$client$presenters$MainPagePresenter$MyProxy$_annotation$$none$$(com.Planning.client.presenters.MainPagePresenter.MyProxy injectee) {
    
  }
  
  private com.Planning.client.presenters.MainPagePresenter.MyProxy create_Key$type$com$Planning$client$presenters$MainPagePresenter$MyProxy$_annotation$$none$$() {
    Object created = GWT.create(com.Planning.client.presenters.MainPagePresenter.MyProxy.class);
    assert created instanceof com.Planning.client.presenters.MainPagePresenter.MyProxy;
    com.Planning.client.presenters.MainPagePresenter.MyProxy result = (com.Planning.client.presenters.MainPagePresenter.MyProxy) created;
    
    memberInject_Key$type$com$Planning$client$presenters$MainPagePresenter$MyProxy$_annotation$$none$$(result);
    return result;
  }
  
  private com.Planning.client.presenters.MainPagePresenter.MyProxy singleton_Key$type$com$Planning$client$presenters$MainPagePresenter$MyProxy$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
   */
  private com.Planning.client.presenters.MainPagePresenter.MyProxy get_Key$type$com$Planning$client$presenters$MainPagePresenter$MyProxy$_annotation$$none$$() {
    if (singleton_Key$type$com$Planning$client$presenters$MainPagePresenter$MyProxy$_annotation$$none$$ == null) {
      singleton_Key$type$com$Planning$client$presenters$MainPagePresenter$MyProxy$_annotation$$none$$ = create_Key$type$com$Planning$client$presenters$MainPagePresenter$MyProxy$_annotation$$none$$();
    }
    return singleton_Key$type$com$Planning$client$presenters$MainPagePresenter$MyProxy$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.Planning.client.presenters.PlanningPeriodPresenter declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:123)
   */
  private native void com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection(com.gwtplatform.mvp.client.HandlerContainerImpl injectee, com.gwtplatform.mvp.client.AutobindDisable _0) /*-{
    injectee.@com.gwtplatform.mvp.client.HandlerContainerImpl::automaticBind(Lcom/gwtplatform/mvp/client/AutobindDisable;)(_0);
  }-*/;
  
  private native void com$Planning$client$presenters$PlanningPeriodPresenter_placeManager_fieldInjection(com.Planning.client.presenters.PlanningPeriodPresenter injectee, com.gwtplatform.mvp.client.proxy.PlaceManager value) /*-{
    injectee.@com.Planning.client.presenters.PlanningPeriodPresenter::placeManager = value;
  }-*/;
  
  private void memberInject_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$_annotation$$none$$(com.Planning.client.presenters.PlanningPeriodPresenter injectee) {
    com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection(injectee, get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    com$Planning$client$presenters$PlanningPeriodPresenter_placeManager_fieldInjection(injectee, get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$());
    
  }
  
  private com.Planning.client.presenters.PlanningPeriodPresenter com$Planning$client$presenters$PlanningPeriodPresenter_PlanningPeriodPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.Planning.client.presenters.PlanningPeriodPresenter.MyView _1, com.Planning.client.presenters.PlanningPeriodPresenter.MyProxy _2, com.gwtplatform.dispatch.shared.DispatchAsync _3, com.gwtplatform.mvp.client.proxy.PlaceManager _4) {
    return new com.Planning.client.presenters.PlanningPeriodPresenter(_0, _1, _2, _3, _4);
  }
  
  private com.Planning.client.presenters.PlanningPeriodPresenter create_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$_annotation$$none$$() {
    com.Planning.client.presenters.PlanningPeriodPresenter result = com$Planning$client$presenters$PlanningPeriodPresenter_PlanningPeriodPresenter_methodInjection(get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$MyView$_annotation$$none$$(), get_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$MyProxy$_annotation$$none$$(), get_Key$type$com$gwtplatform$dispatch$shared$DispatchAsync$_annotation$$none$$(), get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$());
    memberInject_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$_annotation$$none$$(result);
    return result;
  }
  
  private com.Planning.client.presenters.PlanningPeriodPresenter singleton_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:123)
   */
  private com.Planning.client.presenters.PlanningPeriodPresenter get_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$_annotation$$none$$() {
    if (singleton_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$_annotation$$none$$ == null) {
      singleton_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$_annotation$$none$$ = create_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$_annotation$$none$$();
    }
    return singleton_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.MainPagePresenter> declared at:
   *   Implicit binding for Key[type=com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.MainPagePresenter>, annotation=[none]]
   */
  private com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.MainPagePresenter> create_Key$type$com$google$gwt$inject$client$AsyncProvider$com$Planning$client$presenters$MainPagePresenter$$_annotation$$none$$() {
    return new com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.MainPagePresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<com.Planning.client.presenters.MainPagePresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$Planning$client$presenters$MainPagePresenter$_annotation$$none$$()); 
            }
            public void onFailure(Throwable ex) { 
               callback.onFailure(ex); 
            } 
        }); 
        }
     };
    
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.MainPagePresenter> declared at:
   *   Implicit binding for Key[type=com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.MainPagePresenter>, annotation=[none]]
   */
  private com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.MainPagePresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$Planning$client$presenters$MainPagePresenter$$_annotation$$none$$() {
    return create_Key$type$com$google$gwt$inject$client$AsyncProvider$com$Planning$client$presenters$MainPagePresenter$$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.Planning.client.presenters.MainPagePresenter declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:123)
   */
  private native void com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_(com.gwtplatform.mvp.client.HandlerContainerImpl injectee, com.gwtplatform.mvp.client.AutobindDisable _0) /*-{
    injectee.@com.gwtplatform.mvp.client.HandlerContainerImpl::automaticBind(Lcom/gwtplatform/mvp/client/AutobindDisable;)(_0);
  }-*/;
  
  private native void com$Planning$client$presenters$MainPagePresenter_placeManager_fieldInjection(com.Planning.client.presenters.MainPagePresenter injectee, com.gwtplatform.mvp.client.proxy.PlaceManager value) /*-{
    injectee.@com.Planning.client.presenters.MainPagePresenter::placeManager = value;
  }-*/;
  
  private void memberInject_Key$type$com$Planning$client$presenters$MainPagePresenter$_annotation$$none$$(com.Planning.client.presenters.MainPagePresenter injectee) {
    com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_(injectee, get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    com$Planning$client$presenters$MainPagePresenter_placeManager_fieldInjection(injectee, get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$());
    
  }
  
  private com.Planning.client.presenters.MainPagePresenter com$Planning$client$presenters$MainPagePresenter_MainPagePresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.Planning.client.presenters.MainPagePresenter.MyView _1, com.Planning.client.presenters.MainPagePresenter.MyProxy _2) {
    return new com.Planning.client.presenters.MainPagePresenter(_0, _1, _2);
  }
  
  private com.Planning.client.presenters.MainPagePresenter create_Key$type$com$Planning$client$presenters$MainPagePresenter$_annotation$$none$$() {
    com.Planning.client.presenters.MainPagePresenter result = com$Planning$client$presenters$MainPagePresenter_MainPagePresenter_methodInjection(get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$Planning$client$presenters$MainPagePresenter$MyView$_annotation$$none$$(), get_Key$type$com$Planning$client$presenters$MainPagePresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$com$Planning$client$presenters$MainPagePresenter$_annotation$$none$$(result);
    return result;
  }
  
  private com.Planning.client.presenters.MainPagePresenter singleton_Key$type$com$Planning$client$presenters$MainPagePresenter$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:123)
   */
  private com.Planning.client.presenters.MainPagePresenter get_Key$type$com$Planning$client$presenters$MainPagePresenter$_annotation$$none$$() {
    if (singleton_Key$type$com$Planning$client$presenters$MainPagePresenter$_annotation$$none$$ == null) {
      singleton_Key$type$com$Planning$client$presenters$MainPagePresenter$_annotation$$none$$ = create_Key$type$com$Planning$client$presenters$MainPagePresenter$_annotation$$none$$();
    }
    return singleton_Key$type$com$Planning$client$presenters$MainPagePresenter$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.PlanningPeriodPresenter> declared at:
   *   Implicit binding for Key[type=com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.PlanningPeriodPresenter>, annotation=[none]]
   */
  private com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.PlanningPeriodPresenter> create_Key$type$com$google$gwt$inject$client$AsyncProvider$com$Planning$client$presenters$PlanningPeriodPresenter$$_annotation$$none$$() {
    return new com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.PlanningPeriodPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<com.Planning.client.presenters.PlanningPeriodPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$_annotation$$none$$()); 
            }
            public void onFailure(Throwable ex) { 
               callback.onFailure(ex); 
            } 
        }); 
        }
     };
    
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.PlanningPeriodPresenter> declared at:
   *   Implicit binding for Key[type=com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.PlanningPeriodPresenter>, annotation=[none]]
   */
  private com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.PlanningPeriodPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$Planning$client$presenters$PlanningPeriodPresenter$$_annotation$$none$$() {
    return create_Key$type$com$google$gwt$inject$client$AsyncProvider$com$Planning$client$presenters$PlanningPeriodPresenter$$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.gwtplatform.dispatch.shared.DispatchAsync declared at:
   *   protected com.gwtplatform.dispatch.shared.DispatchAsync com.gwtplatform.dispatch.client.gin.DispatchAsyncModule.provideDispatchAsync(com.gwtplatform.dispatch.client.ExceptionHandler,com.gwtplatform.dispatch.shared.SecurityCookieAccessor,com.gwtplatform.dispatch.client.actionhandler.ClientActionHandlerRegistry)
   */
  private native com.gwtplatform.dispatch.shared.DispatchAsync com$gwtplatform$dispatch$client$gin$DispatchAsyncModule_provideDispatchAsync_methodInjection(com.gwtplatform.dispatch.client.gin.DispatchAsyncModule injectee, com.gwtplatform.dispatch.client.ExceptionHandler _0, com.gwtplatform.dispatch.shared.SecurityCookieAccessor _1, com.gwtplatform.dispatch.client.actionhandler.ClientActionHandlerRegistry _2) /*-{
    return injectee.@com.gwtplatform.dispatch.client.gin.DispatchAsyncModule::provideDispatchAsync(Lcom/gwtplatform/dispatch/client/ExceptionHandler;Lcom/gwtplatform/dispatch/shared/SecurityCookieAccessor;Lcom/gwtplatform/dispatch/client/actionhandler/ClientActionHandlerRegistry;)(_0, _1, _2);
  }-*/;
  
  private com.gwtplatform.dispatch.shared.DispatchAsync create_Key$type$com$gwtplatform$dispatch$shared$DispatchAsync$_annotation$$none$$() {
    return com$gwtplatform$dispatch$client$gin$DispatchAsyncModule_provideDispatchAsync_methodInjection(new com.gwtplatform.dispatch.client.gin.DispatchAsyncModule(), get_Key$type$com$gwtplatform$dispatch$client$ExceptionHandler$_annotation$$none$$(), get_Key$type$com$gwtplatform$dispatch$shared$SecurityCookieAccessor$_annotation$$none$$(), get_Key$type$com$gwtplatform$dispatch$client$actionhandler$ClientActionHandlerRegistry$_annotation$$none$$());
  }
  
  private com.gwtplatform.dispatch.shared.DispatchAsync singleton_Key$type$com$gwtplatform$dispatch$shared$DispatchAsync$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   protected com.gwtplatform.dispatch.shared.DispatchAsync com.gwtplatform.dispatch.client.gin.DispatchAsyncModule.provideDispatchAsync(com.gwtplatform.dispatch.client.ExceptionHandler,com.gwtplatform.dispatch.shared.SecurityCookieAccessor,com.gwtplatform.dispatch.client.actionhandler.ClientActionHandlerRegistry)
   */
  private com.gwtplatform.dispatch.shared.DispatchAsync get_Key$type$com$gwtplatform$dispatch$shared$DispatchAsync$_annotation$$none$$() {
    if (singleton_Key$type$com$gwtplatform$dispatch$shared$DispatchAsync$_annotation$$none$$ == null) {
      singleton_Key$type$com$gwtplatform$dispatch$shared$DispatchAsync$_annotation$$none$$ = create_Key$type$com$gwtplatform$dispatch$shared$DispatchAsync$_annotation$$none$$();
    }
    return singleton_Key$type$com$gwtplatform$dispatch$shared$DispatchAsync$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.proxy.PlaceManager declared at:
   *   com.gwtplatform.mvp.client.gin.DefaultModule.configure(DefaultModule.java:51)
   */
  private com.gwtplatform.mvp.client.proxy.PlaceManager create_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$() {
    return get_Key$type$com$Planning$client$place$ClientPlaceManager$_annotation$$none$$();
  }
  
  private com.gwtplatform.mvp.client.proxy.PlaceManager singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.DefaultModule.configure(DefaultModule.java:51)
   */
  private com.gwtplatform.mvp.client.proxy.PlaceManager get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$() {
    if (singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ == null) {
      singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ = create_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$();
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.Planning.client.presenters.PlanningPeriodView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:124)
   */
  private void memberInject_Key$type$com$Planning$client$presenters$PlanningPeriodView$_annotation$$none$$(com.Planning.client.presenters.PlanningPeriodView injectee) {
    
  }
  
  private com.Planning.client.presenters.PlanningPeriodView com$Planning$client$presenters$PlanningPeriodView_PlanningPeriodView_methodInjection() {
    return new com.Planning.client.presenters.PlanningPeriodView();
  }
  
  private com.Planning.client.presenters.PlanningPeriodView create_Key$type$com$Planning$client$presenters$PlanningPeriodView$_annotation$$none$$() {
    com.Planning.client.presenters.PlanningPeriodView result = com$Planning$client$presenters$PlanningPeriodView_PlanningPeriodView_methodInjection();
    memberInject_Key$type$com$Planning$client$presenters$PlanningPeriodView$_annotation$$none$$(result);
    return result;
  }
  
  private com.Planning.client.presenters.PlanningPeriodView singleton_Key$type$com$Planning$client$presenters$PlanningPeriodView$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:124)
   */
  private com.Planning.client.presenters.PlanningPeriodView get_Key$type$com$Planning$client$presenters$PlanningPeriodView$_annotation$$none$$() {
    if (singleton_Key$type$com$Planning$client$presenters$PlanningPeriodView$_annotation$$none$$ == null) {
      singleton_Key$type$com$Planning$client$presenters$PlanningPeriodView$_annotation$$none$$ = create_Key$type$com$Planning$client$presenters$PlanningPeriodView$_annotation$$none$$();
    }
    return singleton_Key$type$com$Planning$client$presenters$PlanningPeriodView$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry declared at:
   *   Implicit binding for Key[type=com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry, annotation=[none]]
   */
  private void memberInject_Key$type$com$gwtplatform$dispatch$client$actionhandler$DefaultClientActionHandlerRegistry$_annotation$$none$$(com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry injectee) {
    
  }
  
  private com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry create_Key$type$com$gwtplatform$dispatch$client$actionhandler$DefaultClientActionHandlerRegistry$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry.class);
    assert created instanceof com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry;
    com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry result = (com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry) created;
    
    memberInject_Key$type$com$gwtplatform$dispatch$client$actionhandler$DefaultClientActionHandlerRegistry$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry declared at:
   *   Implicit binding for Key[type=com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry, annotation=[none]]
   */
  private com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry get_Key$type$com$gwtplatform$dispatch$client$actionhandler$DefaultClientActionHandlerRegistry$_annotation$$none$$() {
    return create_Key$type$com$gwtplatform$dispatch$client$actionhandler$DefaultClientActionHandlerRegistry$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.planetsystems.ui.utils.utils_ui.client.widgets.ApplicationMenu declared at:
   *   Implicit binding for Key[type=com.planetsystems.ui.utils.utils_ui.client.widgets.ApplicationMenu, annotation=[none]]
   */
  private void memberInject_Key$type$com$planetsystems$ui$utils$utils_ui$client$widgets$ApplicationMenu$_annotation$$none$$(com.planetsystems.ui.utils.utils_ui.client.widgets.ApplicationMenu injectee) {
    
  }
  
  private com.planetsystems.ui.utils.utils_ui.client.widgets.ApplicationMenu create_Key$type$com$planetsystems$ui$utils$utils_ui$client$widgets$ApplicationMenu$_annotation$$none$$() {
    Object created = GWT.create(com.planetsystems.ui.utils.utils_ui.client.widgets.ApplicationMenu.class);
    assert created instanceof com.planetsystems.ui.utils.utils_ui.client.widgets.ApplicationMenu;
    com.planetsystems.ui.utils.utils_ui.client.widgets.ApplicationMenu result = (com.planetsystems.ui.utils.utils_ui.client.widgets.ApplicationMenu) created;
    
    memberInject_Key$type$com$planetsystems$ui$utils$utils_ui$client$widgets$ApplicationMenu$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.planetsystems.ui.utils.utils_ui.client.widgets.ApplicationMenu declared at:
   *   Implicit binding for Key[type=com.planetsystems.ui.utils.utils_ui.client.widgets.ApplicationMenu, annotation=[none]]
   */
  private com.planetsystems.ui.utils.utils_ui.client.widgets.ApplicationMenu get_Key$type$com$planetsystems$ui$utils$utils_ui$client$widgets$ApplicationMenu$_annotation$$none$$() {
    return create_Key$type$com$planetsystems$ui$utils$utils_ui$client$widgets$ApplicationMenu$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.google.web.bindery.event.shared.SimpleEventBus declared at:
   *   Implicit binding for Key[type=com.google.web.bindery.event.shared.SimpleEventBus, annotation=[none]]
   */
  private void memberInject_Key$type$com$google$web$bindery$event$shared$SimpleEventBus$_annotation$$none$$(com.google.web.bindery.event.shared.SimpleEventBus injectee) {
    
  }
  
  private com.google.web.bindery.event.shared.SimpleEventBus create_Key$type$com$google$web$bindery$event$shared$SimpleEventBus$_annotation$$none$$() {
    Object created = GWT.create(com.google.web.bindery.event.shared.SimpleEventBus.class);
    assert created instanceof com.google.web.bindery.event.shared.SimpleEventBus;
    com.google.web.bindery.event.shared.SimpleEventBus result = (com.google.web.bindery.event.shared.SimpleEventBus) created;
    
    memberInject_Key$type$com$google$web$bindery$event$shared$SimpleEventBus$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.google.web.bindery.event.shared.SimpleEventBus declared at:
   *   Implicit binding for Key[type=com.google.web.bindery.event.shared.SimpleEventBus, annotation=[none]]
   */
  private com.google.web.bindery.event.shared.SimpleEventBus get_Key$type$com$google$web$bindery$event$shared$SimpleEventBus$_annotation$$none$$() {
    return create_Key$type$com$google$web$bindery$event$shared$SimpleEventBus$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter declared at:
   *   Implicit binding for Key[type=com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter, annotation=[none]]
   */
  private void memberInject_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$(com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter injectee) {
    
  }
  
  private com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter_ParameterTokenFormatter_methodInjection() {
    return new com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter();
  }
  
  private com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter create_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$() {
    com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter result = com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter_ParameterTokenFormatter_methodInjection();
    memberInject_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter declared at:
   *   Implicit binding for Key[type=com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter, annotation=[none]]
   */
  private com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter get_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$() {
    return create_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for java.lang.String declared at:
   *   com.Planning.client.gin.ClientModule.configure(ClientModule.java:23)
   */
  private java.lang.String create_Key$type$java$lang$String$_annotation$$com$Planning$client$place$DefaultPlace$() {
    return "planningperiod";
  }
  
  
  /**
   * Binding for java.lang.String declared at:
   *   com.Planning.client.gin.ClientModule.configure(ClientModule.java:23)
   */
  private java.lang.String get_Key$type$java$lang$String$_annotation$$com$Planning$client$place$DefaultPlace$() {
    return create_Key$type$java$lang$String$_annotation$$com$Planning$client$place$DefaultPlace$();
  }
  
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.googleanalytics.GoogleAnalytics declared at:
   *   com.gwtplatform.mvp.client.gin.DefaultModule.configure(DefaultModule.java:50)
   */
  private com.gwtplatform.mvp.client.googleanalytics.GoogleAnalytics create_Key$type$com$gwtplatform$mvp$client$googleanalytics$GoogleAnalytics$_annotation$$none$$() {
    return get_Key$type$com$gwtplatform$mvp$client$googleanalytics$GoogleAnalyticsImpl$_annotation$$none$$();
  }
  
  private com.gwtplatform.mvp.client.googleanalytics.GoogleAnalytics singleton_Key$type$com$gwtplatform$mvp$client$googleanalytics$GoogleAnalytics$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.DefaultModule.configure(DefaultModule.java:50)
   */
  private com.gwtplatform.mvp.client.googleanalytics.GoogleAnalytics get_Key$type$com$gwtplatform$mvp$client$googleanalytics$GoogleAnalytics$_annotation$$none$$() {
    if (singleton_Key$type$com$gwtplatform$mvp$client$googleanalytics$GoogleAnalytics$_annotation$$none$$ == null) {
      singleton_Key$type$com$gwtplatform$mvp$client$googleanalytics$GoogleAnalytics$_annotation$$none$$ = create_Key$type$com$gwtplatform$mvp$client$googleanalytics$GoogleAnalytics$_annotation$$none$$();
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$googleanalytics$GoogleAnalytics$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.client.actionhandler.ClientActionHandlerRegistry declared at:
   *   com.gwtplatform.dispatch.client.gin.DispatchAsyncModule.configure(DispatchAsyncModule.java:181)
   */
  private com.gwtplatform.dispatch.client.actionhandler.ClientActionHandlerRegistry create_Key$type$com$gwtplatform$dispatch$client$actionhandler$ClientActionHandlerRegistry$_annotation$$none$$() {
    return get_Key$type$com$gwtplatform$dispatch$client$actionhandler$DefaultClientActionHandlerRegistry$_annotation$$none$$();
  }
  
  private com.gwtplatform.dispatch.client.actionhandler.ClientActionHandlerRegistry singleton_Key$type$com$gwtplatform$dispatch$client$actionhandler$ClientActionHandlerRegistry$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.dispatch.client.gin.DispatchAsyncModule.configure(DispatchAsyncModule.java:181)
   */
  private com.gwtplatform.dispatch.client.actionhandler.ClientActionHandlerRegistry get_Key$type$com$gwtplatform$dispatch$client$actionhandler$ClientActionHandlerRegistry$_annotation$$none$$() {
    if (singleton_Key$type$com$gwtplatform$dispatch$client$actionhandler$ClientActionHandlerRegistry$_annotation$$none$$ == null) {
      singleton_Key$type$com$gwtplatform$dispatch$client$actionhandler$ClientActionHandlerRegistry$_annotation$$none$$ = create_Key$type$com$gwtplatform$dispatch$client$actionhandler$ClientActionHandlerRegistry$_annotation$$none$$();
    }
    return singleton_Key$type$com$gwtplatform$dispatch$client$actionhandler$ClientActionHandlerRegistry$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.Planning.client.presenters.ProcurementPlanPresenter declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:123)
   */
  private native void com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection__(com.gwtplatform.mvp.client.HandlerContainerImpl injectee, com.gwtplatform.mvp.client.AutobindDisable _0) /*-{
    injectee.@com.gwtplatform.mvp.client.HandlerContainerImpl::automaticBind(Lcom/gwtplatform/mvp/client/AutobindDisable;)(_0);
  }-*/;
  
  private native void com$Planning$client$presenters$ProcurementPlanPresenter_placeManager_fieldInjection(com.Planning.client.presenters.ProcurementPlanPresenter injectee, com.gwtplatform.mvp.client.proxy.PlaceManager value) /*-{
    injectee.@com.Planning.client.presenters.ProcurementPlanPresenter::placeManager = value;
  }-*/;
  
  private void memberInject_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$_annotation$$none$$(com.Planning.client.presenters.ProcurementPlanPresenter injectee) {
    com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection__(injectee, get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    com$Planning$client$presenters$ProcurementPlanPresenter_placeManager_fieldInjection(injectee, get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$());
    
  }
  
  private com.Planning.client.presenters.ProcurementPlanPresenter com$Planning$client$presenters$ProcurementPlanPresenter_ProcurementPlanPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.Planning.client.presenters.ProcurementPlanPresenter.MyView _1, com.Planning.client.presenters.ProcurementPlanPresenter.MyProxy _2, com.gwtplatform.dispatch.shared.DispatchAsync _3, com.gwtplatform.mvp.client.proxy.PlaceManager _4) {
    return new com.Planning.client.presenters.ProcurementPlanPresenter(_0, _1, _2, _3, _4);
  }
  
  private com.Planning.client.presenters.ProcurementPlanPresenter create_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$_annotation$$none$$() {
    com.Planning.client.presenters.ProcurementPlanPresenter result = com$Planning$client$presenters$ProcurementPlanPresenter_ProcurementPlanPresenter_methodInjection(get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$MyView$_annotation$$none$$(), get_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$MyProxy$_annotation$$none$$(), get_Key$type$com$gwtplatform$dispatch$shared$DispatchAsync$_annotation$$none$$(), get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$());
    memberInject_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$_annotation$$none$$(result);
    return result;
  }
  
  private com.Planning.client.presenters.ProcurementPlanPresenter singleton_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:123)
   */
  private com.Planning.client.presenters.ProcurementPlanPresenter get_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$_annotation$$none$$() {
    if (singleton_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$_annotation$$none$$ == null) {
      singleton_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$_annotation$$none$$ = create_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$_annotation$$none$$();
    }
    return singleton_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.client.ExceptionHandler declared at:
   *   com.gwtplatform.dispatch.client.gin.DispatchAsyncModule.configure(DispatchAsyncModule.java:179)
   */
  private com.gwtplatform.dispatch.client.ExceptionHandler create_Key$type$com$gwtplatform$dispatch$client$ExceptionHandler$_annotation$$none$$() {
    return get_Key$type$com$gwtplatform$dispatch$client$DefaultExceptionHandler$_annotation$$none$$();
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.client.ExceptionHandler declared at:
   *   com.gwtplatform.dispatch.client.gin.DispatchAsyncModule.configure(DispatchAsyncModule.java:179)
   */
  private com.gwtplatform.dispatch.client.ExceptionHandler get_Key$type$com$gwtplatform$dispatch$client$ExceptionHandler$_annotation$$none$$() {
    return create_Key$type$com$gwtplatform$dispatch$client$ExceptionHandler$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.Planning.client.presenters.PlanningPeriodPresenter$MyProxy declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
   */
  private void memberInject_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$MyProxy$_annotation$$none$$(com.Planning.client.presenters.PlanningPeriodPresenter.MyProxy injectee) {
    
  }
  
  private com.Planning.client.presenters.PlanningPeriodPresenter.MyProxy create_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$MyProxy$_annotation$$none$$() {
    Object created = GWT.create(com.Planning.client.presenters.PlanningPeriodPresenter.MyProxy.class);
    assert created instanceof com.Planning.client.presenters.PlanningPeriodPresenter.MyProxy;
    com.Planning.client.presenters.PlanningPeriodPresenter.MyProxy result = (com.Planning.client.presenters.PlanningPeriodPresenter.MyProxy) created;
    
    memberInject_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$MyProxy$_annotation$$none$$(result);
    return result;
  }
  
  private com.Planning.client.presenters.PlanningPeriodPresenter.MyProxy singleton_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$MyProxy$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
   */
  private com.Planning.client.presenters.PlanningPeriodPresenter.MyProxy get_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$MyProxy$_annotation$$none$$() {
    if (singleton_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$MyProxy$_annotation$$none$$ == null) {
      singleton_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$MyProxy$_annotation$$none$$ = create_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$MyProxy$_annotation$$none$$();
    }
    return singleton_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$MyProxy$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.googleanalytics.GoogleAnalyticsImpl declared at:
   *   Implicit binding for Key[type=com.gwtplatform.mvp.client.googleanalytics.GoogleAnalyticsImpl, annotation=[none]]
   */
  private void memberInject_Key$type$com$gwtplatform$mvp$client$googleanalytics$GoogleAnalyticsImpl$_annotation$$none$$(com.gwtplatform.mvp.client.googleanalytics.GoogleAnalyticsImpl injectee) {
    
  }
  
  private com.gwtplatform.mvp.client.googleanalytics.GoogleAnalyticsImpl create_Key$type$com$gwtplatform$mvp$client$googleanalytics$GoogleAnalyticsImpl$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.mvp.client.googleanalytics.GoogleAnalyticsImpl.class);
    assert created instanceof com.gwtplatform.mvp.client.googleanalytics.GoogleAnalyticsImpl;
    com.gwtplatform.mvp.client.googleanalytics.GoogleAnalyticsImpl result = (com.gwtplatform.mvp.client.googleanalytics.GoogleAnalyticsImpl) created;
    
    memberInject_Key$type$com$gwtplatform$mvp$client$googleanalytics$GoogleAnalyticsImpl$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.googleanalytics.GoogleAnalyticsImpl declared at:
   *   Implicit binding for Key[type=com.gwtplatform.mvp.client.googleanalytics.GoogleAnalyticsImpl, annotation=[none]]
   */
  private com.gwtplatform.mvp.client.googleanalytics.GoogleAnalyticsImpl get_Key$type$com$gwtplatform$mvp$client$googleanalytics$GoogleAnalyticsImpl$_annotation$$none$$() {
    return create_Key$type$com$gwtplatform$mvp$client$googleanalytics$GoogleAnalyticsImpl$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.RootPresenter declared at:
   *   com.gwtplatform.mvp.client.gin.DefaultModule.configure(DefaultModule.java:49)
   */
  private native void com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection___(com.gwtplatform.mvp.client.HandlerContainerImpl injectee, com.gwtplatform.mvp.client.AutobindDisable _0) /*-{
    injectee.@com.gwtplatform.mvp.client.HandlerContainerImpl::automaticBind(Lcom/gwtplatform/mvp/client/AutobindDisable;)(_0);
  }-*/;
  
  private void memberInject_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$(com.gwtplatform.mvp.client.RootPresenter injectee) {
    com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection___(injectee, get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  private com.gwtplatform.mvp.client.RootPresenter com$gwtplatform$mvp$client$RootPresenter_RootPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.mvp.client.RootPresenter.RootView _1) {
    return new com.gwtplatform.mvp.client.RootPresenter(_0, _1);
  }
  
  private com.gwtplatform.mvp.client.RootPresenter create_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$() {
    com.gwtplatform.mvp.client.RootPresenter result = com$gwtplatform$mvp$client$RootPresenter_RootPresenter_methodInjection(get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$mvp$client$RootPresenter$RootView$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$(result);
    return result;
  }
  
  private com.gwtplatform.mvp.client.RootPresenter singleton_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.DefaultModule.configure(DefaultModule.java:49)
   */
  private com.gwtplatform.mvp.client.RootPresenter get_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$() {
    if (singleton_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$ == null) {
      singleton_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$ = create_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$();
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.Planning.client.place.ClientPlaceManager declared at:
   *   Implicit binding for Key[type=com.Planning.client.place.ClientPlaceManager, annotation=[none]]
   */
  private void memberInject_Key$type$com$Planning$client$place$ClientPlaceManager$_annotation$$none$$(com.Planning.client.place.ClientPlaceManager injectee) {
    
  }
  
  private com.Planning.client.place.ClientPlaceManager com$Planning$client$place$ClientPlaceManager_ClientPlaceManager_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.mvp.client.proxy.TokenFormatter _1, java.lang.String _2) {
    return new com.Planning.client.place.ClientPlaceManager(_0, _1, _2);
  }
  
  private com.Planning.client.place.ClientPlaceManager create_Key$type$com$Planning$client$place$ClientPlaceManager$_annotation$$none$$() {
    com.Planning.client.place.ClientPlaceManager result = com$Planning$client$place$ClientPlaceManager_ClientPlaceManager_methodInjection(get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$(), get_Key$type$java$lang$String$_annotation$$com$Planning$client$place$DefaultPlace$());
    memberInject_Key$type$com$Planning$client$place$ClientPlaceManager$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.Planning.client.place.ClientPlaceManager declared at:
   *   Implicit binding for Key[type=com.Planning.client.place.ClientPlaceManager, annotation=[none]]
   */
  private com.Planning.client.place.ClientPlaceManager get_Key$type$com$Planning$client$place$ClientPlaceManager$_annotation$$none$$() {
    return create_Key$type$com$Planning$client$place$ClientPlaceManager$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.Planning.client.presenters.PlanningPeriodPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:126)
   */
  private com.Planning.client.presenters.PlanningPeriodPresenter.MyView create_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$MyView$_annotation$$none$$() {
    return get_Key$type$com$Planning$client$presenters$PlanningPeriodView$_annotation$$none$$();
  }
  
  
  /**
   * Binding for com.Planning.client.presenters.PlanningPeriodPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:126)
   */
  private com.Planning.client.presenters.PlanningPeriodPresenter.MyView get_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$MyView$_annotation$$none$$() {
    return create_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$MyView$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.RootPresenter$RootView declared at:
   *   Implicit binding for Key[type=com.gwtplatform.mvp.client.RootPresenter$RootView, annotation=[none]]
   */
  private void memberInject_Key$type$com$gwtplatform$mvp$client$RootPresenter$RootView$_annotation$$none$$(com.gwtplatform.mvp.client.RootPresenter.RootView injectee) {
    
  }
  
  private com.gwtplatform.mvp.client.RootPresenter.RootView create_Key$type$com$gwtplatform$mvp$client$RootPresenter$RootView$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.mvp.client.RootPresenter.RootView.class);
    assert created instanceof com.gwtplatform.mvp.client.RootPresenter.RootView;
    com.gwtplatform.mvp.client.RootPresenter.RootView result = (com.gwtplatform.mvp.client.RootPresenter.RootView) created;
    
    memberInject_Key$type$com$gwtplatform$mvp$client$RootPresenter$RootView$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.RootPresenter$RootView declared at:
   *   Implicit binding for Key[type=com.gwtplatform.mvp.client.RootPresenter$RootView, annotation=[none]]
   */
  private com.gwtplatform.mvp.client.RootPresenter.RootView get_Key$type$com$gwtplatform$mvp$client$RootPresenter$RootView$_annotation$$none$$() {
    return create_Key$type$com$gwtplatform$mvp$client$RootPresenter$RootView$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.Planning.client.presenters.ProcurementPlanView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:124)
   */
  private void memberInject_Key$type$com$Planning$client$presenters$ProcurementPlanView$_annotation$$none$$(com.Planning.client.presenters.ProcurementPlanView injectee) {
    
  }
  
  private com.Planning.client.presenters.ProcurementPlanView com$Planning$client$presenters$ProcurementPlanView_ProcurementPlanView_methodInjection() {
    return new com.Planning.client.presenters.ProcurementPlanView();
  }
  
  private com.Planning.client.presenters.ProcurementPlanView create_Key$type$com$Planning$client$presenters$ProcurementPlanView$_annotation$$none$$() {
    com.Planning.client.presenters.ProcurementPlanView result = com$Planning$client$presenters$ProcurementPlanView_ProcurementPlanView_methodInjection();
    memberInject_Key$type$com$Planning$client$presenters$ProcurementPlanView$_annotation$$none$$(result);
    return result;
  }
  
  private com.Planning.client.presenters.ProcurementPlanView singleton_Key$type$com$Planning$client$presenters$ProcurementPlanView$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:124)
   */
  private com.Planning.client.presenters.ProcurementPlanView get_Key$type$com$Planning$client$presenters$ProcurementPlanView$_annotation$$none$$() {
    if (singleton_Key$type$com$Planning$client$presenters$ProcurementPlanView$_annotation$$none$$ == null) {
      singleton_Key$type$com$Planning$client$presenters$ProcurementPlanView$_annotation$$none$$ = create_Key$type$com$Planning$client$presenters$ProcurementPlanView$_annotation$$none$$();
    }
    return singleton_Key$type$com$Planning$client$presenters$ProcurementPlanView$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.Planning.client.presenters.MainPageView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:124)
   */
  private void memberInject_Key$type$com$Planning$client$presenters$MainPageView$_annotation$$none$$(com.Planning.client.presenters.MainPageView injectee) {
    
  }
  
  private com.Planning.client.presenters.MainPageView com$Planning$client$presenters$MainPageView_MainPageView_methodInjection(com.planetsystems.ui.utils.utils_ui.client.widgets.ApplicationMenu _0) {
    return new com.Planning.client.presenters.MainPageView(_0);
  }
  
  private com.Planning.client.presenters.MainPageView create_Key$type$com$Planning$client$presenters$MainPageView$_annotation$$none$$() {
    com.Planning.client.presenters.MainPageView result = com$Planning$client$presenters$MainPageView_MainPageView_methodInjection(get_Key$type$com$planetsystems$ui$utils$utils_ui$client$widgets$ApplicationMenu$_annotation$$none$$());
    memberInject_Key$type$com$Planning$client$presenters$MainPageView$_annotation$$none$$(result);
    return result;
  }
  
  private com.Planning.client.presenters.MainPageView singleton_Key$type$com$Planning$client$presenters$MainPageView$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:124)
   */
  private com.Planning.client.presenters.MainPageView get_Key$type$com$Planning$client$presenters$MainPageView$_annotation$$none$$() {
    if (singleton_Key$type$com$Planning$client$presenters$MainPageView$_annotation$$none$$ == null) {
      singleton_Key$type$com$Planning$client$presenters$MainPageView$_annotation$$none$$ = create_Key$type$com$Planning$client$presenters$MainPageView$_annotation$$none$$();
    }
    return singleton_Key$type$com$Planning$client$presenters$MainPageView$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.google.web.bindery.event.shared.EventBus declared at:
   *   com.gwtplatform.mvp.client.gin.DefaultModule.configure(DefaultModule.java:47)
   */
  private com.google.web.bindery.event.shared.EventBus create_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$() {
    return get_Key$type$com$google$web$bindery$event$shared$SimpleEventBus$_annotation$$none$$();
  }
  
  private com.google.web.bindery.event.shared.EventBus singleton_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.DefaultModule.configure(DefaultModule.java:47)
   */
  private com.google.web.bindery.event.shared.EventBus get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$() {
    if (singleton_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$ == null) {
      singleton_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$ = create_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$();
    }
    return singleton_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.ProcurementPlanPresenter> declared at:
   *   Implicit binding for Key[type=com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.ProcurementPlanPresenter>, annotation=[none]]
   */
  private com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.ProcurementPlanPresenter> create_Key$type$com$google$gwt$inject$client$AsyncProvider$com$Planning$client$presenters$ProcurementPlanPresenter$$_annotation$$none$$() {
    return new com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.ProcurementPlanPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<com.Planning.client.presenters.ProcurementPlanPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$_annotation$$none$$()); 
            }
            public void onFailure(Throwable ex) { 
               callback.onFailure(ex); 
            } 
        }); 
        }
     };
    
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.ProcurementPlanPresenter> declared at:
   *   Implicit binding for Key[type=com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.ProcurementPlanPresenter>, annotation=[none]]
   */
  private com.google.gwt.inject.client.AsyncProvider<com.Planning.client.presenters.ProcurementPlanPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$Planning$client$presenters$ProcurementPlanPresenter$$_annotation$$none$$() {
    return create_Key$type$com$google$gwt$inject$client$AsyncProvider$com$Planning$client$presenters$ProcurementPlanPresenter$$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.gwtplatform.dispatch.client.DefaultExceptionHandler declared at:
   *   Implicit binding for Key[type=com.gwtplatform.dispatch.client.DefaultExceptionHandler, annotation=[none]]
   */
  private void memberInject_Key$type$com$gwtplatform$dispatch$client$DefaultExceptionHandler$_annotation$$none$$(com.gwtplatform.dispatch.client.DefaultExceptionHandler injectee) {
    
  }
  
  private com.gwtplatform.dispatch.client.DefaultExceptionHandler create_Key$type$com$gwtplatform$dispatch$client$DefaultExceptionHandler$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.dispatch.client.DefaultExceptionHandler.class);
    assert created instanceof com.gwtplatform.dispatch.client.DefaultExceptionHandler;
    com.gwtplatform.dispatch.client.DefaultExceptionHandler result = (com.gwtplatform.dispatch.client.DefaultExceptionHandler) created;
    
    memberInject_Key$type$com$gwtplatform$dispatch$client$DefaultExceptionHandler$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.client.DefaultExceptionHandler declared at:
   *   Implicit binding for Key[type=com.gwtplatform.dispatch.client.DefaultExceptionHandler, annotation=[none]]
   */
  private com.gwtplatform.dispatch.client.DefaultExceptionHandler get_Key$type$com$gwtplatform$dispatch$client$DefaultExceptionHandler$_annotation$$none$$() {
    return create_Key$type$com$gwtplatform$dispatch$client$DefaultExceptionHandler$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.Planning.client.presenters.ProcurementPlanPresenter$MyProxy declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
   */
  private void memberInject_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$MyProxy$_annotation$$none$$(com.Planning.client.presenters.ProcurementPlanPresenter.MyProxy injectee) {
    
  }
  
  private com.Planning.client.presenters.ProcurementPlanPresenter.MyProxy create_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$MyProxy$_annotation$$none$$() {
    Object created = GWT.create(com.Planning.client.presenters.ProcurementPlanPresenter.MyProxy.class);
    assert created instanceof com.Planning.client.presenters.ProcurementPlanPresenter.MyProxy;
    com.Planning.client.presenters.ProcurementPlanPresenter.MyProxy result = (com.Planning.client.presenters.ProcurementPlanPresenter.MyProxy) created;
    
    memberInject_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$MyProxy$_annotation$$none$$(result);
    return result;
  }
  
  private com.Planning.client.presenters.ProcurementPlanPresenter.MyProxy singleton_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$MyProxy$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
   */
  private com.Planning.client.presenters.ProcurementPlanPresenter.MyProxy get_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$MyProxy$_annotation$$none$$() {
    if (singleton_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$MyProxy$_annotation$$none$$ == null) {
      singleton_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$MyProxy$_annotation$$none$$ = create_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$MyProxy$_annotation$$none$$();
    }
    return singleton_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$MyProxy$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.AutobindDisable declared at:
   *   Implicit binding for Key[type=com.gwtplatform.mvp.client.AutobindDisable, annotation=[none]]
   */
  private void memberInject_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$(com.gwtplatform.mvp.client.AutobindDisable injectee) {
    
  }
  
  private native com.gwtplatform.mvp.client.AutobindDisable com$gwtplatform$mvp$client$AutobindDisable_AutobindDisable_methodInjection() /*-{
    return @com.gwtplatform.mvp.client.AutobindDisable::new()();
  }-*/;
  
  private com.gwtplatform.mvp.client.AutobindDisable create_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$() {
    com.gwtplatform.mvp.client.AutobindDisable result = com$gwtplatform$mvp$client$AutobindDisable_AutobindDisable_methodInjection();
    memberInject_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$(result);
    return result;
  }
  
  private com.gwtplatform.mvp.client.AutobindDisable singleton_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   Implicit binding for Key[type=com.gwtplatform.mvp.client.AutobindDisable, annotation=[none]]
   */
  private com.gwtplatform.mvp.client.AutobindDisable get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$() {
    if (singleton_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$ == null) {
      singleton_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$ = create_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$();
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor declared at:
   *   Implicit binding for Key[type=com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor, annotation=[none]]
   */
  private void memberInject_Key$type$com$gwtplatform$dispatch$client$DefaultSecurityCookieAccessor$_annotation$$none$$(com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor injectee) {
    
  }
  
  private com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor create_Key$type$com$gwtplatform$dispatch$client$DefaultSecurityCookieAccessor$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor.class);
    assert created instanceof com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor;
    com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor result = (com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor) created;
    
    memberInject_Key$type$com$gwtplatform$dispatch$client$DefaultSecurityCookieAccessor$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor declared at:
   *   Implicit binding for Key[type=com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor, annotation=[none]]
   */
  private com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor get_Key$type$com$gwtplatform$dispatch$client$DefaultSecurityCookieAccessor$_annotation$$none$$() {
    return create_Key$type$com$gwtplatform$dispatch$client$DefaultSecurityCookieAccessor$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.Planning.client.presenters.MainPagePresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:126)
   */
  private com.Planning.client.presenters.MainPagePresenter.MyView create_Key$type$com$Planning$client$presenters$MainPagePresenter$MyView$_annotation$$none$$() {
    return get_Key$type$com$Planning$client$presenters$MainPageView$_annotation$$none$$();
  }
  
  
  /**
   * Binding for com.Planning.client.presenters.MainPagePresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:126)
   */
  private com.Planning.client.presenters.MainPagePresenter.MyView get_Key$type$com$Planning$client$presenters$MainPagePresenter$MyView$_annotation$$none$$() {
    return create_Key$type$com$Planning$client$presenters$MainPagePresenter$MyView$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.Planning.client.presenters.ProcurementPlanPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:126)
   */
  private com.Planning.client.presenters.ProcurementPlanPresenter.MyView create_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$MyView$_annotation$$none$$() {
    return get_Key$type$com$Planning$client$presenters$ProcurementPlanView$_annotation$$none$$();
  }
  
  
  /**
   * Binding for com.Planning.client.presenters.ProcurementPlanPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:126)
   */
  private com.Planning.client.presenters.ProcurementPlanPresenter.MyView get_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$MyView$_annotation$$none$$() {
    return create_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$MyView$_annotation$$none$$();
  }
  
  
  public ClientGinjectorImpl() {
    // Eager singleton bound at:
    //   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
    get_Key$type$com$Planning$client$presenters$MainPagePresenter$MyProxy$_annotation$$none$$();
    // Eager singleton bound at:
    //   com.gwtplatform.dispatch.client.gin.DispatchAsyncModule.configure(DispatchAsyncModule.java:181)
    get_Key$type$com$gwtplatform$dispatch$client$actionhandler$ClientActionHandlerRegistry$_annotation$$none$$();
    // Eager singleton bound at:
    //   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
    get_Key$type$com$Planning$client$presenters$PlanningPeriodPresenter$MyProxy$_annotation$$none$$();
    // Eager singleton bound at:
    //   com.gwtplatform.mvp.client.gin.DefaultModule.configure(DefaultModule.java:49)
    get_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$();
    // Eager singleton bound at:
    //   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:125)
    get_Key$type$com$Planning$client$presenters$ProcurementPlanPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
