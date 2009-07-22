package info.yalamanchili.gwt.composite;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;

// TODO: Auto-generated Javadoc
/**
 * The Class UpdateComposite.
 */
public abstract class UpdateComposite<T> extends ReadUpdateCreateComposite
		implements ClickHandler {

	/** The entity. */
	protected T entity;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * info.yalamanchili.gwt.composite.ReadUpdateCreateComposite#getEntity()
	 */
	public T getEntity() {
		return entity;
	}

	/** The update. */
	protected Button update = new Button("UPDATE");

	/**
	 * Inits the update composite.
	 */
	public void initUpdateComposite() {
		init();
		panel.add(update);
		update.addClickHandler(this);
		populateFields();
	}

	/**
	 * Populate fields.
	 */
	public abstract void populateFields();

	/**
	 * Update button clicked.
	 */
	public abstract void updateButtonClicked();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.google.gwt.user.client.ui.ClickListener#onClick(com.google.gwt.user
	 * .client.ui.Widget)
	 */
	public void onClick(ClickEvent event) {
		if (event.getSource() == update) {
			updateButtonClicked();
		}
	}
}
