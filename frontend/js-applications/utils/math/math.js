export const getFloatLength = function(num) {
    const array = num.toString().split(".");
    return array[1]?.length === undefined ? 0 : array[1].length;
}