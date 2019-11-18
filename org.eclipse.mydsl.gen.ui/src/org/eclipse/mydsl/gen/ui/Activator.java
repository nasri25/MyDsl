package org.eclipse.mydsl.gen.ui;

import org.eclipse.mydsl.MyDslRuntimeModule;
import org.eclipse.mydsl.gen.runtime.MyDslGenModule;
import org.eclipse.mydsl.ui.MyDslUiModule;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;
import org.apache.log4j.Logger;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
	private Injector injector;  
    private static Activator INSTANCE;

    @Override public void start(BundleContext context) throws Exception {  
        super.start(context);  
        INSTANCE = this;  
        try { 
            injector = Guice.createInjector(Modules2.mixin(  
                new MyDslRuntimeModule(),
                new SharedStateModule(),
                new MyDslUiModule(this),
                new MyDslGenModule(),
                new MyDslGenUIModule(this)));
        } catch (Exception e) {
            Logger.getLogger(getClass()).error(e.getMessage(),e);  throw e;}
        }
    @Override public void stop(BundleContext context) throws Exception {
        injector = null;  
        super.stop(context);
    } 
  
    public static Activator getInstance() {
        return INSTANCE;
    }  
  
    public Injector getInjector() {
        return injector;
    }

}
