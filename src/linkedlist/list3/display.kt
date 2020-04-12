package linkedlist.list3

fun display(data: Node?) {
    if (isEmpty) {
        print("Empty List Nothing To Show !!\n")
    } else {
        if (data?.next == null) {
            printData(data)
        } else {
            printData(data)
            display(data?.next)
        }
    }
}