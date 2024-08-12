package kata7Kyu

// https://www.codewars.com/kata/554b4ac871d6813a03000035/kotlin
fun highAndLow(numbers: String): String {
    val listNumbers = numbers.split(" ").map { it.toInt() }
    println(listNumbers)
    return "${listNumbers.max()} ${listNumbers.min()}"
}

// https://www.codewars.com/kata/5bbb8887484fcd36fb0020ca/train/kotlin
fun catchSignChange(arr: Array<Int>): Int {
    var result = 0
    for (i in 1..<arr.size) {
        if ((arr[i - 1] < 0 && arr[i] >= 0) || (arr[i - 1] >= 0 && arr[i] < 0)) {
            result++
        }
    }
    return result
}