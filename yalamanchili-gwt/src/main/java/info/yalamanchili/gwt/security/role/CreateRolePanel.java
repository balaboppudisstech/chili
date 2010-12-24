package info.yalamanchili.gwt.security.role;

import info.yalamanchili.gwt.callback.ALAsyncCallback;
import info.yalamanchili.gwt.composite.CreateComposite;
import info.yalamanchili.gwt.fields.DataType;
import info.yalamanchili.gwt.security.AdminService.AdminServiceAsync;
import info.yalamanchili.gwt.widgets.ResponseStatusWidget;
import info.yalamanchili.security.jpa.YRole;
import info.yalamanchili.security.jpa.YUser;

public class CreateRolePanel extends CreateComposite<YRole> {

	public CreateRolePanel(CreateCompositeType type) {
		super(type);
		initCreateComposite(YUser.class.getName(), null);
	}

	@Override
	protected void createButtonClicked() {
		AdminServiceAsync.instance().createRole(entity,
				new ALAsyncCallback<YRole>() {

					@Override
					public void onResponse(YRole user) {
						new ResponseStatusWidget().show("created");
					}

				});

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
		addField("rolename", false, true, DataType.STRING_FIELD);
	}

	@Override
	protected YRole populateEntityFromFields() {
		YRole role = new YRole();
		role.setRolename(getStringField("rolename"));
		return role;
	}

	@Override
	protected void configure() {

	}

	@Override
	protected void addButtonClicked() {
	}

}
