package linkedlist.list3

fun delete(root: Node?): Node? {
    var select: Char? = null
    var reg = null as Int?
    if (isEmpty) {
        print("\n------------------------------------------------------------------------------------")
        print("\n---------------------------- No List/Empty List Exists -----------------------------")
        println("\n------------------------------------------------------------------------------------")
        main()
    }
    print(
        "\n" +
                "\n Enter : " +
                "\n       : B to delete data from beginning of list" +
                "\n       : A to delete data from any position(specific registration number)" +
                "\n       : E to delete data from end of list" +
                "\n I n p u t   G o e s   H e r e     : ---->  "
    )
    try {
        select = readLine()?.get(0)
    } catch (e: Exception) {
        println("Enter Valid Input!!")
        delete(root)
    }
    return when (select) {
        'b', 'B' -> {
            return deleteFromBeginning(root)
        }
        'a', 'A' -> {
            print("Enter The registration Number to Delete : ")
            try {
                reg = readLine()?.toInt()
            } catch (e: Exception) {
                println("Please Enter a  valid Registration Number !! ")
                delete(root)
            }
            return deleteFromAnyPosition(root, reg)
        }
        'e', 'E' -> {
            return deleteFromEnd(root)
        }
        else -> {
            print("Invalid Input !!\n")
            insert(root)
        }
    }
}