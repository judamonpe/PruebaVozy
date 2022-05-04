package com.vozy.prueba.seleccionaarticulo.definitions;

import com.vozy.prueba.seleccionaarticulo.steps.SeleccionaArticuloSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SeleccionaArticuloDefinitions {
	
	
	
	@Steps
	SeleccionaArticuloSteps contactFormSteps;
	
	@Given("^como usuario estoy en la pagina$")
	public void comoUsuarioEstoyEnLaPagina()  {
		
		contactFormSteps.openBrowser();

	}


	@When("^como usuario me logueo con el usuario (.*) y password (.*)$")
	public void comoUsuarioIngresoElUsuarioStandard_user(String usuario,String password) {
		
		contactFormSteps.ingresarUsuario(usuario);
		contactFormSteps.ingresarPassword(password);
		contactFormSteps.clicBotonLogin();
	}

	@When("^como usuario selecciono el articulo de mayor valor$")
	public void comoUsuarioBuscoElArticuloDeMayorValor()  {
		
		contactFormSteps.clicBotonArticuloMayorValor();

	}

	@When("^como usuario ingreso al carrito$")
	public void comoUsuarioDoyClicAlCarrito()  {
		
		contactFormSteps.darClicCarritoDeCompras();
		contactFormSteps.darClicEnCheckOut();
	}


	@When("^como usuario ingreso el nombre (.*)$")
	public void comoUsuarioIngresoElNombre(String nombre){
		
		contactFormSteps.escribirEnCampoNombre(nombre);
	}

	@When("^como usuario ingreso el apellido (.*)$")
	public void comoUsuarioIngresoElApellido(String apellido){
		
		contactFormSteps.escribirenCampoApellido(apellido);
	}

	@When("^como usuario ingreso el codigo postal (.*)$")
	public void comoUsuarioIngresoElCodigoPostal(String codigoPostal)  {
		
		contactFormSteps.escribirenCampoCodigoPostal(codigoPostal);
		contactFormSteps.clicBotonContinuar();
	}


	@When("^como usuario finalizo el checkout$")
	public void comoUsuarioPuedoDarClicEnFinalizar() {
		
		contactFormSteps.clicBotonFinalizar();
	}

	@Then("^como usuario puedo ver el mensaje (.*)$")
	public void comoUsuarioPuedoVerElMensaje(String mensajeGracias) {
		
		contactFormSteps.verificarMensajeGracias(mensajeGracias);
	}
	


}
