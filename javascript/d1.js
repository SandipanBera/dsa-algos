const addTwo = (nums, target) => {
    for (let i = 0; i <= nums.length - 1; i++) {
        for (let j = i+1; j <= nums.length-1; j++) {
            if (target === nums[i] + nums[j]) {
                return [i, j];
            }
            
        }
    }
}
let nums = [3,2,4];
let target = 6;
const result=addTwo(nums, target);
console.log(result);

