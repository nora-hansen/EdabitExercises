
import Foundation

func remainderList(_ arr: [Int], _ num: Int)  ->  [Int]    {
	var finalArray = [Int]()
    for i in arr {
        finalArray.append(i % num)
    }
    return finalArray;
}

print(remainderList([3,5,9,12,1], 3))
