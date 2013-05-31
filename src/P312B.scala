object P312B extends App {
  var str = readLine();
  var data_str = str.split(" ");
  var datas = new Array[Integer](4);
  for (i <- 0 to 3) {
    datas.update(i, data_str(i).toInt);
  }
  var p = Array(1.0 * datas(0) / datas(1),1.0 * datas(2) / datas(3));
  //無限等比数列でした。。
  var answer =p(0)/(1-(1-p(0))*(1-p(1)))
  print(answer);
}