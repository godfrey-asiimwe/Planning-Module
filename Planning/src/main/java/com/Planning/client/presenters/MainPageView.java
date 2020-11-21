package com.Planning.client.presenters;

import com.Planning.client.place.NameTokens;
import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.planetsystems.ui.utils.utils_ui.client.widgets.ApplicationMenu;
import com.planetsystems.ui.utils.utils_ui.client.widgets.ControlsPane;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.menu.MenuItem;
import com.smartgwt.client.widgets.menu.MenuItemSeparator;

public class MainPageView extends ViewImpl implements MainPagePresenter.MyView {
	private static final String NORTH_HEIGHT = "10%";
	private static final int DEFAULT_MENU_WIDTH = 70;
	private static final String DEFAULT_MARGIN = "0px";
	private VLayout contentPanel;
	private final ApplicationMenu applicationMenu;
	private VLayout panel;
	private ControlsPane controlsPane;
	
	private MenuItem planningPeriodItem;
	private MenuItem procurementPlanItem;


	@Inject
	public MainPageView(ApplicationMenu applicationMenu) {
		super();

		this.applicationMenu = applicationMenu;
		controlsPane = new ControlsPane();

		contentPanel = new VLayout();
		contentPanel.setWidth("100%");
		contentPanel.setHeight("100%");

		panel = new VLayout();
		panel.setWidth100();
		panel.setHeight100();
		panel.setBackgroundColor("#fff");

		initialiseApplicationMenu();

		VLayout mastHead = new VLayout();
		mastHead.addMember(applicationMenu);
		mastHead.addMember(controlsPane);

		panel.addMember(mastHead);
		panel.addMember(contentPanel);

	}

	public Widget asWidget() {
		return panel;
	}

	public void initialiseApplicationMenu() {
		// Add the file menu
		MenuItem newItem = new MenuItem("New", "icons/16/document_plain_new.png", "Ctrl+N");
		MenuItem openItem = new MenuItem("Open", "icons/16/folder_out.png", "Ctrl+O");
		MenuItem saveItem = new MenuItem("Save", "icons/16/disk_blue.png", "Ctrl+S");
		MenuItem saveAsItem = new MenuItem("Save As", "icons/16/save_as.png");
		MenuItem recentDocItem = new MenuItem("Recent Documents", "icons/16/folder_document");
		MenuItem exportItem = new MenuItem("Export as...", "icons/16/export1.png");
		MenuItemSeparator separator = new MenuItemSeparator();
		MenuItem printItem = new MenuItem("Print", "icons/16/printer3.png", "Ctrl+P");
		
		planningPeriodItem=new MenuItem(NameTokens.getPlanningperiod());
		procurementPlanItem=new MenuItem(NameTokens.getProcurementplan());


		applicationMenu.addMenu("File", DEFAULT_MENU_WIDTH).setItems(newItem, openItem, separator, saveItem, saveAsItem, separator, recentDocItem, separator, exportItem, separator, printItem);

		applicationMenu.addMenu("Forms", DEFAULT_MENU_WIDTH).setItems(planningPeriodItem,separator,procurementPlanItem);

		applicationMenu.addMenu("Go To", DEFAULT_MENU_WIDTH);
		applicationMenu.addMenu("Tools", DEFAULT_MENU_WIDTH);
		applicationMenu.addMenu("Help", DEFAULT_MENU_WIDTH);

	}

	@Override
	public void setInSlot(Object slot, Widget content) {
		if (slot == MainPagePresenter.TYPE_SetContextAreaContent) {
			contentPanel.setMembers((VLayout) content);
		} else {
			super.setInSlot(slot, content);
		}
	}

	public VLayout getContentPanel() {
		return contentPanel;
	}

	public ControlsPane getControlsPane() {
		return controlsPane;
	}

	public MenuItem getplanningPeriodItem() {
		return planningPeriodItem;
	}

	public MenuItem getProcurementPlanItem() {
		return procurementPlanItem;
	}



}
