package info.chili.gwt.widgets;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;

// TODO: Auto-generated Javadoc
/**
 * The Class LoadingWidget.
 */
public class LoadingWidget extends PopupPanel {

    /**
     * The loading.
     */
    Label loading = new Label("Please wait while loading...");

    /**
     * Instantiates a new loading widget.
     */
    public LoadingWidget() {
        super(true);
        setWidget(loading);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.google.gwt.user.client.ui.PopupPanel#show()
     */
    public void show() {
        int left = Window.getClientWidth() / 3;
        this.setPopupPosition(left,  Window.getClientHeight()/2);
        addStyleName("y-gwt-new-ResponseStatusBar");
        super.show();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.google.gwt.user.client.ui.PopupPanel#hide()
     */
    public void hide() {
        removeStyleName("y-gwt-new-ResponseStatusBar");
        super.hide();
    }
}
