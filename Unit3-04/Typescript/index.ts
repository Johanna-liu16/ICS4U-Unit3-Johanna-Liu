/*
* This program solves
* the Tower of Hanoi riddle.
*
* @author Johanna liu
* @version 1.0
* @since   2024-05-08
*/

import { createPrompt, createSelection } from 'bun-promptx'
import { hasOnlyExpressionInitializer } from 'typescript'

function hanoi(nDisks: number, startRod: number, endRod: number, otherRod: number) {
    if (nDisks == 0) {
        return
    } else {
        hanoi(nDisks-1, startRod, otherRod, endRod)
        console.log(`Move disk ${nDisks} from ${startRod} to ${endRod}`)
        hanoi(nDisks-1, otherRod, endRod, startRod)
    }
}

const startPeg = 1
const otherPeg = 2
const endPeg = 3

console.log("Tower of Hanoi")

const nOfDisks: number = createPrompt("\nHow many disks do you want?: ").value

if (isNaN(nOfDisks) || nOfDisks < 1) {
    console.log("Invalid Input")
} else {
    hanoi(nOfDisks, startPeg, endPeg, otherPeg)
}

console.log("\nDone.")