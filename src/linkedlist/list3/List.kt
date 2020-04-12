package linkedlist.list3

import kotlin.system.exitProcess

var temp: Node? = null
var root: Node? = null
var isEmpty: Boolean = true
fun main() {
    try {
        print(
            "\n" +
                    "\n Enter : " +
                    "\n       : 0 to exit " +
                    "\n       : 1 to create list " +
                    "\n       : 2 to insert data" +
                    "\n       : 3 to delete data" +
                    "\n       : 4 to delete list" +
                    "\n       : 5 to display list" +
                    "\n Input Goes Here   : --------> "
        )

        var input = readLine()?.get(0)

        when (input) {
            '0' -> {
                println("Want to Exit ?\nPress return key or enter Y to Confirm or any enter any other character to cancel!\n Input > ")
                try {
                    var key = readLine()?.get(0)
                    if (key == 'y' || key == 'Y') {
                        println("Exiting....")
                        exitProcess(0)
                    } else {
                        main()
                    }
                } catch (e: Exception) {
                    println("Exiting....")
                    exitProcess(0)
                }
            }
            '1' -> {
                root = create(root)
                main()
            }
            '2' -> {
                root = insert(root)
                print("\n------------------------------------------------------------------------------------")
                print("\n--------------------------- Data Inserted Successfully! ----------------------------")
                println("\n------------------------------------------------------------------------------------")

                main()
            }
            '3' -> {
                root = delete(root)
                print("\n------------------------------------------------------------------------------------")
                print("\n---------------------------- Data Deleted Successfully! ----------------------------")
                println("\n------------------------------------------------------------------------------------")
                main()
            }
            '4' -> {
                if (!isEmpty) {
                    root = null
                    isEmpty = true
                    print("\n------------------------------------------------------------------------------------")
                    print("\n---------------------------- List Deleted Successfully! ----------------------------")
                    println("\n------------------------------------------------------------------------------------")
                } else {
                    print("Empty List Nothing To Delete !!\n")
                }
                main()
            }
            '5' -> {
                print("\n------------------------------------------------------------------------------------")
                print("\n--------------------------------- Students Data ------------------------------------")
                println("\n------------------------------------------------------------------------------------")
                display(root)
                print("\n------------------------------------------------------------------------------------")
                print("\n--------------------------- Data Displayed Successfully! ---------------------------")
                println("\n------------------------------------------------------------------------------------")
                main()
            }
            else -> {
                print("Invalid Input \n")
                main()
            }
        }
    } catch (e: Exception) {
        println("Please Input a valid character !!")
        main()
    }
}