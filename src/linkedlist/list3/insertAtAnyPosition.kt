package linkedlist.list3

fun insertAtAnyPosition(root: Node?): Node? {
    var node = root
    print("Enter Registration Number after which you want to insert data : ")
    var reg = readLine()?.toInt()
    var isSuccessful: Boolean
    while (true) {
        if (node?.registration_number == reg) {
            var tempnode = input(Node())
            tempnode?.next = node?.next
            node?.next = tempnode
            isSuccessful = true
            break
        } else {
            isSuccessful = false
            node = node?.next
        }
        if (node == null) {
            break
        }
    }
    if (isSuccessful)
        return root
    else {
        println("Inputted Registration number not found !!")
        insertAtAnyPosition(root)
    }
    return root
}