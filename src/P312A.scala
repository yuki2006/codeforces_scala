
object P312A extends App {
  val size = readLine().toInt;
  for (_ <- 1 to size) {
    check(readLine())
  }

  def check(str: String) {
    var flag_lala = str.endsWith("lala.");
    var flag_rainbow = str.startsWith("miao.");
    if ((flag_lala ^ flag_rainbow) == false) {
      println("OMG>.< I don't know!");
    } else {
      if (flag_lala) {
        println("Freda's");
      } else {
        println("Rainbow's");
      }
    }
  }

}