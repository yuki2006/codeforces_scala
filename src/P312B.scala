object P312B extends App {
  var str = readLine();
  var data = str.split(" ");
  var p = Array(data(0).toDouble / data(1).toDouble, data(2).toDouble / data(3).toDouble);
  //無限等比数列でした。。
  var answer = p(0) / (1 - (1 - p(0)) * (1 - p(1)))
  print(answer);
}