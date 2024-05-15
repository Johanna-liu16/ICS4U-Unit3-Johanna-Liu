/*
* This program makes a triangle
*
* @author Johanna liu
* @version 1.0
* @since   2024-05-14
*/

import { createPrompt} from 'bun-promptx'

function firstTriangle(starNum: number) {
    let line = ""
    if (starNum > 1) {
        line = `*`.repeat(starNum)
        console.log(line)
        firstTriangle(starNum - 1)
    } else if (starNum == 1) {
        line = "*"
        console.log(line)
    }
}

function secondTriangle(starNum: number, counter: number) {
    let line = ``
    if (counter == 1) {
        line = `*`
        console.log(line)
        secondTriangle(starNum, counter + 1)
    } else if (counter <= starNum) {
        line = `*`.repeat(counter)
        console.log(line)
        secondTriangle(starNum, counter + 1)
    }
}

console.log("Hourglass star pattern program.")
const intInput: number = createPrompt("Enter a number: ").value

if (isNaN(intInput) || intInput < 0) {
    console.log("Invalid Input")
} else {
    let counter:number = 1
    firstTriangle(intInput)
    secondTriangle(intInput, counter)
}
console.log("\nDone.")