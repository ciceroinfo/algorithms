# Python program for implementation of Insertion Sort
import sys

# main
list = map(int, sys.argv[1:len(sys.argv)])
print "Input list::", list

# Function to do insertion sort
def insertionSort(list):

    # Traverse through 1 to len(list)
    for i in range(1, len(list)):

        print
        insertionValue = list[i]

        print "iteration::", i, "::InsertionSort::", insertionValue

        position = i

        # Move elements of list[0..i-1], that are
        # greater than insertionValue, to one position ahead
        # of their current position
        while position > 0 and list[position-1] > insertionValue :
            print "swap::[", list[position -1], " --> ", list[position], "] position::[", position, "]"

            #swap
            list[position] = list[position-1]
            position -= 1

        print "swap::[", list[position], " <-- ", insertionValue, "] position::[", position, "]"

        #swap Insertion Value to correct position
        list[position] = insertionValue

        print "Partial list::", list

# Driver code to test above
insertionSort(list)
print "Output list::", list
