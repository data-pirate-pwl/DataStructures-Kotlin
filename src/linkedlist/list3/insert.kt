package linkedlist.list3

fun insert(root: Node?): Node? {
    var select: Char? = null
    if (isEmpty) {
        print("\n------------------------------------------------------------------------------------")
        print("\n---------------------------- No List/Empty List Exists -----------------------------")
        println("\n------------------------------------------------------------------------------------")
        main()
    }
    print(
        "\n" +
                "\n Enter : " +
                "\n       : B to insert data in beginning of list" +
                "\n       : A to insert data at any position(after specific registration number)" +
                "\n       : E to insert data at end of list" +
                "\n I n p u t   G o e s   H e r e     : ---->  "
    )
    try {
        select = readLine()?.get(0)
    } catch (e: Exception) {
        println("Enter Valid Input!!")
        insert(root)
    }
    return when (select) {
        'b', 'B' -> {
            insertAtBeginning(root)
        }
        'a', 'A' -> {
            insertAtAnyPosition(root)
        }
        'e', 'E' -> {
            insertAtEnd(root)
        }
        else -> {
            print("Invalid Input !!\n")
            insert(root)
        }
    }
}