package com.vozy.prueba.seleccionaarticulo.steps;

import static org.junit.Assert.assertTrue;

import com.vozy.prueba.seleccionaarticulo.page.SeleccionaArticulo;

import net.thucydides.core.annotations.Step;

public class SeleccionaArticuloSteps {
	

	SeleccionaArticulo seleccionaArticulo;
	
	
	 @Step
		public void openBrowser() {
		 		
		 	seleccionaArticulo.open();	   
		}
	 
	 @Step
		public void ingresarUsuario(String usuario) {
		   
		 		seleccionaArticulo.escribirusuario(usuario);
		   
		}
	 
	 
	 @Step
		public void ingresarPassword(String Password) {
		   
		 		seleccionaArticulo.escribirPassword(Password);
		   
		}
	 
	 @Step
		public void clicBotonLogin() {
		   
		 		seleccionaArticulo.clicBotonLogin();
		   
		}

	 
	 @Step
		public void clicBotonArticuloMayorValor() {
		   
		 		seleccionaArticulo.EscogerElArticuloDeMayorValor();
		   
		}
	 
	 
	 @Step
		public void darClicCarritoDeCompras() {
		   
		 		seleccionaArticulo.clicCarritoDeCompras();
		   
		}
	 
	 @Step
		public void darClicEnCheckOut() {
		   
		 		seleccionaArticulo.clicCheckout();
		   
		}
	 
	 @Step
		public void escribirEnCampoNombre(String nombre) {
		   
		 		seleccionaArticulo.escribirNombre(nombre);
		   
		}
	 
	 @Step
		public void escribirenCampoApellido(String apellido) {
		   
		 		seleccionaArticulo.escribirApellido(apellido);
		   
		}

	 @Step
		public void escribirenCampoCodigoPostal(String codigoPostal) {
		   
		 		seleccionaArticulo.escribirCodigoPostal(codigoPostal);
		   
		}
	 
	 @Step
		public void clicBotonContinuar() {
		   
		 		seleccionaArticulo.clicContinue();
		   
		}

	 @Step
		public void clicBotonFinalizar() {
		   
		 		seleccionaArticulo.clicFinish();
		   
		}
	 
	 @Step
		public void verificarMensajeGracias(String mensajeGracias) {
		   
		 		assertTrue(seleccionaArticulo.clicEnCampoDeTexto(mensajeGracias));
		   
		}
	 
}


