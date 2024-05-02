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
const negativeFive = -5
const zero = 0

console.log("")
let fiveFactorial = findFactorial(five)
console.log(`5! = ${fiveFactorial}`)

console.log("")
let negFiveFactorial = findFactorial(negativeFive)
console.log(`-5! = ${negFiveFactorial}`)

console.log("")
let zeroFactorial = findFactorial(zero)
console.log(`0! = ${zeroFactorial}`)

console.log(`\nDone.`)