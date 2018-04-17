/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.chili.gwt.fields;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 * @author prasanthi.p
 */
public class ImagePopup extends PopupPanel {

    private static ImagePopup instance;

    public static ImagePopup instance() {
        return instance;
    }

    public ImagePopup() {
        instance = this;
    }

    public ImagePopup(Widget widget, int left, int top) {
        instance = this;
        addWidgets(widget, left, top);
        configure();
    }

    public ImagePopup(Widget widget, String styleName, int left, int top) {
        instance = this;
        addWidgets(widget, left, top);
        configure();
        useStyleName(styleName);
    }

    public ImagePopup(Widget widget) {
        instance = this;
        addWidgets(widget, Window.getClientWidth() / 100, Window.getClientHeight() / 50);
        configure();
    }

    protected void addWidgets(Widget widget, int left, int top) {
        FlowPanel panel = new FlowPanel();
        panel.add(widget);
        widget.setHeight("500px");
        widget.setWidth("454px");
        setWidget(panel);
        super.setPopupPosition(left, top);
    }

    protected void configure() {
        setAutoHideEnabled(true);
        this.addStyleName("genericPopup");
    }

    public static void hideIfOpen() {
        if (instance != null) {
            instance.hide();
        }
    }

    public void useStyleName(String styleName) {
        this.removeStyleName("genericPopup");
        this.addStyleName(styleName);
    }

}
