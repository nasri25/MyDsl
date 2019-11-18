package org.eclipse.mydsl.gen.tests;

import com.google.inject.Inject;
import org.eclipse.mydsl.gen.tests.JustDoIt;
import org.eclipse.mydsl.gen.tests.MyDslInjectorProvider;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.testing.CompilationTestHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyDslInjectorProvider.class)
@SuppressWarnings("all")
public class MyDslGeneratorTest implements JustDoIt {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Test
  public void one() {
    Assertions.assertEquals(1, 1);
  }
  
  @Test
  public void two() {
    try {
      this._compilationTestHelper.assertCompilesTo(JustDoIt.FeatureTitle.getKey(), JustDoIt.FeatureTitle.getValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
