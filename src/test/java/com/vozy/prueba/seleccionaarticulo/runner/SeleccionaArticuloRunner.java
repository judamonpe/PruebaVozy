package com.vozy.prueba.seleccionaarticulo.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/compraswag.feature"
,glue="com.vozy.prueba.seleccionaarticulo.definitions"
,snippets=SnippetType.CAMELCASE)
public class SeleccionaArticuloRunner {

}
