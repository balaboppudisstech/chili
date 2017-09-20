/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.chili.gwt.callback;

import com.google.gwt.http.client.RequestCallback;
import info.chili.gwt.widgets.LoadingWidget;
import java.util.logging.Logger;

/**
 *
 * @author Ramana.Lukalapu
 */
public abstract class ALRequestCallback implements RequestCallback {
    
    Logger logger = Logger.getLogger(ALRequestCallback.class.getName());
    
    protected LoadingWidget loadingWidget = new LoadingWidget();
    
     public ALRequestCallback() {
        loadingWidget.show();
    }
}
