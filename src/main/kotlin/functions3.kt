fun main() {
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }

    val dirty2 = updateDirty(20, ::increaseDirty)

    println(updateDirty(dirty2, waterFilter))
}



fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun increaseDirty( start: Int ) = start + 10


