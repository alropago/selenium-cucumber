Feature: Compra Articulo Con Rut Y Clave Incorretos

  Background:
    Given Ingreso a url "https://www.pcfactory.cl/"

    Scenario Outline: Comprar Articulo con Rut invalido
      Given Ingreso nombre de articulo "<Nombre Articulo>"
      When Se da clic al boton buscar
      And Selecciono el articulo
      And Se da clic al boton agregar al carro
      And Se le da clic al boton de despacho a domicilio
      And Se le da clic al boton comprar
      And Ingreso "<Rut>" y "<Contrasenia>"
      And Se da clic a boton iniciar sesion
      Then Se valida el siguente mensaje de error desplegado: "Rut Inválido"

      Examples:
        |Rut         |Contrasenia       |Nombre Articulo|
        | 237465832  |   web123         |monitor        |
        | 237465832  |   web123         |notebook       |

  Scenario Outline: Comprar articulo con contrasenia invalida
    Given Ingreso nombre de articulo "<Nombre Articulo>"
    When Se da clic al boton buscar
    And Selecciono el articulo
    And Se da clic al boton agregar al carro
    And Se le da clic al boton de despacho a domicilio
    And Se le da clic al boton comprar
    And Ingreso "<Rut>" y "<Contrasenia>"
    And Se da clic a boton iniciar sesion
    Then Se valida el siguente mensaje de error desplegado: "Contraseña incorrecta"

    Examples:
      |Rut         |Contrasenia       |Nombre Articulo|
      | 18250596k  |   web123         |monitor        |