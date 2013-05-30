object P313A extends App {
  var i = readLine.toInt;
  //一番後ろを消す。
  var j = i / 10;
  // 後ろから２番めを消す
  var k = (i / 100) * 10 + i % 10;
  var ans = Math.max(i, Math.max(j, k))
  print(ans);
}