package info.yalamanchili.gwt.security.role;

import info.yalamanchili.gwt.callback.ALAsyncCallback;
import info.yalamanchili.gwt.composite.SearchPanelCompositeGeneric;
import info.yalamanchili.gwt.fields.DataType;
import info.yalamanchili.gwt.security.AdminService.AdminServiceAsync;
import info.yalamanchili.gwt.security.SecurityWelcome;
import info.yalamanchili.gwt.security.user.ReadAllUsersPanel;
import info.yalamanchili.gwt.security.user.ReadAllUsersPanel.YUserTableType;
import info.yalamanchili.gwt.widgets.ALSuggestBox;
import info.yalamanchili.security.jpa.YRole;

import java.util.List;

public class RoleSearchPanelGeneric extends SearchPanelCompositeGeneric<YRole> {

	private static RoleSearchPanelGeneric instance;

	public static RoleSearchPanelGeneric instance() {
		return instance;
	}

	public RoleSearchPanelGeneric() {
		instance = this;
		initSearchPanelCompositeGeneric("YRole", null);
	}

	@Override
	protected void addListeners() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void addWidgetsBeforeCaptionPanel() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void addWidgets() {
		addField("username", false, true, DataType.STRING_FIELD);
		AdminServiceAsync.instance().getSuggestionsForNameRole("rolename",
				entity, new ALAsyncCallback<List<String>>() {

					@Override
					public void onResponse(List<String> values) {
						addSuggestBox("rolename", values);

					}

				});
	}

	@Override
	protected void configure() {

	}

	@Override
	protected void searchButtonClicked() {
		SecurityWelcome.entityPanel.clear();
		SecurityWelcome.entityPanel.add((new ReadAllUsersPanel(
				YUserTableType.READALL_SEARCH)));

	}

	@Override
	protected YRole populateEntity() {
		YRole role = new YRole();
		role.setRolename(((ALSuggestBox) fields.get("rolename")).getText());
		return role;
	}

	protected void postValidate() {

	}
}