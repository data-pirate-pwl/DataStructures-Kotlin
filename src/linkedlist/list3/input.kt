package linkedlist.list3

fun input(node: Node?): Node? {
    var tempnode = node
    try {

        print("Enter Registration Number : ")
        tempnode?.registration_number = readLine()?.toInt()
        print("Enter Marks : ")
        tempnode?.marks = readLine()?.toDouble()
        tempnode?.next = null
    } catch (e: Exception) {
        println("Please Enter Valid Registration Number And Marks ")
        input(node)
    }
    return tempnode
}