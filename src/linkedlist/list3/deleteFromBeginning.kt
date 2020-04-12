package linkedlist.list3

fun deleteFromBeginning(root: Node?): Node? {
    if (root?.next == null)
        isEmpty = true
    return root?.next
}