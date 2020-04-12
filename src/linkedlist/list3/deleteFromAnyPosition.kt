package linkedlist.list3

fun deleteFromAnyPosition(root: Node?, reg: Int?): Node? {
    val tempnode = root
    if (tempnode?.registration_number == reg) {
        if (tempnode?.next == null)
            isEmpty = true

        return tempnode?.next
    } else if (tempnode?.next?.registration_number == reg) {
        tempnode?.next = tempnode?.next?.next
        return root
    } else {
        deleteFromAnyPosition(tempnode?.next, reg)
    }
    return root
}