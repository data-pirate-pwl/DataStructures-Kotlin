package linkedlist.list3

fun check(root: Node?): Node? {
    println("List is already Created , Do you wish to create it again ? [y/n] : ")
    var descision = readLine()?.get(0)
    when (descision) {
        'y', 'Y' -> {
            isEmpty = true
            create(root)

        }
        'n', 'N' -> {
            println("\n------------------------------------------------------------------------------------")
            println("----------------------------- List Creation Cancelled! -----------------------------")
            println("------------------------------------------------------------------------------------")
            return root
        }
        else -> {
            print("Invalid Input !!")
            check(root)
        }
    }
    return root
}