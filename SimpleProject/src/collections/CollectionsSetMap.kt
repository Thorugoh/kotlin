package collections

fun main(){
    // set
    val set = setOf(1, 2, 3, 3, 2)
    val setRandom = setOf(1, 2, 3, "kotlin", "kotlin", 4.0, 0..100, 1, 2, 19, "kotlin2")
    println(set)

    println(setRandom)
    // setRandom[1] -> not able to access a set position

    val setMutable = mutableSetOf("1", 2, 3, "kotlin", 2, 3)
    setMutable.add(10)
    setMutable.remove(2)

    println(setMutable)

    // Map, commonly known as dictionary of key values
    val map = mapOf<Int, String>(Pair(1, "kotlin"), 1 to "kotlin2", 2 to "kotlin1")
    println(map)
    println(map.keys)
    println(map.values)
    println(map.entries)

    val mutableMap = mutableMapOf(1 to "kotlin", "kotlin" to 1, 1.0 to 0, 0..10 to 1)
    mutableMap[4] = "new"
    println(mutableMap)

    // Both hashmap and hashset are mutable
    val hashMap = hashMapOf(1 to "kotlin", "a" to "abc")
    println(hashMap)
}