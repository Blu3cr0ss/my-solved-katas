// https://www.codewars.com/kata/515bb423de843ea99400000a

class PaginationHelper<T>(val collection: List<T>, val itemsPerPage: Int) {
    /**
     * returns the number of items within the entire collection
     */
    val itemCount: Int
        get() = collection.size


    /**
     * returns the number of pages
     */
    val pageCount: Int
        get() = collection.size / itemsPerPage + 1 //Int округляет число в меньшую сторону, а нам надо в большую


    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    fun pageItemCount(pageIndex: Int): Int =
            if (pageIndex >= pageCount) -1
            else if (pageIndex == pageCount - 1) collection.subList(pageIndex * itemsPerPage, collection.size).size
            else collection.subList((pageIndex * itemsPerPage), (pageIndex * itemsPerPage) + itemsPerPage).size


    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    fun pageIndex(itemIndex: Int): Int =
            if (itemIndex >= itemCount || itemIndex < 0) -1
            else itemIndex / itemsPerPage
}