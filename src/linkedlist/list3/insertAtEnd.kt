package linkedlist.list3


fun insertAtEnd(tempnode: Node?): Node? {
    if (tempnode?.next == null) {
        tempnode?.next = input(Node())
    } else {
        insertAtEnd(tempnode?.next)
    }
    return root
}