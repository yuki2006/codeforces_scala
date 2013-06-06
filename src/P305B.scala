/**
 *
 */

object P311B extends App {
  var ans = readLine().split(" ");
  val size = readLine().toInt;
  var datas = readLine().split(" ").reverse;
  var frac = Array(BigInt(datas(0)), BigInt(1));
  for (i <- 1 to size - 1) {
    frac = frac.reverse;
    frac(0) = frac(1) * BigInt(datas(i)) + frac(0);
//    frac.foreach(f => print(f + " "))
//    println;
  }
  //  var g = gcd(frac(0), frac(1));

  //  for (i <- 0 to frac.length - 1) {
  //    frac.update(i, frac(i) / g);
  //  }
  //  frac.foreach(f => print(f + " "))
  // print(gcd(BigInt("565049485241691020"),BigInt("228217260073568804")))→#8答えが既約になってない！
  if (BigInt(ans(0)) * frac(1) == frac(0) * BigInt(ans(1))) {
    print("YES")
  } else {
    print("NO")
  }
  def gcd(_x: BigInt, _y: BigInt): BigInt = {
    var x = _x;
    var y = _y;
    do {
      var z = x % y;
      x = y;
      y = z;
    } while (y > 0)
    return x;
  }
}