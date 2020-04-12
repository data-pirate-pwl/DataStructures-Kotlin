package linkedlist.list3

fun insertAtBeginning(root: Node?): Node? {
    var tempnode = input(Node())
    tempnode?.next = root
    return tempnode
}