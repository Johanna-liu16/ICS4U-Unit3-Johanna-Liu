/**
 *
 * This program uses stacks
 *
 * By:      Johanna Liu
 * Version: 1.0
 * Since:   2024-03-19
 */

// function reverses string
function findFactorial(factorialAnswer: number): number {
    if (factorialAnswer < 0) {
        return -1
    } else {
        if (factorialAnswer == 1) {
            return 1
        } else {
            return (factorialAnswer * findFactorial(factorialAnswer - 1))
        }
    }
}

const five = 5
const two = 2
const seven = 7

console.log("")
let fiveFactorial = findFactorial(five)
console.log(`5! = ${fiveFactorial}`)

console.log("")
let twoFactorial = findFactorial(two)
console.log(`5! = ${twoFactorial}`)

console.log("")
let sevenFactorial = findFactorial(seven)
console.log(`5! = ${sevenFactorial}`)

console.log(`\nDone.`)