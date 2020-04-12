package linkedlist.list3

fun deleteFromEnd(root: Node?): Node? {
    var node = root
    if (node?.next == null) {
        isEmpty = true
        return null
    } else if (node.next?.next == null) {
        node.next = null
        return root
    } else {
        deleteFromEnd(node.next)
    }
    return root
}