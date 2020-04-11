package linkedlist.list2


import kotlin.system.exitProcess

var root: Node? = null
var temp: Node? = null

fun main() {
    temp = Node()
    Input()
    root = temp

    while (true) {
        print(
            "Enter : 0 to exit\n" +
                    "      : 1 to enter another student name\n" +
                    "      : 2 to display list\n" +
                    "Input Goes Here --> "
        )
        when (readLine()?.toInt()) {
            0 -> exitProcess(0)
            1 -> process()
            2 -> display()
            else -> println("Invalid Input")
        }
    }
}

private fun display() {
    temp = root
    while (true) {
        println("Roll Number : ${temp?.roll}")
        println("Marks       : ${temp?.mark}")
        println("Grade       : ${temp?.grade}")
        if (temp?.next == null)
            break
        temp = temp?.next
    }
}

private fun process() {
    temp?.next = Node()
    temp = temp?.next
    Input()
}

private fun Input() {
    try {
        print("Enter Roll Number : ")
        temp?.roll = readLine()?.toInt()
        print("Enter Marks : ")
        temp?.mark = readLine()?.toDouble()
        print("Enter Grade : ")
        temp?.grade = readLine()?.get(0)
        temp?.next = null
    }
    catch (e:Exception)
    {
        println("Invalid Input $e")
        Input()
    }
}
