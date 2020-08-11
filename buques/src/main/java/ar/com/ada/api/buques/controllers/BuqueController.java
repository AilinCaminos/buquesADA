package ar.com.ada.api.buques.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuqueController {
    
    /*
     Un buque de carga traslada 100 contenedores a tres diferentes puertos del
     país. Los puertos se identifican con los números 1, 2 y 3. De cada contenedor
     que el buque traslade se registran los siguientes datos: - Identificación del
     contenedor - Peso del contenedor en kg - Puerto de arribo(un valor de 1 a 3).
     Se pide calcular e informar: 
     1) El peso total que el buque debe trasladar 
     2) La identificación del contenedor de mayor peso 
     3) La cantidad de contenedores que debe trasladar a cada puerto
*/

/*
     - Api crear/listar puertos (el punto 3 aqui)
     - Api crear/listar buque, en cada buque devolvemos el peso a llevar
     - Api crear/listar viaje
     - Api agregar contenedor al buque: si ya tiene 100-> bad request
     - Api buques/{id}/maxcontenedor para el punto 2
     - Api buques/{buqueId}/viajes/{viajeId}/viajes/maxcontenedor para el punto 2
     - Api buques/{id}/resumenPuertos para el punto 3

     Podremos agregar el concepto de VIAJE al buque
     es decir: un buque hace N viajes y cada Viaje tiene los contenedores.

     BD: Relacional: puerto, buque, viaje, contenedor
     Relaciones: puerto -< contenedor
     buque -< viaje
     viaje -< contenedor

     NoRelacional: Collecciones: puertos, buques, viajes(incluye contenedores).
     puertos y buques(dentro de cada buque, guardar los viajes y dentro de cada viaje, los contenedores)

*/
}