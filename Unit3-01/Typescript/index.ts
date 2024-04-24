/**
 *
 * This program uses stacks
 *
 * By:      Johanna Liu
 * Version: 1.0
 * Since:   2024-03-19
 */

// function reverses string
function reverseString(stringToReverse: string): string {
    if (stringToReverse == "") {
        return ""
    } else {
        let firstChar = stringToReverse.charAt(0)
        let restOfString = stringToReverse.slice(1, stringToReverse.length)
        return reverseString(restOfString) + firstChar
    }
}

const aString = "recusrsion"

console.log("")
console.log(`The original string is ${aString}`)
let reversedString = reverseString(aString)
console.log(`The reversed string is ${reversedString}`)

console.log(`\nDone.`)
