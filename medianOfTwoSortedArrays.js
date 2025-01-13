let nums1 = [1,2,3,4,5];
let nums2 = [6,7,8,9,10,11,12,13,14,15,16,17];

let mergedArrays = nums1.concat(nums2);
mergedArrays.sort((a, b) => a - b);

let median = 0;
let arrayMidIndex = mergedArrays.length / 2

if (mergedArrays.length % 2 === 0) {
    median = (mergedArrays[arrayMidIndex - 1] + mergedArrays[arrayMidIndex]) / 2
}
if (mergedArrays.length % 2 !== 0) {
    arrayMidIndex = Math.floor(arrayMidIndex)
    console.log(mergedArrays)
    median = mergedArrays[arrayMidIndex];
}

console.log(median);