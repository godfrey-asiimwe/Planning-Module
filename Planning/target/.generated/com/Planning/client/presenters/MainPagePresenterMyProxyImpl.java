package com.Planning.client.presenters;

import com.google.gwt.core.client.GWT;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.gwtplatform.mvp.client.proxy.NotifyingAsyncCallback;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.common.client.StandardProvider;
import com.gwtplatform.common.client.CodeSplitProvider;
import com.gwtplatform.common.client.CodeSplitBundleProvider;
import com.gwtplatform.mvp.client.proxy.ProxyImpl;
import com.gwtplatform.mvp.client.proxy.ProxyPlaceImpl;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.DelayedBind;
import com.gwtplatform.mvp.client.proxy.TabContentProxyPlaceImpl;
import com.gwtplatform.mvp.client.DelayedBindRegistry;
import com.google.gwt.inject.client.Ginjector;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.TabDataBasic;

public class MainPagePresenterMyProxyImpl extends com.gwtplatform.mvp.client.proxy.ProxyImpl<MainPagePresenter> implements com.Planning.client.presenters.MainPagePresenter.MyProxy, com.gwtplatform.mvp.client.DelayedBind {
  
  private com.Planning.client.gin.ClientGinjector ginjector;
  
  public MainPagePresenterMyProxyImpl() {
    DelayedBindRegistry.register(this);
  }
  
  @Override
  public void delayedBind(Ginjector baseGinjector) {
    ginjector = (com.Planning.client.gin.ClientGinjector)baseGinjector;
    bind(ginjector.getPlaceManager(),
        ginjector.getEventBus());
    presenter = new CodeSplitProvider<MainPagePresenter>( ginjector.getMainPagePresenter() );
    
    RevealContentHandler<MainPagePresenter> revealContentHandler = new RevealContentHandler<MainPagePresenter>( eventBus, this );
    getEventBus().addHandler( MainPagePresenter.TYPE_SetContextAreaContent, revealContentHandler );
  }
}
