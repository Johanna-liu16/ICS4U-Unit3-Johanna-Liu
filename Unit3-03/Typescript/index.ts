/*
* This program generates 250 random numbers in an array
* and allows the user to search the array for a number.
*
* @author  Johanna Liu
* @version 0.5
* @since   2024-05-05
*/

import { createPrompt, createSelection } from 'bun-promptx'
function binarySearch(userArray: number[], userNumber: number, lowIndex: number, highIndex: number) {
    const half = Math.floor((lowIndex + highIndex) / 2)

    if (lowIndex > highIndex) {
      return -1
    } else if (userArray[half] == userNumber) {
      return half
    } else if (userArray[half] > userNumber) {
      return binarySearch(userArray, userNumber, lowIndex, half - 1)
    } else if (userArray[half] < userNumber) {
      return binarySearch(userArray, userNumber, half + 1, highIndex)
    }
  }

const min = 0
const max = 999
const arraySize = 50

console.log("Binary Search Program")

// create random array
let randomNumbers = Array.from({length: arraySize}, () => Math.floor(Math.random() * max))

// Sort the array
let sortedArray = randomNumbers.sort(function (a, b) {  return a - b;  })

// output
console.log("Sorted list of numbers: ")
console.log(sortedArray.slice(0, 50).join(`, `))

console.log(`\n`)

// get user input
console.log("What number are you looking for?")
const userInput = prompt("Pick an integer between 0 - 999: ")
const intInput : number = parseInt(userInput)

if (intInput > max || intInput < min) {
    console.log("Invalid Input")
} else { 
    // call function binarySearch
    const result = binarySearch(sortedArray, intInput, 0, sortedArray.length - 1)

    console.log("")
    console.log(`That number is in index: ${result}.`)
}