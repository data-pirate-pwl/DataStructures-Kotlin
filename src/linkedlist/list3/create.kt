package linkedlist.list3

fun create(root: Node?): Node? {
    if (isEmpty) {
        temp = input(Node())
        isEmpty = false
        println("\n------------------------------------------------------------------------------------")
        println("---------------------------- List Created Successfully! ----------------------------")
        println("------------------------------------------------------------------------------------")
        return temp
    } else {
        return check(root)
    }
}