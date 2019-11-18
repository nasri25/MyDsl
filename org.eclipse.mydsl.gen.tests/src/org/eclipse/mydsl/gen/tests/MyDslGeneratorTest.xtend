package org.eclipse.mydsl.gen.tests


import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
//import org.eclipse.xtext.testing.XtextRunner
//import org.junit.runner.RunWith
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith


@ExtendWith(InjectionExtension)
@InjectWith(MyDslInjectorProvider)

class MyDslGeneratorTest implements JustDoIt {
	@Inject extension CompilationTestHelper
	
	@Test 
    def one() {
    	Assertions.assertEquals(1,1)
    }
    
	@Test 
    def two() {
    	FeatureTitle.key.assertCompilesTo(FeatureTitle.value)
    }
	
}