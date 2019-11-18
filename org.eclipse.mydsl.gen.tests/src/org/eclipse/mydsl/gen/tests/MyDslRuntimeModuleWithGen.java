package org.eclipse.mydsl.gen.tests;

import org.eclipse.mydsl.MyDslRuntimeModule;
import org.eclipse.mydsl.gen.runtime.MyDslGenerator;

public class MyDslRuntimeModuleWithGen extends MyDslRuntimeModule {
	public Class<? extends org.eclipse.xtext.generator.IGenerator2> bindIGenerator() {
		return MyDslGenerator.class;
	}
}
