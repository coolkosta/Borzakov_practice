package kata8Kyu

// https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/train/kotlin
fun invert(arr: IntArray): IntArray {
    return arr.map { num -> -num }.toIntArray()
}

// https://www.codewars.com/kata/5b853229cfde412a470000d0/train/kotlin
fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
    var result = 0
    var twiceYearsSon = sonYearsOld * 2
    if (dadYearsOld > twiceYearsSon) {
        while (dadYearsOld > twiceYearsSon) {
            twiceYearsSon ++
            result ++
        }
    } else {
        while (dadYearsOld < twiceYearsSon){
            twiceYearsSon --
            result++
        }
    }
    return result
}

