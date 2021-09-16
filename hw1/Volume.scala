package cs2.hw1

class Volume {
  //Field - the volume stored in LITERS
  private var lit:Double = 0.0

  //Basic math operators to add, subtract, and scale volumes
  def + (other:Volume):Volume = { new Volume (this.Volume + other.Volume) }
  def += (other:Volume):Unit  = { 
    this.Volume += other.Volume
  }

  def - (other:Volume):Volume = { new Volume (this.Volume - other.Volume) }
  def -= (other:Volume):Unit  = {
    this.Volume = this.Volume - other
  }

  def * (scalar:Double):Volume = { new Volume (this.Volume * scalar) }
  def *= (scalar:Double):Unit  = {
    this.Volume = this.Volume * scalar
  }

  def / (scalar:Double):Volume = { new Volume (this.Volume / scalar) }
  def /= (scalar:Double):Unit  = {
    this.Volume = this.Volume / scalar
  }

  //Getter functions that return in a variety of units
  def liters():Double = { this.Volume }
  def milliliters():Double = { liters() * 1000 }
  def gallons():Double = { liters() / 3.78541 }
  def quarts():Double = { gallons() * 4 }
  def pints():Double = { quarts() * 2 }
  def cups():Double = { pints() * 2 }
  def teaspoons():Double = { cups() * 48 }
  def tablespoons():Double = { teaspoons() / 3 }
}
/*
object Volume {
  //"Constructor" apply methods operating in liters
  def apply():Volume = { 
    val v = new Volume() 
  }
  def apply(amt:Double):Volume = { 
    val v = new Volume(amt) 
  }

  //Alternative "static" methods to create volumes in other units
  def liters(amt:Double):Volume = {val v = new Volume()} //identical to an apply method
  def milliliters(amt:Double):Volume = { 
    var v = new Volume
    v = milliliters(v) }
  def gallons(amt:Double):Volume = { 
    var v = new Volume
    v = gallons(v)
   }
  def quarts(amt:Double):Volume = { 
    var v = new Volume
    v = quarts(v)
   }
  def pints(amt:Double):Volume = { 
    var v = new Volume
    v = pints(v)
   }
  def cups(amt:Double):Volume = { 
    var v = new Volume
    v = cups(v)
   }
  def teaspoons(amt:Double):Volume = { 
    var v = new Volume
    v = teaspoons(v)
   }
  def tablespoons(amt:Double):Volume = { 
    var v = new Volume.tablespoons(v)
   }
}
*/