/**
 * generated by Xtext 2.19.0
 */
package org.eclipse.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.mydsl.MyDslRuntimeModule;
import org.eclipse.mydsl.MyDslStandaloneSetup;
import org.eclipse.mydsl.ide.MyDslIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class MyDslIdeSetup extends MyDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    MyDslRuntimeModule _myDslRuntimeModule = new MyDslRuntimeModule();
    MyDslIdeModule _myDslIdeModule = new MyDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_myDslRuntimeModule, _myDslIdeModule));
  }
}
