Feature: swag lab
  como usuario de swaglab
  quiero realizar compras por medio de la pagina 


  Scenario: Seleccionar el articulo de mayor valor 
	 
	 Given como usuario estoy en la pagina
   When como usuario me logueo con el usuario standard_user y password secret_sauce
   And como usuario ingreso al carrito
   And como usuario ingreso el nombre peter albeiro
   And como usuario ingreso el apellido alzate
   And como usuario ingreso el codigo postal w14 nn3
   And como usuario finalizo el checkout
   Then como usuario puedo ver el mensaje THANK YOU FOR YOUR ORDER
    