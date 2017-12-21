# Python program for implementation of Insertion Sort
import sys

# main
list = map(int, sys.argv[1:len(sys.argv)])
print "Input list::", list

# Function to do insertion sort
def selectionSort(list):

    # Traverse through 1 to len(list)
    for i in range(len(list)):

        minIndex = i

        print "minIndex::", i

        for j in range(i+1, len(list)):
            if list[minIndex] > list[j]:
                minIndex = j

        # Swap the found minimum element with
        # the first element
        list[i], list[minIndex] = list[minIndex], list[i]

        print "swap::[", list[minIndex], " <--> ", list[i], "] position::[", i, " <--> ", minIndex, "]"
        print "Partial list::", list

# Driver code to test above
selectionSort(list)
print "Output list::", list
