package capitulo04

package org

  package transporte


  package vehicles {

    import capitulo04.org.transporte.fuel.Fuel

    class Car(fuel: Fuel) {
        println("Carro criado")
      }
    }


    package fuel {
      abstract class Fuel
      class Gasoline extends Fuel
      class Alcohol extends Fuel
    }


object e14 {

  import org.transporte.vehicles.Car
  //import org.transporte.fuel.{Gasoline, Alcohol}
  import org.transporte.fuel._


  def main(args: Array[String]): Unit = {
    val gasoline = new Gasoline
    val car = new Car(gasoline)

  }

}
