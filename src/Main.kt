import kata7Kyu.catchSignChange
import kata7Kyu.highAndLow
import kata8Kyu.invert
import specificTasks.*

fun main() {
    println(Maskify.maskify("3453454354353453"))
    println(BackspacesInString().cleanString("abc##d######"))
    println(KataCreatePhoneNumber.createPhoneNumber(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)))
    println(ZywOo.validateUsr("0124_"))
    println(KataEqualSides.findEvenIndex(intArrayOf(1, 2, 3, 4, 3, 2, 1)))
    println(invert(intArrayOf(1, -2, 3, -4, 5)))
    println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
    println(catchSignChange(arrayOf(-47,84,-30,-11,-5,74,77)))
}
