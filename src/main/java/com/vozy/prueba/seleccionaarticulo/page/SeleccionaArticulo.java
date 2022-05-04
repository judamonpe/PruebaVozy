package com.vozy.prueba.seleccionaarticulo.page;

import java.util.Iterator;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/")

public class SeleccionaArticulo extends PageObject{
	
	
	@FindBy (xpath="//input[@id='user-name']")
	private WebElementFacade usuario;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElementFacade password;

	@FindBy (xpath="//input[@id='login-button']")
	private WebElementFacade loginButton;
	
	
	@FindBy (xpath="//div[@class='inventory_item_price']")
	private WebElementFacade articulo;
	
	
	@FindBy (xpath="//a[@class='shopping_cart_link']")
	private WebElementFacade carritoDeCompras;
	
	@FindBy (xpath="//button[@id='checkout']")
	private WebElementFacade checkout;
	
	
	@FindBy (xpath="//input[@id='first-name']")
	private WebElementFacade campoNombre;
	
	
	@FindBy (xpath="//input[@id='last-name']")
	private WebElementFacade campopApellido;
	
	@FindBy (xpath="//input[@id='postal-code']")
	private WebElementFacade campoCodigoPostal;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElementFacade botonContinue;
	
	@FindBy (xpath="//button[@id='finish']")
	private WebElementFacade botonFinish;
	
	
	@FindBy (xpath="//h2[@class='complete-header']")
	private WebElementFacade textoMensajeGracias;
	
	
	

	
	public void escribirusuario(String usuariodigitado) {
			
		usuario.sendKeys(usuariodigitado);
	}
		
    public void escribirPassword(String passwordigitado) {
		
    	password.sendKeys(passwordigitado);
	}
    
    public void clicBotonLogin() {
		
    	loginButton.click();
    }
 
    public void EscogerElArticuloDeMayorValor() {
		
    	float mayor=0;
    	int posicion=0;
    	
    	for (int i = 0; i < articulo.getText().length(); i++) {
    		
    		
    	
    		String valorArticuloString=articulo.thenFindAll("//div[@class='inventory_item_price']").get(i).getText().toString();
    		valorArticuloString=valorArticuloString.replace("$","");
    		float valorarticulo= Float.parseFloat(valorArticuloString);
    		if (valorarticulo>mayor) {
				mayor=valorarticulo;
				posicion=i;
			}
		
		}
    	
    	posicion++;
    		
    		findBy("//*[@class='inventory_list']/div["+posicion+"]//button[@class='btn btn_primary btn_small btn_inventory']").click();
			
		
    }
    
    public void clicCarritoDeCompras() {
    	
    	carritoDeCompras.click();
    }
    
    public void clicCheckout() {
    	
    	checkout.click();
    }
    
    public void escribirNombre(String nombre) {
		
    	campoNombre.sendKeys(nombre);
    }

    
    public void escribirApellido(String apellido) {
		
    	campopApellido.sendKeys(apellido);
    }
    
    public void escribirCodigoPostal(String condigoPostal) {
		
    	campoCodigoPostal.sendKeys(condigoPostal);
    }
    
    public void clicContinue() {
		
    	botonContinue.click();
    }
    
    public void clicFinish() {
		
    	botonFinish.click();
    }
    
    public boolean clicEnCampoDeTexto(String textoGracias) {
		
    	if (textoMensajeGracias.getText().toString().equals(textoGracias)) {
			return true;
		}else {
			return false;
		}
		
    }
    
    
    
    
    
    
    
}
