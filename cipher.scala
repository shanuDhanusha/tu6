
object question01 extends App {

  import scala.io.StdIn.readLine;

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  //println(alphabet.indexOf("A"))

  val Encryption=(c:Char,key:Int,alphabet:String) =>  alphabet((alphabet.indexOf(c.toUpper)+key)%alphabet.size)

  val Decryption=(c:Char,key:Int,alphabet:String) =>  alphabet((alphabet.indexOf(c.toUpper)-key)%alphabet.size)

  val cipher=(algo:(Char,Int,String)=>
    Char,s:String,key:Int,alphabet:String) =>
    s.map(algo(_,key,alphabet))

  print("Enter the string : ");
  val source = readLine();

  val cipherText=cipher(Encryption,source,1,alphabet)

  val plainText=cipher(Decryption,cipherText,1,alphabet)

  printf("Encryption value : %s",cipherText);
  println();
  printf("Decryption value : %s",plainText);
}
