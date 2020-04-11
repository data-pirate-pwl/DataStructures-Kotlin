package linkedlist.list1

import java.util.*
import kotlin.system.exitProcess

private var temp: Node? = null
private var root: Node? = null
private var sc = Scanner(System.`in`)
fun main() {
    temp = Node()
    Input()
    root = temp
    while (true) {
        print("Enter : 0 to exit\n      : 1 to enter another student name\n      : 2 to display list\nInput Goes Here --> ")
        when (sc.nextInt()) {
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
        println(temp?.name)
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
    print("Enter Name : ")
    temp?.name = sc.next()
    temp!!.next = null
}