package programPackage

object substringProgram {
  /*Function takes 2 arguments, input string and length of output strings
    Function prints continuous strings in an incremental way*/
    def continuousString(Input: String, x: Int) = {
      var strLength = Input.length()
      var strIndex = 0
      var pos = 0
      while(strIndex + x <= strLength) {
        println(Input.substring(strIndex, x+pos))
        strIndex += 1
        pos += 1
      }
    }


  def main(args: Array[String]): Unit = {
    try {
      //Actual string on which the substrings to be created
      var stringInput = args(0)
      //Length of output strings to be printed
      var stringLength: Int = args(1).toInt
      substringProgram.continuousString(stringInput,stringLength)
    }
    catch {
      case e: ArrayIndexOutOfBoundsException => println("Array out of bound exception")
      case e: Exception => println(e.printStackTrace())
    }

  }

  }
