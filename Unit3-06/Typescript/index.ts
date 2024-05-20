/*
* This program sorts random array
*
* @author  Johanna Liu
* @version 0.5
* @since   2024-05-20
*/
function mergeSort(sortArray: number[]): number[] {
  
   // Merges two arrays together.
  function merge(left: number[], right: number[]): number[] {
    let sortArray: number[] = []

    while (left.length && right.length) {
      if (left[0] < right[0]) {
        sortArray.push(left.shift())
      } else {
        sortArray.push(right.shift())
      }
    }

    return [...sortArray, ...left, ...right]
  }
  const mid = sortArray.length / 2

  if (sortArray.length < 2) {
    return sortArray
  }

  const left = sortArray.splice(0, mid)
  return merge(mergeSort(left), mergeSort(sortArray))
}

const arraySize = 5
const max = 99

console.log("Binary Search Program")

// create random array
const randomNumbers = Array.from({length: arraySize}, () => Math.floor(Math.random() * max))
console.log("")
console.log(`Random Array: ${randomNumbers.slice(0, 5).join(', ')}`)

// Sort the array
const sortedArray: number[] = mergeSort(randomNumbers)

// output
console.log("")
console.log("Sorted list of numbers: ")
console.log(sortedArray.slice(0, 50).join(`, `))

console.log(`\nDone.`)