
import Foundation

//
//  Make a function which takes a string and returns a function which returns s
//  Easy
//
func redundant(_ s: String) -> () -> String  {
    return
    {
        () -> String in
            s
    }
}
