package org.eclipse.mydsl.gen.runtime;

import org.eclipse.xtext.service.AbstractGenericModule;

public class MyDslGenModule extends AbstractGenericModule {
    public Class<? extends org.eclipse.xtext.generator.IGenerator2> bindIGenerator() {
        return MyDslGenerator.class; 

 }
}
