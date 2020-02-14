package info.chili.gwt.widgets;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import info.chili.gwt.fields.ImageField;

// TODO: Auto-generated Javadoc
/**
 * The Class LoadingWidget.
 */
public class LoadingWidget extends PopupPanel {

    /**
     * The loading.
     */
    //Label loading = new Label("");
    Image loading =new Image ("https://apps.sstech.us/loading.gif");
    /**
     * Instantiates a new loading widget.
     */
    public LoadingWidget() {
        super(true);
          loading.setHeight("100px");
           loading.setWidth("100px");
           
        setWidget(loading);
      
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.google.gwt.user.client.ui.PopupPanel#show()
     */
    public void show() {
        int left = Window.getClientWidth() / 2;
         this.setPopupPosition(left, Window.getClientHeight()/3);
        //addStyleName("y-gwt-new-ResponseStatusBar");
        super.show();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.google.gwt.user.client.ui.PopupPanel#hide()
     */
    public void hide() {
        //removeStyleName("y-gwt-new-ResponseStatusBar");
        super.hide();
    }
}
