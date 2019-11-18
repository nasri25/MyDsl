package org.eclipse.mydsl.gen.tests;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Pair;

/**
 * '''<input>''' -> '''<output after code generation>'''
 */
@SuppressWarnings("all")
public interface JustDoIt {
  public static final Pair<String, String> FeatureTitle = new Function0<Pair<String, String>>() {
    @Override
    public Pair<String, String> apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Do it");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<Do it yourself ;-)>");
      _builder_1.newLine();
      Pair<String, String> _mappedTo = Pair.<String, String>of(_builder.toString(), _builder_1.toString());
      return _mappedTo;
    }
  }.apply();
}
